
package jtelos.util;

public class Parameter {
  String name;
  String value;


  public Parameter(String s) {
	int equalsInd = s.indexOf("=",0);
	if (equalsInd != -1) {
	  name = s.substring(0,equalsInd);
	  value = s.substring(equalsInd+1,s.length());
	  convertValue("%2F", "/"); // UNIX only!!!
	}
  }  

  private void convertValue(String s1, String s2) {
	int nextMarker = value.indexOf(s1,0);
	while(nextMarker!=-1) {
	  value = value.substring(0,nextMarker)+s2+
	value.substring(nextMarker+3,value.length());
	  nextMarker = value.indexOf(s1,0);
	}
  }  

  public String toString() { return name +"="+value; }  

}