#!/bin/bash
#-----------------------------------------------------------
#PRODUCT=core
PRODUCT=openome_model
IDE=$HOME/IDE
#VERSION=3.5.2
VERSION=3.5
export ECLIPSE_HOME=$IDE/sdk/$VERSION/eclipse
export BUILD_HOME=$HOME/eclipse.build
export OPENOME_HOME=$(cd ..; pwd)
#-----------------------------------------------------------
PRODUCT_FILE=$PRODUCT.product
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
# rm -rf $ECLIPSE_HOME/links
# mkdir -p $ECLIPSE_HOME/links
# cp $PRODUCT.links-$VERSION/*.* $ECLIPSE_HOME/links
cp $ECLIPSE_HOME/plugins/org.eclipse.pde.build_*/scripts/productBuild/productBuild.xml build.xml
sed -e "s/MYPRODUCT/\/$PROJECT_FILE\/$PRODUCT_FILE/" productBuild.properties \
| sed -e "s#MYIDE#$IDE#" \
| sed -e "s/MYVERSION/$VERSION/" \
> build.properties
$ECLIPSE_HOME/eclipse -configuration configuration -nosplash -application org.eclipse.ant.core.antRunner -Dbuilder=. $*
if [ $? ]; then
 exit
fi
