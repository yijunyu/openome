#!/bin/bash
#-----------------------------------------------------------
PRODUCT=openome_model
#VERSION=3.5.2
VERSION=3.5
IDE=$HOME/IDE
OS=linux
WS=gtk
ARCH=x86_64
#-----------------------------------------------------------
export ECLIPSE_HOME=$IDE/sdk/$VERSION/eclipse
export BUILD_HOME=$HOME/eclipse.build
export OPENOME_HOME=$(cd ..; pwd)
PRODUCT_FILE=$PRODUCT-$VERSION.product
PROJECT_FILE=$PRODUCT
\ls ../workspace > workspace.plugins.txt
xsltproc product.xsl ../workspace/$PROJECT_FILE/$PRODUCT_FILE > product.plugins.txt
files=`awk -f intersect.awk`
rm -rf $BUILD_HOME
mkdir -p $BUILD_HOME/features
mkdir -p $BUILD_HOME/plugins
cd $BUILD_HOME/plugins
for f in $files;  do
  echo $f
  ln -sf $OPENOME_HOME/workspace/$f .
done
rm -rf $BUILD_HOME/I.openome/*
cd -
cp -r $ECLIPSE_HOME/configuration .
cp $ECLIPSE_HOME/plugins/org.eclipse.pde.build_*/scripts/productBuild/productBuild.xml build.xml
sed -e "s/BUILD_PRODUCT/\/$PROJECT_FILE\/$PRODUCT_FILE/" productBuild.properties \
| sed -e "s#BUILD_IDE#$IDE#" \
| sed -e "s#BUILD_OS#$OS#" \
| sed -e "s#BUILD_WS#$WS#" \
| sed -e "s#BUILD_ARCH#$ARCH#" \
| sed -e "s/BUILD_VERSION/$VERSION/" \
> build.properties
$ECLIPSE_HOME/eclipse -configuration configuration -nosplash -application org.eclipse.ant.core.antRunner -Dbuilder=. $*
if [ $? ]; then
 exit
fi
