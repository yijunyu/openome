
package jtelos;


public class RelationNames implements Relations {

  public static final String ATTR_ = "ATTR";
  public static final String FROM_ = "FROM";
  public static final String IN_ = "IN";
  public static final String IN_INV_ = "IN_INV";
  public static final String ISA_ = "ISA";
  public static final String ISA_INV_ = "ISA_INV";
  public static final String TO_ = "TO";
  public static final String TO_INV_ = "TO_INV";



  public RelationNames() {}  

  public static String checkAddAttrToAttrRel ( String relName ) {
	switch( StoI(relName) ) {
	  case IN : return relName;
	  case IN_INV : return relName;
	  case ISA : return relName;
	  case ISA_INV : return relName;
	}
	String message =
	  "RelationNames.checkAddAttrToAttrRel("+relName +
	  ") was passed an illegal relation name as its argument.";
	throw new RuntimeException(message);
  }  

  public static String checkAddAttrToIndivRel ( String relName ) {
	switch( StoI(relName) ) {
	  case ATTR : return relName;
	  case TO_INV : return relName;
	}
	String message =
	  "RelationNames.checkAddAttrToIndivRel("+relName +
	  ") was passed an illegal relation name as its argument.";
	throw new RuntimeException(message);
  }  

  public static String checkAddIndivToAttrRel ( String relName ) {
	switch( StoI(relName) ) {
	  case FROM : return relName;
	  case TO : return relName;
	}
	String message =
	  "RelationNames.checkAddIndivToAttrRel("+relName +
	  ") was passed an illegal relation name as its argument.";
	throw new RuntimeException(message);
  }  

  public static String checkAddIndivToIndivRel ( String relName ) {
	switch( StoI(relName) ) {
	  case IN : return relName;
	  case IN_INV : return relName;
	  case ISA : return relName;
	  case ISA_INV : return relName;
	}
	String message =
	  "RelationNames.checkAddIndivToIndivRel("+relName +
	  ") was passed an illegal relation name as its argument.";
	throw new RuntimeException(message);
  }  

  public static String checkAttrGetRel ( String relName ) {
	switch( StoI( relName ) ) {
	  case FROM : return relName;
	  case IN : return relName;
	  case IN_INV : return relName;
	  case ISA : return relName;
	  case ISA_INV : return relName;
	  case TO : return relName;
	}
	String message =
	  "RelationNames.checkAttrGetRel("+ relName +
	  ") was passed an illegal relation name as its argument.";
	throw new RuntimeException(message);
  }  

  public static String checkIndivGetRel ( String relName ) {
	switch( StoI( relName ) ) {
	  case ATTR : return relName;
	  case IN : return relName;
	  case IN_INV : return relName;
	  case ISA : return relName;
	  case ISA_INV : return relName;
	  case TO_INV : return relName;
	}
	String message =
	  "RelationNames.checkIndivGetRel("+ relName +
	  ") was passed an illegal relation name as its argument.";
	throw new RuntimeException(message);
  }  

  public static  String getInverse ( String relName ) {
	switch( StoI(relName) ) {
	  case ATTR : return FROM_;
	  case FROM : return ATTR_;
	  case IN : return IN_INV_;
	  case IN_INV : return IN_;
	  case ISA : return ISA_INV_;
	  case ISA_INV : return ISA_;
	  case TO_INV : return TO_;
	  case TO : return TO_INV_;
	}
	String message =
	  "RelationNames.getInverse("+relName +
	  ") was passed an illegal relation name as its argument.";
	throw new RuntimeException(message);
  }  

  public static int StoI( String relName ) {
	if ( relName.equals( ATTR_ )) return ATTR;
	if ( relName.equals( FROM_ )) return FROM;
	if ( relName.equals( IN_ )) return IN;
	if ( relName.equals( IN_INV_ )) return IN_INV;
	if ( relName.equals( ISA_ )) return ISA;
	if ( relName.equals( ISA_INV_ )) return ISA_INV;
	if ( relName.equals( TO_ )) return TO;
	if ( relName.equals( TO_INV_ )) return TO_INV;
	String message =
	  "RelationNames.StoI("+relName+") was passed an illegal relation "+
	  "name as its argument.";
	throw new RuntimeException(message);
  }  

}