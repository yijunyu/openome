#!/bin/bash
#-----------------------------------------------------------
#PRODUCT=goalmodel
PRODUCT=openome
IDE=/home/yijun/IDE
#VERSION=3.3.1.1
VERSION=3.3.2
export ECLIPSE_SDK=$IDE/sdk/$VERSION
export ECLIPSE_HOME=$ECLIPSE_SDK/eclipse
export BUILD_HOME=$HOME/eclipse.build
export OPENOME_HOME=$(cd ..; pwd)
#-----------------------------------------------------------
PRODUCT_FILE=../workspace/openome_model/$PRODUCT.product
\ls ../workspace > workspace.plugins.txt
xsltproc product.xsl $PRODUCT_FILE > product.plugins.txt
files=`awk -f intersect.awk`
rm -rf $BUILD_HOME
mkdir -p $BUILD_HOME/features
mkdir -p $BUILD_HOME/plugins
cd $BUILD_HOME/plugins
for f in $files;  do
  ln -sf $OPENOME_HOME/workspace/$f .
done
rm -rf $BUILD_HOME/I.openome/*
cd -
cp -r $ECLIPSE_HOME/configuration .
rm -rf $ECLIPSE_HOME/links
mkdir -p $ECLIPSE_HOME/links
cp $PRODUCT.links-$VERSION/*.* $ECLIPSE_HOME/links
cp $ECLIPSE_HOME/plugins/org.eclipse.pde.build_*/scripts/productBuild/productBuild.xml build.xml
sed -e "s/MYPRODUCT/\/openome_model\/$PRODUCT.product/" productBuild.properties  | sed -e "s#MYSDK#$ECLIPSE_SDK#" > build.properties
$ECLIPSE_HOME/eclipse -configuration configuration -nosplash -application org.eclipse.ant.core.antRunner -Dbuilder=. $*
if [ $? ]; then
 exit
fi
