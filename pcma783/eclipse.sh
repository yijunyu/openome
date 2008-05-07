#!/bin/bash
#PRODUCT=goalmodel
PRODUCT=openome
#VERSION=3.3.1.1
VERSION=3.3.2
export ECLIPSE_SDK=/IDE/sdk/$VERSION
export ECLIPSE_HOME=$ECLIPSE_SDK/eclipse
rm -rf configuration
cp -rf $ECLIPSE_HOME/configuration .
rm -rf $ECLIPSE_HOME/links
mkdir -p $ECLIPSE_HOME/links
cp $PRODUCT.links-$VERSION/*.* $ECLIPSE_HOME/links
$ECLIPSE_SDK/eclipse/eclipse -plugincustomization plugin_customization.ini -configuration configuration -data ../workspace
