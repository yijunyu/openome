#!/bin/bash
export OPENOME_HOME=$(cd ..; pwd)
export WORKSTATION=$(basename `pwd`)
rm -rf $HOME/eclipse.build
mkdir -p $HOME/eclipse.build/features
mkdir -p $HOME/eclipse.build/plugins
cd $HOME/eclipse.build/features
cd $HOME/eclipse.build/plugins
for f in core edu.toronto.cs.openome_model edu.toronto.cs.openome_model.diagram edu.toronto.cs.openome_model.edit edu.toronto.cs.openome_model.editor openome_model openome_model.figures log4j molhado org.sat4j q7 util org.eclipse.platform; do
ln -sf $OPENOME_HOME/workspace/$f .
done
cd $OPENOME_HOME/$WORKSTATION/build
./build
