package edu.toronto.cs.ome.eclipse;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import javax.swing.JInternalFrame;
import javax.swing.SwingUtilities;
import javax.swing.UnsupportedLookAndFeelException;

import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;

import edu.toronto.cs.ome.OMETab;
import edu.toronto.cs.ome.view.GraphicViewFrame;

public class Editor extends EditorPart {
	/**
	 * @param input
	 * @throws MalformedURLException
	 * @throws CoreException
	 * @throws MalformedURLException
	 * @throws UnsupportedLookAndFeelException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 * @throws ClassNotFoundException
	 */
	public static JInternalFrame startOpenOME(String input) throws MalformedURLException {
		String path = getPluginInstallPath();
		System.setProperty("java.library.path", path);
		System.setProperty("tmpDir", "" + Plugin.getPlugin().getStateLocation());
//		System.out.println(System.getProperty("tmpDir"));
		System.setProperty("cmdDot",  Plugin.getResourceString("dot"));
		System.setProperty("fitDot", "false");
		System.setProperty("ome.eclipse", "true");
		String model = input;
		OMETab ot = new OMETab();
		OMETab.inProtege = false;
		System.setProperty("model", model);
		ot.createWidgets();
		OMETab.inProtege = true;
		OMETab.setFrame(OMETab.iframe);
		SwingUtilities.updateComponentTreeUI(OMETab.iframe);
		OMETab.iframe.setDoubleBuffered(true);
		OMETab.iframe.setFocusable(true);
		OMETab.iframe.setIgnoreRepaint(false);
		return OMETab.iframe;
	}
	
	private static String getPluginInstallPath() {
		// deprecated in 3.1.0? 		
		// FIXME: the path is not found when the
		// plugin is not installed under SDK's default
		// plugin directory
		URL url = Plugin.getPlugin().getDescriptor().getInstallURL();
		String plugin_name = url.getFile();
		try {
			URL u = Platform.asLocalURL(url);
			return u.getPath() +
			"lib/plugins/edu.toronto.cs.ome";
		} catch (IOException e) {
			return url.getPath() + 
			plugin_name.replaceAll("/plugin","plugins") + "lib/plugins/edu.toronto.cs.ome";
		}
	}

	/**
	 * Shows a message and activity indicator in the SWT label space. 
	 */
	class AnimatedMsgThread extends Thread {
		final char[] rotoChars = new char[] {'\\', '|', '/', '-'};
		String l = null;
		boolean done = false;
		public AnimatedMsgThread(String label) {
			super("AnimatedMsgThread");
			setDaemon(true);
			this.l = label;
		}
		public void run() {
			int r = 0;
			// Give it a second (literally) to see if the operation completes
			// before starting the animation ...
			try {
				sleep(1000);
			} catch (InterruptedException e) {
			}
			// Start simple animation ... update every .5 seconds
			try {
				while (!done) {
					final char ch = rotoChars[r = (++r == rotoChars.length) ? 0 : r];
					if (display != null)
						display.asyncExec(new Runnable() {
							public void run() {
								if (!done)
									showLabel(new StringBuffer(128)
										.append("      ").append(ch).append('\t')
										.append(l).toString());
							}
						});
					sleep(500);
				}
			} catch (InterruptedException e) {
			}
		}
		public void end() {
			done = true;
		}
	}

	/**
	 * Provides access to the AWT frame to display swing-based controls.
	 */
	class SwingFrameAccess extends Frame implements ActionListener {
		private static final long serialVersionUID = 2443544142025855633L;
		public JInternalFrame p = null;
		private Frame f = null;
		private boolean disposed = false;
		
		public SwingFrameAccess() {
			display.syncExec(new Runnable() {
				public void run() {
					f = SWT_AWT.new_Frame(getSWTSwingContainer());
				}
			});
		}
		public void actionPerformed(ActionEvent e) {
			System.out.println("event");
		}
		public void dispose() {
			if (!disposed)
				try {
					if (f != null && display != null)
						display.asyncExec(new Runnable() {
							public void run() {
								if (f != null) f.dispose();
							}
						});
					if (p != null)
						p.dispose();
				} catch (Exception e) {
					Plugin.log(IStatus.ERROR, "Error disposing graph frame.", e);
				} finally {
					p = null;
					disposed = true;
				}
		}
		public Frame getFrame() {
			return f;
		}
		public void init() throws SwingInitException {
			try {
				final IFileEditorInput input = (IFileEditorInput) getEditorInput();
				if (input != null) {
					Collection errs = new ArrayList();
					IResourceChangeListener listener = new MyResourceChangeReporter(Editor.this);
					ResourcesPlugin.getWorkspace().addResourceChangeListener(
					      listener, IResourceChangeEvent.POST_CHANGE);
					p = startOpenOME(input.getFile().getRawLocation().toString());
					if (p!=null) {
						f.setLayout(new java.awt.BorderLayout());
						f.add(p, "Center");
						f.addWindowListener(new WindowAdapter() {
							public void windowClosing(WindowEvent event) {
								super.windowClosing(event);
								OMETab.iframe = null;
								dispose();
							}
						});
						f.pack();
					}
					if (!disposed) {
						if (!errs.isEmpty()) {
							for (Iterator errIt = errs.iterator(); errIt.hasNext(); )
								Plugin.log(IStatus.ERROR, errIt.next().toString());
							display.syncExec(new Runnable() {
								public void run() {
									MessageDialog.openError(getSite().getShell(), "Error",
										"Errors occurred initializing the OpenOME project. Refer to the error log for additional information.");
								}
							});
						}
					}
				}
			} catch (Exception e) {
				if (!disposed) {
					if (display != null)
						display.syncExec(new Runnable() {
							public void run() {
								MessageDialog.openError(getSite().getShell(), "Error",
									"Errors occurred initializing the OpenOME project. Refer to the error log for additional information.");
							}
						});
					showLabelSync(MSG_OPENERR);
					e.printStackTrace();
//					throw new SwingInitException(e);
				}
			}
		}
		public boolean isDisposed() {
			return disposed;
		}
	}
	
	/**
	 * Used to surface errors that occur during frame initialization. 
	 */
	class SwingInitException extends Exception {
		private static final long serialVersionUID = -524079123364465624L;
		public SwingInitException() {
			super();
		}
		public SwingInitException(String message) {
			super(message);
		}
		public SwingInitException(Throwable cause) {
			super(cause);
		}
		public SwingInitException(String message, Throwable cause) {
			super(message, cause);
		}
	}

	/**
	 * Shows the Swing controls and handles interruption. 
	 */
	class SwingInitThread extends Thread {
		public AnimatedMsgThread animatedMsg = null;
		public boolean canceled = false;
		
		public SwingInitThread() {
			super();
			setPriority(Thread.MAX_PRIORITY);
			setDaemon(true);
		}
		public void destroy() {
			if (animatedMsg != null)
				animatedMsg.end();
			showLabelSync("");
		}
		public void interrupt() {
			if (!canceled)
				try {
					canceled = true;
					super.interrupt();
				} finally {
					destroy();
				}
		}
		public synchronized void run() {
			try {
				showLabelSync("");
				animatedMsg = new AnimatedMsgThread(MSG_OPENING);
				animatedMsg.start();
				// Reset the frame ...
				Frame sf = null;
				try {
					sf = getSwingFrame();
				} finally {
					animatedMsg.end();
				}
				// Display the result ...
				if (canceled || sf == null) {
					showLabelSync("");
				} else {
					if (sfa.p!=null)
						sfa.p.requestFocusInWindow();
					sf.setVisible(true);
					showSwingSync();
				}
			} catch (Exception e) {
				Plugin.log(IStatus.ERROR,
					"An error occurred initializing the relation graph.", e);
			}
		}
	}

	/**
	 * Primary class ...
	 */
	static final private String MSG_OPENERR = "Unable to open the requested resource. Refer to the error log for additional information.";
	static final private String MSG_OPENING = "Opening OpenOME ...";
	
	private Display display;
	private Composite displayArea, swtSwingContainer;
	public SwingFrameAccess sfa;
	private SwingInitThread siThread;
	private Label label;

	public Editor() {
	}
	protected void createLabel() {
		label = new Label(displayArea, SWT.BORDER | SWT.WRAP);
	}
	protected void createLayout() {
		displayArea.setLayout(new StackLayout());
	}
	protected void detachCurrentProjectTab() {
	}
	public void dispose() {
		disposeSwing();
		if (label != null) label.dispose();
		super.dispose();
	}
	protected void disposeSwing() {
		disposeSwingThread();
		if (sfa != null)
			try { sfa.dispose(); }
				finally { sfa = null; }
	}
	protected void disposeSwingThread() {
		if (siThread != null)
			siThread.interrupt();
		siThread = null;
	}
	protected Composite getSWTSwingContainer() {
		if (swtSwingContainer == null && display != null && !display.isDisposed())
			display.syncExec(new Runnable() {
				public void run() {
					swtSwingContainer = new Composite(displayArea, SWT.EMBEDDED);
				}
			});
		return swtSwingContainer;
	}
	protected Frame getSwingFrame() {
		if (sfa == null || sfa.isDisposed() && display != null && !display.isDisposed()) {
			sfa = new SwingFrameAccess();
			try {
				sfa.init();
			} catch (SwingInitException e) {
				Plugin.log(IStatus.ERROR,
					"An error occurred initializing the Swing frame.", e);
				sfa = null;
			}
		}
		return sfa != null ? sfa.getFrame() : null;
	}
	protected synchronized Thread getSwingInitThread() {
		if (!isSwingInitInProgress()) {
			siThread = new SwingInitThread();
			siThread.setName(getClass().getName());
		}
		return siThread;
	}
	protected boolean isSwingInitInProgress() {
		return siThread != null && siThread.isAlive();
	}
	protected void logInfo(String msg) {
		Plugin.log(IStatus.INFO, msg);
	}
	public void propertyChanged(Object source, int propId) {
		System.out.println("propertyChanged");
		if (OMETab.iframe!=null)
			SwingUtilities.updateComponentTreeUI(OMETab.iframe);
	}
	protected void showSwing() {
		if (!displayArea.isDisposed()) {
			Composite swingContainer = getSWTSwingContainer();
			((StackLayout) displayArea.getLayout())
				.topControl = swingContainer;
			// Note: The following appears to help avoid a sporatic
			// repaint problem (controls are created but are
			// not initially visible).
			swingContainer.pack();
			swingContainer.layout();
			// Layout the controls ...
			displayArea.layout();
			readAndDispatch();
		}
	}
	protected void showSwingSync() {
		if (display != null && !display.isDisposed())
			display.syncExec(new Runnable() {
				public void run() {
					showSwing();
				}
			});
	}
	protected void showLabel(final String labelText) {
		if (!label.isDisposed()) {
			label.setText(labelText);
			((StackLayout) displayArea.getLayout()).topControl = label;
			displayArea.layout();
			readAndDispatch();
		}
	}
	protected void showLabelSync(final String labelText) {
		if (display != null && !display.isDisposed())
			display.syncExec(new Runnable() {
				public void run() {
					showLabel(labelText);
				}
			});
	}
	protected void readAndDispatch() {
		while (display != null && !display.isDisposed()
			&& display.readAndDispatch());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createPartControl(Composite parent) {
		displayArea = parent;
		createLayout();
		createLabel();
//		parent.setFocus();
	}
	/* (non-Javadoc)
	 * @see org.eclipse.ui.ISaveablePart#doSave(org.eclipse.core.runtime.IProgressMonitor)
	 */
	public void doSave(IProgressMonitor monitor) {
		if (sfa != null && sfa.p != null) {
			Collection errs = new ArrayList();
			if (errs.isEmpty()) {
				getSite().getWorkbenchWindow().setActivePage(getSite().getWorkbenchWindow().getActivePage());
			} else {
				for (Iterator errIt = errs.iterator(); errIt.hasNext(); )
					Plugin.log(IStatus.ERROR, errIt.next().toString());
					if (display != null)
						display.syncExec(new Runnable() {
							public void run() {
								MessageDialog.openError(getSite().getShell(), "Error",
									"An error occurred saving the OpenOME file. Refer to the error log for additional information.");
							}
						});
			}
		}
	}
	/* (non-Javadoc)
	 * @see org.eclipse.ui.ISaveablePart#doSaveAs()
	 */
	public void doSaveAs() {
	}
	/* (non-Javadoc)
	 * @see org.eclipse.ui.IEditorPart#init(org.eclipse.ui.IEditorSite, org.eclipse.ui.IEditorInput)
	 */
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		display = site.getShell().getDisplay();
		if (input instanceof IFileEditorInput) {
			setSite(site);
			setInput(input);
			setPartName(((IFileEditorInput) input).getFile().getName());
			setContentDescription(((IFileEditorInput) input).getFile().getFullPath().toString());
			try {
				getSwingInitThread().start();
			} catch (IllegalThreadStateException e) {
			}
		} else {
			throw new PartInitException("Invalid Input: Must be IFileEditorInput.");
		}
	}
	/* (non-Javadoc)
	 * @see org.eclipse.ui.ISaveablePart#isDirty()
	 */
	public boolean isDirty() {
//		System.out.println("isDirty");
//		return (sfa != null && sfa.p != null);
		return false;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.ui.ISaveablePart#isSaveAsAllowed()
	 */
	public boolean isSaveAsAllowed() {
//		System.out.println("isSaveAsAllowed");
		return true;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPart#setFocus()
	 */
	public void setFocus() {
		if (OMETab.iframe!=null)
			SwingUtilities.updateComponentTreeUI(OMETab.iframe);
	}
	public void updateOpenOME(String m) {
		if (OMETab.mm!=null && sfa!=null)
			OMETab.mm.updateOpenOME(m, (GraphicViewFrame)sfa.p);
		showSwingSync();
	}
}