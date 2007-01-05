
package jtelos;


public interface Repository {



  void addKB(KB kb);  

  void delete(KB kb);  

  KB[] kbs();  

  /**
   * Returns a KB matching the name <em>if one has been
   * created</em>. Otherwise it throws an exception.
   **/
  KB lookup(String name);  

  KB newKB(String name);  

}