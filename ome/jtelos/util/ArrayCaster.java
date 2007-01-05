
package jtelos.util;

import java.lang.reflect.Array;

public class ArrayCaster {


  public static Object[] cast(Object[] objs, String className) {
	Object result = null;
	try {
	  result = Array.newInstance(Class.forName(className),objs.length);
	  System.arraycopy(objs,0,result,0,objs.length);
	} catch (Exception e) { 
	  String message =
	"ArrayCaster.cast called with className: "+className+
	" caught an exception.\n\n";
	  for(int i=0;i<objs.length;i++)
	message += "    objs["+i+"] class: "+objs[i].getClass().getName()+"\n";
	  System.err.println(message);
	  throw new RuntimeEncapsulatorException(e,message);
	}
	return (Object[]) result;
  }  

}