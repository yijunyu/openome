#!/bin/bash
#-----------------------------------------------------------
PRODUCT=openome
IDE=/IDE
VERSION=3.3.1.1
BUILD_HOME=$HOME/eclipse.build
TARGET_HOME=$HOME/web/tool/java/istar/latest
smbmount //penelope.open.ac.uk/Staff_WebSites /mnt/p -ocredentials=$HOME/.samba/ou,workgroup=OPEN-UNIVERSITY
mv -u $BUILD_HOME/I.openome/*.zip $TARGET_HOME
if [ ! -e $TARGET_HOME/openome-ide.zip ]; then
rm -rf eclipse
cp -r $IDE/sdk/$VERSION/eclipse .
for x in `cat $PRODUCT.links/*.link | sed -e 's/path=//' `; do
cp -r $x/eclipse .
done
rm -f $TARGET_HOME/openome-ide.zip
zip -r $TARGET_HOME/openome-ide eclipse
fi
smbumount /mnt/p
