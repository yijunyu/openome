#!/bin/bash
export ECLIPSE_SDK=/IDE/sdk/3.3.1.1
rm -rf configuration
mkdir configuration
cp $ECLIPSE_SDK/eclipse/configuration/config.ini configuration
rm -rf $ECLIPSE_SDK/eclipse/links
mkdir $ECLIPSE_SDK/eclipse/links
cp links/*.* $ECLIPSE_SDK/eclipse/links
$ECLIPSE_SDK/eclipse/eclipse -plugincustomization plugin_customization.ini -configuration configuration -data workspace
