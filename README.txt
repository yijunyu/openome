This directory is a workspace for the OpenOME SDK.

[Configuration]
The eclipse.bat will invoke the eclipse SDK. Make sure the version number
do exists under, for example, C:/IDE/sdk/$VERSION directory.

The .configuration/links directory consists of a set of Eclipse features
that will be invoked by eclipse. Please Make sure these features are installed
in the sites indicated by *.link.

When the Eclipse SDK or features are updated, please remove all the contents
under .configuration directory except for its links subdirectory.


[headless build]
The update site of the OpenOME feature can be built by calling the build.bat
under the edu.toronto.cs.ome.eclipse.update directory.
Please make sure the script points to the right Eclipse PDE_BUILD script directory.

