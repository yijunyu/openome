This directory is a workspace for the OpenOME SDK.

[Configuration]
The eclipse-%version%-%os%.bat will invoke the eclipse SDK. 
Make sure the SDK is installed under the %ECLIPSE_HOME% and the
required plugins are installed under the corresponding links directories.

[headless build and testing]
The update site of the OpenOME feature can be built and tested
by calling ant under current directory.

The build correctly, please make sure the script under
edu.toronto.cs.ome.eclipse.update/build.xml points to the right 
Eclipse PDE_BUILD script directory.

The test correctly, please make sure the SDK and required features such
as EMF, TEST, OPENOME, OPENOME.TEST are all installed within a different
ECLIPSE_HOME directory.
