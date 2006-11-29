#!/bin/bash

function link_product() {
echo path=$PWD/IDE/$1/$2 > $ECLIPSE_HOME/links/$1.link
}

function start_eclipse() {
LD_LIBRARY_PATH=$ECLIPSE_HOME $ECLIPSE_HOME/eclipse -showLocation -configuration $config -data $work -nosplash -vmargs -Xms256m -Xmx512m
# rm -rf $ECLIPSE_HOME/links
# rm -rf $config
}

ECLIPSE_HOME=IDE/sdk/3.2/eclipse
config=.configuration
work=.
if [ ! -e $ECLIPSE_HOME/links ]; then
  mkdir -p $ECLIPSE_HOME/links
fi
rm -rf $ECLIPSE_HOME/configuration/org.*
rm -rf $ECLIPSE_HOME/configuration/*.log
if [ ! -e $config ]; then
  mkdir -p $config
  cp $ECLIPSE_HOME/configuration/config.ini $config
fi
link_product emf 2.2.0
link_product batik 1.6.0
link_product fmp 0.6.6
link_product jem 1.2.0
link_product draw2d 2.2.0
link_product gef 3.2.0M2
link_product xerces 2.8.0
link_product wsdl4j 1.4.0.v200606181221
link_product wsil4j 1.0.0
link_product uddi4j 2.0.3
link_product axis 1.2.1
link_product wst 1.0.1
link_product bpel 0.0.1
link_product openome 0.0.17
start_eclipse
