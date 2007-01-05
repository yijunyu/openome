set ECLIPSE_HOME=C:\IDE\sdk\3.2M4\eclipse
java -cp %ECLIPSE_HOME%\startup.jar org.eclipse.core.launcher.Main -application org.eclipse.ant.core.antRunner -Dconfigs="*,*,*" -Djavacfailonerror=true -Dpde.build.scripts=%ECLIPSE_HOME%/plugins/org.eclipse.pde.build_3.2.0.v20051031a/scripts -DbaseLocation=%ECLIPSE_HOME% > build.log
