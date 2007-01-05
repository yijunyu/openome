#!/bin/bash
ECLIPSE_HOME=/IDE/sdk/3.1.2/eclipse
VM=/opt/jdk1.5.0_06/jre/bin/java
config=.configuration
work=.
if [ ! -e $ECLIPSE_HOME/links ]; then
  mkdir -p $ECLIPSE_HOME/links
fi
if [ ! -e $ECLIPSE_HOME/configuration/org.* ]; then
  rm -rf $ECLIPSE_HOME/configuration/org.*
  rm -rf $ECLIPSE_HOME/configuration/*.log
fi
if [ ! -e $config ]; then
  mkdir -p $config
  cp $ECLIPSE_HOME/configuration/config.ini $config
fi
echo path=/IDE/emf/2.1.2 > $ECLIPSE_HOME/links/emf.link
echo path=/IDE/test/3.1.0 > $ECLIPSE_HOME/links/test.link
$ECLIPSE_HOME/eclipse -showLocation -configuration $config -data $work -nosplash -vm $VM -vmargs -Xms256m -Xmx512m
rm -rf $ECLIPSE_HOME/links
rm -rf $config
