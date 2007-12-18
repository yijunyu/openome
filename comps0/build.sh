#!/bin/bash
export OPENOME_HOME=/h/164/yijun/work/openome.git.fresh
export WORKSTATION=comps0
rm -rf $HOME/eclipse.build
mkdir -p $HOME/eclipse.build/features
mkdir -p $HOME/eclipse.build/plugins
#cd $HOME/eclipse.build/features
#for f in core goalmodel q7 sat4j; do
#  ln -sf $OPENOME_HOME/workspace/$f.feature .
#done
cd $HOME/eclipse.build/plugins
for f in core edu.toronto.cs.goalmodel edu.toronto.cs.goalmodel.diagram edu.toronto.cs.goalmodel.edit edu.toronto.cs.goalmodel.editor goalmodel goalmodel.figures it.unitn.goal_analysis log4j molhado org.eclipse.platform org.sat4j q7 util; do
ln -sf $OPENOME_HOME/workspace/$f .
done
cd $OPENOME_HOME/$WORKSTATION/build
./build
