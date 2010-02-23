#!/bin/bash
VERSION=3.5
export ECLIPSE_HOME=$HOME/IDE/sdk/$VERSION/eclipse
rm -rf configuration
cp -rf $ECLIPSE_HOME/configuration .
$ECLIPSE_HOME/eclipse -plugincustomization plugin_customization.ini -configuration configuration -data ../workspace
