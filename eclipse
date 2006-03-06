#!/bin/bash
ECLIPSE_HOME=$HOME/IDE/sdk/3.1.2/eclipse
mkdir $ECLIPSE_HOME/links
echo path=$HOME/IDE/emf/2.1.2 > $ECLIPSE_HOME/links/emf.link
echo path=$HOME/IDE/test/3.1.2 > $ECLIPSE_HOME/links/test.link
echo path=$HOME/IDE/subclipse/0.9.105 > $ECLIPSE_HOME/links/subclipse.link
echo path=$HOME/IDE/mylar/0.4.6.1 > $ECLIPSE_HOME/links/mylar.link
echo path=$HOME/IDE/openome/0.0.14 > $ECLIPSE_HOME/links/openome.link
cp $ECLIPSE_HOME/configuration/config.ini .configuration
export LD_LIBRARY_PATH=$ECLIPSE_HOME
$ECLIPSE_HOME/eclipse -showLocation -configuration .configuration -data . -nosplash -vmargs -Xms256m -Xmx512m
rm -rf $ECLIPSE_HOME/links
rm -f .configuration/config.ini
