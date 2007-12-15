#!/bin/bash
rm -rf $HOME/eclipse.build
mkdir -p $HOME/eclipse.build/features
mkdir -p $HOME/eclipse.build/plugins
cd $HOME/eclipse.build/features
for f in core fmp goalmodel q7.dsl q7 sat4j wbimodel; do
  ln -sf /home/yijun/work/openome/workspace/$f.feature .
done
cd $HOME/eclipse.build/plugins
for f in com.att.grappa com.ibm.wbimodel com.ibm.wbimodel.edit com.ibm.wbimodel.editor com.keypoint.png core edu.stanford.smi.protege edu.toronto.cs.goalmodel edu.toronto.cs.goalmodel.diagram edu.toronto.cs.goalmodel.edit edu.toronto.cs.goalmodel.editor edu.toronto.cs.jtelos fmp goalmodel goalmodel.figures it.itc.sra.taom4e.model it.itc.sra.taom4e.platform it.unitn.goal_analysis log4j molhado org.eclipse.platform org.sat4j org.wsdl4j q7 q7.dsl q7.dsl.editor q7.dsl.generator taom4e telos util wbimodel; do
ln -sf /home/yijun/work/openome/workspace/$f .
done
cd build
./build
cd /home/yijun/work/openome/episteme
