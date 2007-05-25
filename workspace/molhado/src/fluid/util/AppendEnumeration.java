/* $Header: /usr/local/refactoring/molhadoRef/src/fluid/util/AppendEnumeration.java,v 1.1 2006/03/21 23:20:54 dig Exp $ */
package fluid.util;

import java.util.Enumeration;
import java.util.NoSuchElementException;

public class AppendEnumeration implements Enumeration {
  private Enumeration enum;
  private final Enumeration enum2;
  
  public AppendEnumeration(Enumeration e1, Enumeration e2) {
    enum  = e1;
    enum2 = e2;
  }
  
  public boolean hasMoreElements() {
    if (enum.hasMoreElements()) {
      return true;
    }
    enum = enum2;
    return enum.hasMoreElements();
  }

  public Object nextElement() {
    if (hasMoreElements()) {
      return enum.nextElement();
    }
    throw new NoSuchElementException();
  }

  Enumeration simplify() {
    if (enum == enum2) {
      if (enum2 instanceof AppendEnumeration)
	return ((AppendEnumeration)enum2).simplify();
      else
	return enum2;
    } else {
      return this;
    }
  }
}
