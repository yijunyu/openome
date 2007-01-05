#!/bin/bash
ECLIPSE_HOME=$HOME/IDE/sdk/3.1.2/eclipse
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
echo path=$HOME/IDE/emf/2.1.2 > $ECLIPSE_HOME/links/emf.link
echo path=$HOME/IDE/test/3.1.0 > $ECLIPSE_HOME/links/test.link
LD_LIBRARY_PATH=$ECLIPSE_HOME $ECLIPSE_HOME/eclipse -showLocation -configuration $config -data $work -nosplash -vmargs -Xms256m -Xmx512m
rm -rf $ECLIPSE_HOME/links
rm -rf $config
