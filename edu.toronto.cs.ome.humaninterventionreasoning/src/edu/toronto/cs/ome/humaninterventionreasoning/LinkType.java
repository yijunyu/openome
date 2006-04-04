package edu.toronto.cs.ome.humaninterventionreasoning;

public class LinkType {

	private String type;
	/*	
	* IStarHelpContribution link
	 * IStarSomeNegativeContribution link
	 * IStarMakeContribution 
	 * IStarAndContribution
	 * IStarUnknownContribution
	 * IStarHurtContribution
	 * IStarSomeNegativeContribution
	 * */
	
	public LinkType(String t) {
		type = t;
	}
	
	public boolean isMake() {
		if (type.indexOf("Make")>=0)
			return true;
		return false;
	}
	public boolean isHelp() {
		if (type.indexOf("Help")>=0)
			return true;
		return false;
	}
	public boolean isSomePlus() {
		if (type.indexOf("SomePositive")>=0)
			return true;
		return false;
	}
	public boolean isBreak() {
		if (type.indexOf("Break")>=0)
			return true;
		return false;
	}
	public boolean isHurt() {
		if (type.indexOf("Hurt")>=0)
			return true;
		return false;
	}
	public boolean isSomeMinus() {
		if (type.indexOf("SomeNegative")>=0)
			return true;
		return false;
	}
	public boolean isUnknown() {
		if (type.indexOf("Unknown")>=0)
			return true;
		return false;
	}
}
