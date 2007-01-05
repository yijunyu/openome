
package jtelos;


import jtelos.Attribute;

public interface ExtendedAttribute extends Attribute {



  public Attribute[] allNarrowedBy();  

  public Attribute[] allNarrows();  

  public boolean narrowedBy(Attribute candidate);  

  public boolean narrows(Attribute candidate);  

}