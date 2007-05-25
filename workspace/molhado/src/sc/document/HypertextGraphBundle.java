package sc.document;

import fluid.ir.*;
import fluid.version.*;
import fluid.tree.*;
import fluid.FluidError;
import fluid.util.UniqueID;
/**
 * @author Tien N. Nguyen
 *
 */
public class HypertextGraphBundle {
  public static final SymmetricEdgeDigraph graph;
    
  static {
    try {   
      graph = new SymmetricEdgeDigraph("SCHypertext", VersionedSlotFactory.prototype);
    } catch (SlotAlreadyRegisteredException e) {
      throw new FluidError("slot already registered exception : " + e);
    }
  }
  
  private static Bundle hypertextgraphbundle = null;
  public static Bundle getBundle() {
    if (hypertextgraphbundle == null) {
      try {
        hypertextgraphbundle =
          Bundle.loadBundle(
            UniqueID.parseUniqueID("htgraph"),
            IRPersistent.fluidFileLocator);
      } catch (Throwable t) {
        System.out.println("Error in loading \"htgraph\" bundle !");
      }
    }
    return hypertextgraphbundle;
  }
  
  public static void main(String[] args) {
    /*
    Bundle b = new Bundle();
    graph.saveAttributes(b);
    
    try {
      b.store(IRPersistent.fluidFileLocator);
    } catch (Exception e) {
      e.printStackTrace();
    }
    if (b != null)
      b.describe(System.out);
    */
    
    Bundle b = getBundle();
    System.out.println("Getting from disk ...");
    if (b != null)
      b.describe(System.out);
    
  }
}
