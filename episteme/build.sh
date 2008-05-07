#!/bin/bash
export OPENOME_HOME=$(cd .. && pwd) 
export WORKSTATION=$(basename `pwd`)
rm -rf $HOME/eclipse.build
mkdir -p $HOME/eclipse.build/features
mkdir -p $HOME/eclipse.build/plugins
cd $HOME/eclipse.build/plugins
for f in core edu.toronto.cs.goalmodel edu.toronto.cs.goalmodel.diagram edu.toronto.cs.goalmodel.edit edu.toronto.cs.goalmodel.editor goalmodel goalmodel.figures it.unitn.goal_analysis log4j molhado org.eclipse.platform org.sat4j q7 util; do
ln -sf $OPENOME_HOME/workspace/$f .
done
cd $OPENOME_HOME/$WORKSTATION/build
./build
