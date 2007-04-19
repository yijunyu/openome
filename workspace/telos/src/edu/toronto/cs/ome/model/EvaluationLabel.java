package edu.toronto.cs.ome.model;


/*
 * IStarConflictElementLabel
 * IStarSatisficedElementLabel
 * IStarDeniedElementLabel
 * IStarWeaklySatisficedElementLabel
 * IStarWeaklyDeniedElementLabel
 * IStarUndecidedElementLabel
 */

public class EvaluationLabel {

	private String type;
	
	private Object [][] values;
	
	public EvaluationLabel(String label) {
		type = label;
			
		values = new Object [] [] {{"IStarDeniedElementLabel", new Integer(0)}, 
				{"IStarWeaklyDeniedElementLabel", new Integer(1)}, 
				{"IStarUndecidedElementLabel", new Integer(2)}, 
				{"IStarConflictElementLabel", new Integer(2)},
				{"empty", new Integer(2)},
				{"IStarWeaklySatisficedElementLabel", new Integer(3)}, 
				{"IStarSatisficedElementLabel", new Integer(4)}};
		
		if (!Empty() && !isValidValue(label)) {
			System.out.println("EvaluationLabel " + label + " created with invalid string");
		}
	}
	
	public boolean Empty() {
		if (type.equals("empty"))
			return true;
		else
			return false;
	}
	
	public void print() {
		System.out.println("Evaluation Label: " + type);
	}
	
	public String getName() {
		return type;
	}
	
	public String getShortName() {
		return type.replaceFirst("IStar", "").replaceAll("ElementLabel", "");
	}
	
	public boolean isLessThan(EvaluationLabel compare)  {
		
		if (getOrdering().intValue() < compare.getOrdering().intValue())
			return true;
		return false;
	}
	
	
	public boolean isGreaterThan(EvaluationLabel compare)  {
		if (getOrdering().intValue() > compare.getOrdering().intValue())
			return true;
		return false;
	}
	
	private boolean isValidValue(String name) {
		for (int i = 0; i < values.length; i++) {
			if (name.equals(values[i][0]))
				return true;
		}
		return false;
	}
	
	private Integer getOrdering()  {
				
		for (int i = 0; i < values.length; i++) {
			if (type.equals(values[i][0]))
				return (Integer) values[i][1];
		}
		return new Integer(-1);
	}
	
	public String [] getStringValues() {
		String [] stringValues = new String [values.length];
		
		for (int i = 0; i < values.length; i++) {
			stringValues[i] = (String) values[i][0];
		}
		
		return stringValues;
	}
	
	public boolean isFullySatisficed()  {
		if (type.equals("IStarSatisficedElementLabel"))
			return true;
		return false;
	}
	
	public boolean isFullyDenied()  {
		if (type.equals("IStarDeniedElementLabel"))
			return true;
		return false;
	}
	
	public boolean isPartiallySatisficed()  {
		if (type.equals("IStarWeaklySatisficedElementLabel"))
			return true;
		return false;
	}
	
	public boolean isPartiallyDenied()  {
		if (type.equals("IStarWeaklyDeniedElementLabel"))
			return true;
		return false;
	}
	
	public boolean isConflict()  {
		if (type.equals("IStarConflictElementLabel"))
			return true;
		return false;
	}
	
	public boolean isUndecided()  {
		if (type.equals("IStarUndecidedElementLabel"))
			return true;
		return false;
	}
}
