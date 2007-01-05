//The contents of this file are subject to the Mozilla Public License Version 1.1
//(the "License"); you may not use this file except in compliance with the 
//License. You may obtain a copy of the License at http://www.mozilla.org/MPL/
//
//Software distributed under the License is distributed on an "AS IS" basis,
//WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License 
//for the specific language governing rights and
//limitations under the License.
//
//The Original Code is "The Columba Project"
//
//The Initial Developers of the Original Code are Frederik Dietz and Timo Stich.
//Portions created by Frederik Dietz and Timo Stich are Copyright (C) 2003. 
//
//All Rights Reserved.

package org.columba.core.main;

import java.io.File;
import java.io.FilenameFilter;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLClassLoader;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.ParseException;
import org.columba.core.backgroundtask.BackgroundTaskManager;
import org.columba.core.config.Config;
import org.columba.core.gui.frame.FrameModel;
import org.columba.core.gui.themes.ThemeSwitcher;
import org.columba.core.gui.util.FontProperties;
import org.columba.core.gui.util.StartUpFrame;
import org.columba.core.logging.ColumbaLogger;
import org.columba.core.plugin.PluginHandlerNotFoundException;
import org.columba.core.plugin.PluginManager;
import org.columba.core.pluginhandler.ComponentPluginHandler;
import org.columba.core.profiles.Profile;
import org.columba.core.profiles.ProfileManager;
import org.columba.core.session.SessionController;
import org.columba.core.shutdown.SaveConfig;
import org.columba.core.shutdown.ShutdownManager;
import org.columba.core.trayicon.ColumbaTrayIcon;
import org.columba.core.util.GlobalResourceLoader;
import org.columba.core.util.OSInfo;

import sun.misc.URLClassPath;

/**
 * Columba's main class used to start the application.
 */
public class Main {
	/** If true, enables debugging output from org.columba.core.logging */
	public static boolean DEBUG = false;

	private static final Logger LOG = Logger.getLogger("org.columba.core.main");

	private static final String RESOURCE_PATH = "org.columba.core.i18n.global";

	private static Main instance;

	private String path;

	private boolean showSplashScreen = true;

	private boolean restoreLastSession = true;

	private Main() {
	}

	public static Main getInstance() {
		if (instance == null) {
			instance = new Main();
		}

		return instance;
	}

	public static void main(String[] args) throws Exception {
		addNativeJarsToClasspath();
		setLibraryPath();
		
		Main.getInstance().run(args);
	}

	/**
	 * This hacks the classloader to adjust the library path
	 * for convinient native support.
	 * 
	 * @author tstich
	 * 
	 * @throws Exception
	 */
	private static void setLibraryPath() throws Exception {		
		if( OSInfo.isLinux() ) {
			System.setProperty("java.library.path", System.getProperty("java.library.path") + ":native/linux/lib");		
		} else if (OSInfo.isWin32Platform()) {
			System.setProperty("java.library.path", System.getProperty("java.library.path") + ";native\\win32\\lib");		
		}
		// Platform maintainers: add your platform here
		
		
		Field fieldSysPath = ClassLoader.class.getDeclaredField("sys_paths");
		fieldSysPath.setAccessible(true);
		if (fieldSysPath != null) {
		fieldSysPath.set(System.class.getClassLoader(), null);
		}		
	}
	
	/**
	 * This hacks the classloader to adjust the classpath
	 * for convinient native support.
	 * 
	 * @author tstich
	 * 
	 * @throws Exception
	 */
	private static void addNativeJarsToClasspath() throws Exception {
		File nativeDir;
		
		// Setup the path
		// Platform maintainers: add your platform here
		if( OSInfo.isLinux() ) {
			nativeDir = new File("native/linux/lib");
		} else if (OSInfo.isWin32Platform()) {
			nativeDir = new File("native/win32/lib");
		} else {
			throw new Exception("Platform not supported!");
		}
		
		
		// Find all native jars
		File[] nativeJars = nativeDir.listFiles(new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return name.endsWith("jar");
			}
		});
		if( nativeJars == null ) return;		
		
		// Get the current classpath from the sysloader
		// through reflection
		URLClassLoader sysloader = (URLClassLoader)ClassLoader.getSystemClassLoader();
		Class sysclass = URLClassLoader.class;
		
		Field ucp = URLClassLoader.class.getDeclaredField("ucp");
		ucp.setAccessible(true);
		URLClassPath currentCP = (URLClassPath) ucp.get(sysloader);
		URL[] currentURLs = currentCP.getURLs();
		
		// add all native jars
		List urlList = new ArrayList();
		for( int i=0; i<nativeJars.length; i++) {
			urlList.add(nativeJars[i].toURL());
		}

		// add the old classpath
		for( int i=0; i<currentURLs.length; i++) {
			urlList.add(currentURLs[i]);
		}		
		
		// replace with the modified classpath
		ucp.set(sysloader, new URLClassPath((URL[])urlList.toArray(new URL[0])));		
	}
		
	public void run(String args[]) {
		ColumbaLogger.createDefaultHandler();
		registerCommandLineArguments();

		handle_commandline_parameters(args);

		Profile profile = prompt_user_for_profile();

		initial_configuration_with_selected_profile(profile);

		initialize_default_logging(args);
		
		SessionController.passToRunningSessionAndExit(args);

		// enable debugging of repaint manager to track down swing gui
		// access from outside the awt-event dispatcher thread
		/*
		if (Main.DEBUG)
			RepaintManager.setCurrentManager(new DebugRepaintManager());
			*/
		
		StartUpFrame frame = show_splash_screen();
		
		// Add the tray icon to the System tray
		ColumbaTrayIcon.getInstance().addToSystemTray();

		register_protocol_handler();

		load_user_customized_language_pack();

		ComponentPluginHandler handler = initialize_plugins();

		load_available_plugins();

		set_look_and_feel();

		init_font_configuration();

		set_application_wide_font();

		handle_command_line_arguments(handler);

		restore_frame_of_last_session();

		hide_splash_screen(frame);
		
		post_startup_of_the_modules(handler);
		
		
	}

	private void post_startup_of_the_modules(ComponentPluginHandler handler) {
		// call the postStartups of the modules
		// e.g. check for default mailclient
		handler.postStartup();
	}

	private void hide_splash_screen(StartUpFrame frame) {
		// hide splash screen
		if (frame != null) {
			frame.setVisible(false);
		}
	}

	private void restore_frame_of_last_session() {
		// restore frames of last session
		if (restoreLastSession) {
			FrameModel.getInstance().openStoredViews();
		}
	}

	private void handle_command_line_arguments(ComponentPluginHandler handler) {
		// handle the commandline arguments of the modules
		handler.handleCommandLineParameters(ColumbaCmdLineParser.getInstance()
				.getParsedCommandLine());
	}

	private void set_application_wide_font() {
		// set application wide font
		FontProperties.setFont();
	}

	private void init_font_configuration() {
		// init font configuration
		new FontProperties();
	}

	private void set_look_and_feel() {
		// set Look & Feel
		ThemeSwitcher.setTheme();
	}

	private void load_available_plugins() {
		// now load all available plugins
		PluginManager.getInstance().initPlugins();
	}

	private ComponentPluginHandler initialize_plugins() {
		SaveConfig task = new SaveConfig();
		BackgroundTaskManager.getInstance().register(task);
		ShutdownManager.getShutdownManager().register(task);
		
		ComponentPluginHandler handler = null;
		try {
			handler = (ComponentPluginHandler) PluginManager.getInstance()
					.getHandler("org.columba.core.component");
		} catch (PluginHandlerNotFoundException e) {
			e.printStackTrace();
		}

		// init all components
		handler.init();
		return handler;
	}

	private void load_user_customized_language_pack() {
		// load user-customized language pack
		GlobalResourceLoader.loadLanguage();
	}

	private void register_protocol_handler() {
		// register protocol handler
		System.setProperty("java.protocol.handler.pkgs", "org.columba.core.url|"+System.getProperty(
				"java.protocol.handler.pkgs", "")
				);
	}

	private StartUpFrame show_splash_screen() {
		// show splash screen
		StartUpFrame frame = null;
		if (showSplashScreen) {
			frame = new StartUpFrame();
			frame.setVisible(true);
		}
		return frame;
	}

	private void initialize_default_logging(String[] args) {
		// if user doesn't overwrite logger settings with commandline arguments
		// just initialize default logging
		ColumbaLogger.createDefaultHandler();
		ColumbaLogger.createDefaultFileHandler();

		for ( int i=0; i<args.length; i++) {
			LOG.info("arg["+i+"]="+args[i]);
		}
	}

	private void initial_configuration_with_selected_profile(Profile profile) {
		// initialize configuration with selected profile
		new Config(profile.getLocation());
	}

	private Profile prompt_user_for_profile() {
		// prompt user for profile
		Profile profile = ProfileManager.getInstance().getProfile(path);
		return profile;
	}

	private void handle_commandline_parameters(String[] args) {
		// handle commandline parameters
		if (handleCoreCommandLineParameters(args)) {
			System.exit(0);
		}
	}
	
	/**
	 *  
	 */
	private void registerCommandLineArguments() {
		ColumbaCmdLineParser parser = ColumbaCmdLineParser.getInstance();

		parser.addOption(new Option("version", GlobalResourceLoader.getString(
				RESOURCE_PATH, "global", "cmdline_version")));

		parser.addOption(new Option("help", GlobalResourceLoader.getString(
				RESOURCE_PATH, "global", "cmdline_help")));

		parser.addOption(OptionBuilder.withArgName("name_or_path").hasArg()
				.withDescription(
						GlobalResourceLoader.getString(RESOURCE_PATH, "global",
								"cmdline_profile")).create("profile"));

		parser.addOption(new Option("debug", GlobalResourceLoader.getString(
				RESOURCE_PATH, "global", "cmdline_debug")));

		parser.addOption(new Option("nosplash", GlobalResourceLoader.getString(
				RESOURCE_PATH, "global", "cmdline_nosplash")));

		ComponentPluginHandler handler = null;
		try {
			handler = (ComponentPluginHandler) PluginManager.getInstance()
					.getHandler("org.columba.core.component");
			handler.registerCommandLineArguments();
		} catch (PluginHandlerNotFoundException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Uses the command line parser to validate the passed arguments and invokes
	 * handlers to process the detected options.
	 */
	private boolean handleCoreCommandLineParameters(String[] args) {
		ColumbaCmdLineParser parser = ColumbaCmdLineParser.getInstance();
		CommandLine commandLine;

		try {
			commandLine = parser.parse(args);
		} catch (ParseException e) {
			// oops, something went wrong
			System.err.println("Parsing failed.  Reason: " + e.getMessage());
			parser.printUsage();

			return true;
		}

		if (commandLine.hasOption("help")) {
			parser.printUsage();

			return true;
		}

		if (commandLine.hasOption("version")) {
			System.out.println(MessageFormat.format(GlobalResourceLoader
					.getString(RESOURCE_PATH, "global", "info_version"),
					new Object[] { VersionInfo.getVersion(),
							VersionInfo.getBuildDate() }));

			return true;
		}

		if (commandLine.hasOption("profile")) {
			path = commandLine.getOptionValue("profile");
		}

		if (commandLine.hasOption("debug")) {
			DEBUG = true;
			ColumbaLogger.setDebugging(true);			
		}

		if (commandLine.hasOption("nosplash")) {
			showSplashScreen = false;
		}

		// Do not exit
		return false;
	}

	/**
	 * @param restoreLastSession
	 *            The restoreLastSession to set.
	 */
	public void setRestoreLastSession(boolean restoreLastSession) {
		this.restoreLastSession = restoreLastSession;
	}
}