package edu.toronto.cs.ome.controller;

import java.awt.Rectangle;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

import jtelos.Attribute;
import jtelos.Levels;
import jtelos.Proposition;
import jtelos.StaticHelper;
import att.grappa.Element;
import att.grappa.Graph;
import att.grappa.GrappaConstants;
import att.grappa.Node;
import att.grappa.Parser;
import edu.stanford.smi.protege.model.Cls;
import edu.stanford.smi.protege.model.DefaultKnowledgeBase;
import edu.stanford.smi.protege.model.Instance;
import edu.stanford.smi.protege.model.KnowledgeBase;
import edu.stanford.smi.protege.model.Model;
import edu.stanford.smi.protege.model.Slot;
import edu.stanford.smi.protege.model.ValueType;
import edu.toronto.cs.ome.OMETab;
import edu.toronto.cs.ome.model.ViewSerializer;
import edu.toronto.cs.ome.view.GraphicView;
import edu.toronto.cs.ome.view.GraphicViewCanvas;
import edu.toronto.cs.ome.view.ViewObject;
import edu.toronto.cs.ome.view.GraphicView.GRecord;
import edu.toronto.cs.telos.TelosParserIndividual;
import edu.toronto.cs.telos.TelosParserKB;
import edu.toronto.cs.util.Computing;
import edu.toronto.cs.util.D;
import edu.toronto.cs.util.SortArrayList;

/**
 * Currently contains a method for creating a Telos declaration for a given
 * individual, as well as some helper methods. contains a couple of slightly
 * modified versions of methods found within Scott Kerr's old StaticHelper
 * class. Scott Kerr was otherwise a very cool guy. cai,Feb,8.2001,Otelos
 * declaration for ConceptBase is made.
 */
public class JTelosUtil {

	/**
	 * Removes all propositions that are not built-in.
	 * 
	 * @param propositions[]
	 *            The propostions that should be checked
	 * 
	 * @return The subset of <code>propositions[]</code> that are not built-in
	 */
	static Proposition[] removeBuiltIns(Proposition[] propositions) {
		Vector v = new Vector();
		if (propositions == null)
			return new Proposition[0];
//			return propositions;
		for (int i = 0; i < propositions.length; i++) {
			if (!propositions[i].isBuiltin())
				v.addElement(propositions[i]);
		}
		Proposition[] result = new Proposition[v.size()];
		for (int i = 0; i < v.size(); i++)
			result[i] = (Proposition) v.elementAt(i);
		return result;
	}

	/**
	 * This static method creates a Telos declaration for the individual in the
	 * Telos language. This method is used by <code>jtelos.example.exKB</code>
	 * to serailize (store) the contents of the KB on disk.
	 * 
	 * @param proposition
	 *            The proposition for which the Telos declaration should be
	 *            created
	 * 
	 * @return The Telos declaration that was created for the specified
	 *         proposition
	 */
	public static String telosDeclaration(Proposition proposition) {
		String result = StaticHelper.levelToString(proposition.level()) + " "
				+ proposition.telosName();
		Proposition[] pros = proposition.directAncestors();
		Proposition[] directAncestors = removeBuiltIns(pros);
		if (directAncestors != null && directAncestors.length > 0) {
			result += "\n    IN " + directAncestors[0];
			for (int i = 1; i < directAncestors.length; i++)
				result += ", " + directAncestors[i];
		}

		if (proposition.level() != Levels.TOKEN_LEVEL) {
			Proposition[] directParents = removeBuiltIns(proposition
					.directParents());
			if (directParents != null && directParents.length > 0) {
				result += "\n    ISA " + directParents[0];

				for (int i = 1; i < directParents.length; i++)
					result += ", " + directParents[i];
			}
		}
		Attribute[] directAttrs = proposition.directAttributes();
		if (directAttrs != null && directAttrs.length > 0) {
			result += "\n    WITH";
			for (int i = 0; i < directAttrs.length; i++) {
				String[] catLabels = directAttrs[i].categories();
				result += "\n        " + catLabels[0];
				for (int j = 1; j < catLabels.length; j++) {
					int ind = catLabels[j].indexOf("-");
					if (ind != -1) {
						result += ", " + catLabels[j].substring(0, ind);
					}
					else
						result += ", " + catLabels[j];
				}
				if (directAttrs[i].label().equals("\"\""))
					result += "\n           ";
				else
					result += "\n            " + directAttrs[i].label();
				result += " : " + directAttrs[i].to().telosName();
			}
		}
		return result += "\nEND";
	}

	//cai, Sml Declaration based on Otelos.
	public static String OtelosDeclaration(Proposition proposition) {
		String result;
		if (proposition.level() == Levels.M2CLASS_LEVEL)
			result = "MetametaClass " + proposition.telosName();
		else
			result = StaticHelper.levelToString(proposition.level()) + " "
					+ proposition.telosName();
		Proposition[] directAncestors = removeBuiltIns(proposition
				.directAncestors());
		if (directAncestors.length > 0)
			result += "\n    in " + directAncestors[0];
		for (int i = 1; i < directAncestors.length; i++)
			result += ", " + directAncestors[i];

		if (proposition.level() != Levels.TOKEN_LEVEL) {
			Proposition[] directParents = removeBuiltIns(proposition
					.directParents());
			if (directParents.length > 0) {
				result += "\n    isA " + directParents[0];
			}
			for (int i = 1; i < directParents.length; i++)
				result += ", " + directParents[i];
		}

		Attribute[] directAttrs = proposition.directAttributes();
		if (directAttrs!= null){
			if (directAttrs.length > 0)
				result += "\n    with";
			for (int i = 0; i < directAttrs.length; i++) {
				String[] catLabels = directAttrs[i].categories();
				result += "\n        " + catLabels[0];
	
				//	    result += "\n ";
				//+catLabels[0];
	
				for (int j = 1; j < catLabels.length; j++)
					result += ", " + catLabels[j];
				//	if (!catLabels[j].equalsIgnoreCase("attribute"))
				//            result +=" " + catLabels[j];
				if (directAttrs[i].label().equals("\"\""))
					result += "\n           ";
				else
					result += "\n            " + directAttrs[i].label();
				if (directAttrs[i].label().equalsIgnoreCase(""))
					result += "DefaultLabel" + i;
				if (directAttrs[i].to().telosName().equalsIgnoreCase("SClass"))
					result += " : SimpleClass";
				else
					result += " : " + directAttrs[i].to().telosName();
			}
		}
		return result += "\nend";
	}

	//cai, Sml Declaration based on Otelos without attribute.

	public static String OtelosDeclarationNoattribute(Proposition proposition) {
		String result;
		if (proposition.level() == Levels.M2CLASS_LEVEL)
			result = "MetametaClass " + proposition.telosName();
		else
			result = StaticHelper.levelToString(proposition.level()) + " "
					+ proposition.telosName();
		Proposition[] directAncestors = removeBuiltIns(proposition
				.directAncestors());
		if (directAncestors.length > 0)
			result += "\n    in " + directAncestors[0];
		for (int i = 1; i < directAncestors.length; i++)
			result += ", " + directAncestors[i];

		if (proposition.level() != Levels.TOKEN_LEVEL) {
			Proposition[] directParents = removeBuiltIns(proposition
					.directParents());
			if (directParents.length > 0) {
				result += "\n    isA " + directParents[0];
			}
			for (int i = 1; i < directParents.length; i++)
				result += ", " + directParents[i];
		}

		return result += "\nend";
	}

	/**
	 * Yijun Yu: saving to Protege knowledge base
	 */
	static void savePropositionToProtege(Proposition proposition,
			OMETab protege, boolean first) {
		if (protege == null)
			protege = new OMETab();
		KnowledgeBase kb = null;
		if (protege != null)
			kb = protege.getKnowledgeBase();
		if (kb == null)
			kb = new DefaultKnowledgeBase(protege);
		boolean isIncluded = false;
		String type = StaticHelper.levelToString(proposition.level());
		Cls a = null;
		if (proposition.telosName().startsWith("Serial"))
			return; // ignore Serialized tokens
		Instance I = null;
		if (type == "Token") { // instance
			Proposition[] directAncestors = removeBuiltIns(proposition
					.directAncestors());
			if (directAncestors.length > 0) {
				for (int i = 0; i < directAncestors.length; i++) {
					Cls d = kb.getCls(directAncestors[i].telosName());
					if (I == null)
						I = protege.createInstance(proposition.telosName(), d,
								kb, isIncluded);
					else if (I != null)
						I.addDirectType(d);
				}
			}
			if (!first) {
				Attribute[] directAttrs = proposition.directAttributes();
				for (int i = 0; i < directAttrs.length; i++) {
					String value = directAttrs[i].to().telosName();
					String[] catLabels = directAttrs[i].categories();
					Slot s = null;
					if (directAttrs[i].label().equals("")) {
						String name = "";
						for (int j = 0; j < catLabels.length; j++) {
							if (!catLabels[j].equals("attribute")
									&& !catLabels[j].equals("")) {
								name = catLabels[j];
								break;
							}
						}
						/* Yijun: the "attribute-#" is
						 * a special treatment for duplicated attributes 
						 */						 
						if (name.indexOf("-")>=0)
							name = name.substring(0, name.indexOf("-"));
						s = kb.getSlot(name);
					} else {
						s = kb.getSlot(directAttrs[i].label());
					}
					if (s != null && I != null) {
						if (s.getValueType() == ValueType.INSTANCE) {
							Instance ins = kb.getInstance(value);
							if (ins == null)
								ins = kb.createInstance(value, (Cls) s
										.getAllowedClses().toArray()[0]);
							if (s.getAllowsMultipleValues())
								I.addOwnSlotValue(s, ins);
							else
								I.setOwnSlotValue(s, ins);
						} else if (s.getValueType() == ValueType.STRING) {
							I.setOwnSlotValue(s, value.substring(1, value
									.length() - 1));
						} else {
							I.setOwnSlotValue(s, value);
						}
					}
				}
			}
		} else if (first
				&& (type == "SimpleClass" || type == "MetaClass" || type == "MetaMetaClass")) {
			a = kb.getCls(proposition.telosName());
			Vector u = new Vector();
			Vector v = new Vector();
			Proposition[] directAncestors = removeBuiltIns(proposition
					.directAncestors());
			if (directAncestors != null && directAncestors.length == 1) {
				Cls d = kb.getCls(directAncestors[0].telosName());
				if (d != null) {
					if (a == null)
						u.add(d);
					else
						a.addDirectType(d);
				}
			}
			Proposition[] directParents = removeBuiltIns(proposition
					.directParents());
			if (directParents != null) {
				for (int i = 0; i < directParents.length; i++) {
					Cls d = kb.getCls(directParents[i].telosName());
					if (d != null) {
						if (a == null)
							v.add(d);
						else
							a.addDirectSuperclass(d);
					}
				}
			}
				if (type == "MetaMetaClass" || type == "MetaClass") {
					if (directParents == null || directParents.length == 0)
						v.add(kb.getCls(Model.Cls.STANDARD_CLASS));
				}
				if (a == null)
					a = protege.createCls(proposition.telosName(), v, u, kb,
							isIncluded);
				else {
					a.removeDirectSuperclass((Cls) a.getDirectSuperclasses()
							.toArray()[0]);
				}

			Attribute[] directAttrs = proposition.directAttributes();
			if (directAttrs != null) {
				for (int i = 0; i < directAttrs.length; i++) {
					if (!directAttrs[i].label().trim().equals(""))
						continue;
					String[] catLabels = directAttrs[i].categories();
					String t = directAttrs[i].to().telosName();
					if (catLabels.length == 1
							&& catLabels[0].equals("attribute")
							|| catLabels.length == 2
							&& catLabels[0].equals("attribute")
							&& (catLabels[1].equals("OMEAttributes") 
								|| catLabels[1].equals("OMEValueAttributes"))
								) {
//						Slot s = protege.createSlot(directAttrs[i].label(), t, kb);
						Slot s = protege.createSlot(catLabels[1], t, kb);
						if (a != null) {
							a.addDirectTemplateSlot(s);
						}
					} else {
						for (int j = 0; j < catLabels.length; j++) {
							if (!catLabels[j].equals("attribute")
									&& !catLabels[j].trim().equals("")) {
								Slot s = kb.getSlot(catLabels[j]);
								if (s==null) /* Yijun Yu Jan 16, 2005: fixing a bug for xiaoxue's version */
									s = protege.createSlot(catLabels[j], t, kb);
								if (s != null&&a!=null) {
//									a.setOwnSlotValue(s, t);
									a.addDirectTemplateSlot(s); // Yijun Yu, Jan 16, 2005
								}
							}
						}
					}
				}
			}
		}
	}

	/**
	 * The class is used to store informaiton about a subgraph.--Xiao X.Deng
	 */
	public static class Sub {
		public String name;

		public Vector children;

		public String parentName;

		public Vector subFrom;

		public Vector subTo;

		public Vector subLinkNames;

		public Sub() {
			name = "";
			children = new Vector();
			parentName = "";
			subFrom = new Vector();
			subTo = new Vector();
			subLinkNames = new Vector();
		}
	}


	/**
	 * Saving to .vdx file -- Xiao X.Deng
	 * 
	 * @param propositions
	 *            individuals in a model
	 * @return String the content of the .vdx file
	 */
	public static String saveToVdx(TelosParserKB kb, Proposition[] propositions) {
		D.o("save to vdx");
		Vector masters=new Vector(40);
		//index masters
		masters.add("Position");masters.add("");masters.add("Actor boundary");masters.add("Actor");masters.add("SoftGoal");masters.add("Goal");masters. add("Dependency");masters.add("Decomposition");masters.add("Task");masters.add("Resource");
		masters.add("");masters.add("");masters.add("");masters.add("");masters.add("");
		masters.add("MeansEnds");masters.add("Role"); masters.add("");masters.add("Help");masters.add("Hurt");masters.add("Agent");masters.add("Make");masters.add("Unknown");masters.add("");masters.add("");masters.add("Occupies");masters.add("Covers");masters.add("Break");masters.add("");masters.add("ISA");
		masters.add("INS");masters.add("Parts");masters.add("SomePositive");masters.add("SomeNegative");masters.add("And");masters.add("Or");masters.add("Conflict");masters.add("Satisficed");masters.add("WeaklySatisficed");masters.add("Undecided");
		masters.add("Denied");masters.add("WeaklyDenied");masters.add("Plays");
		
		String result="";
		result+="<Pages>\n";
		result+="   <Page ID='0' NameU='Page-1' ViewScale='-1' ViewCenterX='9.3700787401575' ViewCenterY='7.6082677165354'>\n"+
		         "       <PageSheet LineStyle='0' FillStyle='0' TextStyle='0'>\n"+
				 "            <PageProps><PageWidth Unit='MM'>18.74297900262467</PageWidth><PageHeight Unit='MM'>15.14993176273962</PageHeight><ShdwOffsetX>0.1181102362204724</ShdwOffsetX><ShdwOffsetY>-0.1181102362204724</ShdwOffsetY><PageScale Unit='MM'>0.03937007874015748</PageScale><DrawingScale Unit='MM'>0.03937007874015748</DrawingScale><DrawingSizeType>1</DrawingSizeType><DrawingScaleType>0</DrawingScaleType><InhibitSnap>0</InhibitSnap><UIVisibility>0</UIVisibility><ShdwType>0</ShdwType><ShdwObliqueAngle>0</ShdwObliqueAngle><ShdwScaleFactor>1</ShdwScaleFactor></PageProps>\n"+
				 "       </PageSheet>\n";
		result+="        <Shapes>\n";				
		Vector linkIds = new Vector();
		Vector fromNodes = new Vector();
		Vector toNodes = new Vector();
		Vector labels=new Vector();
		Vector labelMasters=new Vector();
		Vector labeledNodes=new Vector();
		Vector boundID=new Vector();
		Vector actorMasters=new Vector();
		Vector boundWs=new Vector();
		Vector boundHs=new Vector();
		Vector beginXs=new Vector();
		Vector beginYs=new Vector();
		Vector endXs=new Vector();
		Vector endYs=new Vector();
				
		//calculate label ID
		int minLabelId=0;
		for (int c = 0; c < propositions.length; c++) {			
			TelosParserIndividual prop=((TelosParserIndividual) propositions[c]);
			if (!prop.isBuiltin()) {
				String type = prop.telosName();
				if (type.startsWith("SerializedViewObject")) {
					Attribute[] directAttrs = prop.directAttributes();
					for (int i = 0; i < directAttrs.length; i++) {
						String[] cats = directAttrs[i].categories();								
						if(cats.length == 2 && cats[1].equals("ID")) {
							int newLabelId =Integer.parseInt(directAttrs[i].to().telosName());
							if(newLabelId>minLabelId){
								minLabelId=newLabelId;
							}
						}
				  }
				}
		    }
		}
		
		for (int c = 0; c < propositions.length; c++) {			
			TelosParserIndividual prop=((TelosParserIndividual) propositions[c]);
			if (!prop.isBuiltin()) {
				String type = prop.telosName();
				if (type.startsWith("SerializedViewObject")) {
					boolean isLink=false;
					Attribute[] directAttrs = prop.directAttributes();
					String id=null;
					double x=0.0;
					double y=0.0;
					for (int i = 0; i < directAttrs.length; i++) {
						String[] cats = directAttrs[i].categories();
						if(cats.length == 2 && cats[1].equals("objecttype")
								&&(directAttrs[i].to().telosName()).equals("0")) {
							isLink=true;
						}
						
						if(cats.length == 2 && cats[1].equals("ID")) {
							id=directAttrs[i].to().telosName();
						}
						if(cats.length == 2 && cats[1].equals("x")){
							x=Double.parseDouble(directAttrs[i].to().telosName());
							x=x/72;
						}
						if(cats.length == 2 && cats[1].equals("y")){
							y=Double.parseDouble(directAttrs[i].to().telosName());
							y=y/(-72)+15;//mirror y and move the diagram up. 15 is the page height
						}
					}
					if(!isLink) {
						String indName="Element_"+id;
						TelosParserIndividual currentInd=(TelosParserIndividual)(kb.individual(indName));
						Attribute[] currentAttrs = currentInd.directAttributes();
						String master=null;
						String label=null;
						int masterId=0;
						int labelMasterId=0;
						int labelId=0;
						String name=null;
						boolean hasChildren=false;
						boolean hasLabel=false;
						int numOfChildren=0;
						double boundW=0.0;
						double boundH=0.0;
						double minX=0.0;
						double minY=0.0;
						double maxX=0.0;
						double maxY=0.0;
												
						for (int j = 0; j < currentInd.types.size(); j++) {
							String ancestor = (String) ((currentInd.types).get(j));
							if (ancestor.startsWith("IStar")) {
							int endIndex=ancestor.indexOf("Element");	
							if(endIndex!=-1) {
							master=ancestor.substring(5, endIndex);
							masterId=masters.indexOf(master);}
							}
						}
						for(int k=0;k<currentAttrs.length;k++) {
							String[] catLabels = currentAttrs[k].categories();
							if (catLabels.length == 2 && catLabels[1].equals("name")
									|| currentAttrs[k].label().startsWith("name")){
								name=currentAttrs[k].to().telosName();
								//Visio doesn't draw object with id "0"
								if(id.equals("0")){
									int newID=0;;								
									for(int i=0; i<5;i++)
										newID=++minLabelId;
									id=""+newID;
								}
								result+="     <Shape ID='"+id+"' NameU= '" + master +/*"."+id +*/ "' Type=";
								if(master.equals("Agent")||master.equals("Role")){
									result+= "'Group' Master='" +masterId+"'>\n";
								}
								else{
									result+="'Shape' Master='" +masterId+"'>\n";
								}
								result+="        <XForm>\n";	
								result+="          <PinX>"+x+"</PinX>\n";
								result+="          <PinY>"+y+"</PinY>\n";
								result+="        </XForm>\n";
								result+="        <Text><cp IX=\"0\"/>"+name.substring(1,name.length()-1)+"</Text>\n";
								result+="    </Shape>\n";
							}
							if (catLabels.length == 2 && catLabels[1].startsWith("children")
									|| currentAttrs[k].label().startsWith("children")){
								hasChildren=true;
								numOfChildren++;
								if(numOfChildren==1){
								    for(int i=0; i<5;i++)
									   labelId=++minLabelId;
								    labels.add(""+labelId);
								    labeledNodes.add(id);
								}
								String childName=currentAttrs[k].to().telosName();
								String childID=childName.substring(8);
								double childX=0.0;
								double childY=0.0;
								for (int d = 0; d < propositions.length; d++) {			
									TelosParserIndividual childProp=((TelosParserIndividual) propositions[d]);
									if (!prop.isBuiltin()) {
										String childType = childProp.telosName();
										if (childType.startsWith("SerializedViewObject")) {
											boolean isElement=false;
											Attribute[] childDirectAttrs = childProp.directAttributes();
											String ID=null;	
											double indX=0.0;
											double indY=0.0;
											for (int e = 0; e < childDirectAttrs.length; e++) {
												String[] childCats = childDirectAttrs[e].categories();
												if(childCats.length == 2 && childCats[1].equals("objecttype")
														&&(childDirectAttrs[e].to().telosName()).equals("1")) {
													isElement=true;
												}
											    if(childCats.length == 2 && childCats[1].equals("ID")) {
													ID=childDirectAttrs[e].to().telosName();
											    }
												if(childCats.length == 2 && childCats[1].equals("x")){
													indX=Double.parseDouble(childDirectAttrs[e].to().telosName());
												}
												if(childCats.length == 2 && childCats[1].equals("y")){
													indY=Double.parseDouble(childDirectAttrs[e].to().telosName());
												 }
											  }
											if(isElement&&childID.equals(ID)) {
												childX=indX;
												childY=indY;
												if(numOfChildren==1){
												 	minX=maxX=childX;
												    minY=maxY=childY;
												}
												break;
										    }
									     }
								    }
							    }
							    if(childX>maxX){
								  maxX=childX;	
								}
								if(childY>maxY){
								   maxY=childY;	
								 }
								if(childX<minX){
							       minX=childX;	
								}
								if(childY<minY){
									minY=childY;	
								}
							}
							if (catLabels.length == 2 && catLabels[1].equals("label")
									|| currentAttrs[k].label().startsWith("label")){
								hasLabel=true;
								for(int i=0; i<5;i++)
								labelId=++minLabelId;
								labels.add(""+labelId);
								labeledNodes.add(id);
								label=currentAttrs[k].to().telosName();
								int endIndex=label.indexOf("ElementLabel");
								if(endIndex!=-1) {
									label=label.substring(5, endIndex);
									labelMasterId=masters.indexOf(label);
									labelMasters.add(""+labelMasterId);
								}
							}
						}						
													
						if(hasChildren){
							if(numOfChildren==1){
								boundW=80/72;
								boundH=80/72;
							}
							else{
							    boundW=(Math.abs(maxX-minX)+160)/72;
								boundH=(Math.abs(maxY-minY)+160)/72;
							}
							
							double beginX=x+0.875/4.0;
							double endX=beginX+boundW; 
							double beginY=y-0.875/4;
							double endY=beginY;
							boundID.add(""+labelId);
							actorMasters.add(master);
							boundWs.add(""+boundW);
							boundHs.add(""+boundH);
							beginXs.add(""+beginX);
							beginYs.add(""+beginY);
							endXs.add(""+endX);
							endYs.add(""+endY);
						}
						if(hasLabel){
							result+="     <Shape ID='"+labelId+ "' NameU='"+label+"' Type='Group' Master='" +labelMasterId+"'>\n";
							//Calculate the begin point and end point of the label
							double beginX=x+(80/72.0)/2.0;
							double endX=beginX+0.359375;
						    result+="<XForm1D>\n";
						    //All shapes have four connection points, and labels connect to the fourth one.
						    result+="<BeginX F=\"PAR(PNT("+master+"!Connections.X1,"+master+"!Connections.Y1))\">"+beginX+"</BeginX>\n";
							result+="<BeginY F=\"PAR(PNT("+master+"!Connections.X1,"+master+"!Connections.Y1))\">"+y+"</BeginY>\n";
						    result+="<EndX>"+endX+"</EndX>\n";
							result+="<EndY>"+y+"</EndY>\n";
						    result+="</XForm1D>\n";
							result+="     </Shape>\n";
						}
					}	
					if(isLink) {
						
						String indName="Link_"+id;
						TelosParserIndividual currentInd=(TelosParserIndividual)(kb.individual(indName));
						Attribute[] currentAttrs = currentInd.directAttributes();
						String master=null;
						int masterId=0;
						
						for (int j = 0; j < currentInd.types.size(); j++) {
							String ancestor = (String) ((currentInd.types).get(j));
							if (ancestor.startsWith("IStar")) {
							int endIndex=ancestor.indexOf("Link");	
							if(endIndex==-1){
								endIndex=ancestor.indexOf("Contribution");
							}
							if(endIndex!=-1)
							{master=ancestor.substring(5, endIndex);
							masterId=masters.indexOf(master);}
							}
						}
						for(int k=0;k<currentAttrs.length;k++) {
							String[] catLabels = currentAttrs[k].categories();
							if (catLabels.length == 2 && catLabels[1].equals("from") 
								|| currentAttrs[k].label().startsWith("from")) {
								fromNodes.add((currentAttrs[k].to().telosName())
												.substring(8));
							}
							if (catLabels.length == 2 && catLabels[1].equals("to") 
									|| currentAttrs[k].label().startsWith("to")) {
									toNodes.add((currentAttrs[k].to().telosName())
											.substring(8));
							} 							
							
						}
						//Test if there is a element with the same id as the link
						String eleName="Element_"+id;
						TelosParserIndividual eleInd=(TelosParserIndividual)(kb.individual(eleName));
						if(eleInd!=null){
							//There is element with the same, so change the link id	
							int newLinkID=0;
							for(int i=0; i<5;i++)
								newLinkID=++minLabelId;
							id=""+newLinkID;
						}
						if(id.equals("0")){
							int newID=0;;								
							for(int i=0; i<5;i++)
								newID=++minLabelId;
							id=""+newID;
						}
						linkIds.add(id);
						
						result+="     <Shape ID='"+id+"' NameU= '" + master + "' Type='Shape' Master='" +masterId+"'>\n";
						result+="          </Shape>\n";							
							
							
					}
						
				}
			}
	  }
		//Draw boundaries		
		for(int d=0;d<boundID.size();d++){
	  	result+="     <Shape ID='"+boundID.elementAt(d)+ "' NameU='Actor boundary' Type='Shape' Master='2'>\n";
		result+="<XForm>\n";
		result+="<Width F=\"Inh\">"+boundWs.elementAt(d)+"</Width>\n";
		result+="<Height>"+boundHs.elementAt(d)+"</Height>\n";
		result+="</XForm>\n";
	    result+="<XForm1D>\n";
	    result+="<BeginX F=\"PAR(PNT("+actorMasters.elementAt(d)+"!Connections.X1,"+actorMasters.elementAt(d)+"!Connections.Y1))\">"+beginXs.elementAt(d)+"</BeginX>\n";
		result+="<BeginY F=\"PAR(PNT("+actorMasters.elementAt(d)+"!Connections.X1,"+actorMasters.elementAt(d)+"!Connections.Y1))\">"+beginYs.elementAt(d)+"</BeginY>\n";
	    result+="<EndX>"+endXs.elementAt(d)+"</EndX>\n";
		result+="<EndY>"+beginYs.elementAt(d)+"</EndY>\n";
	    result+="</XForm1D>\n";
		result+="     </Shape>\n";
	  }
	   result+="         </Shapes>\n";
       result+="         <Connects>\n";
       for(int p=0;p<linkIds.size();p++) {
       result+="              <Connect FromSheet=\""+linkIds.elementAt(p)+"\" FromCell=\"BeginX\" FromPart=\"9\" ToSheet=\""+fromNodes.elementAt(p)+"\" ToCell=\"PinX\" ToPart=\"3\"/>\n";
       result+="              <Connect FromSheet=\""+linkIds.elementAt(p)+"\" FromCell=\"EndX\" FromPart=\"12\" ToSheet=\""+toNodes.elementAt(p)+"\" ToCell=\"PinY\" ToPart=\"3\"/>\n";
       }
      //Connects for labels  
      for(int q=0;q<labels.size();q++) {
         result+="              <Connect FromSheet=\""+labels.elementAt(q)+"\" FromCell=\"BeginX\" FromPart=\"9\" ToSheet=\""+labeledNodes.elementAt(q)+"\" ToCell=\"Connections.X1\" ToPart=\"103\"/>\n";	
      }
       result+="         </Connects>\n";
       result+="     </Page>\n";
       result+="</Pages>\n";
       result+="<Windows ClientWidth='1400' ClientHeight='840'><Window ID='0' WindowType='Stencil' WindowState='268435456' WindowLeft='0' WindowTop='0' WindowWidth='123' WindowHeight='562' Document='I:\\research\\goal-model\\istar\\colleagues\\jennifer\\Istarv3.vss' ReadOnly='1'/><Window ID='1' WindowType='Drawing' WindowState='1073741824' WindowLeft='-4' WindowTop='-30' WindowWidth='1408' WindowHeight='874' ContainerType='Page' Page='0' ViewScale='-1' ViewCenterX='9.3700787401575' ViewCenterY='7.6082677165354'><ShowRulers>1</ShowRulers><ShowGrid>0</ShowGrid><ShowPageBreaks>0</ShowPageBreaks><ShowGuides>1</ShowGuides><ShowConnectionPoints>1</ShowConnectionPoints><GlueSettings>9</GlueSettings><SnapSettings>65847</SnapSettings><SnapExtensions>34</SnapExtensions><DynamicGridEnabled>0</DynamicGridEnabled><TabSplitterPos>0.5</TabSplitterPos></Window><Window ID='2' WindowType='Stencil' WindowState='67109889' WindowLeft='-286' WindowTop='1' WindowWidth='280' WindowHeight='834' ParentWindow='1'><StencilGroup>10</StencilGroup><StencilGroupPos>0</StencilGroupPos></Window></Windows>\n";
       result+="</VisioDocument>\n";	
	   D.o("Save succesfully\n");		
       return result;
	}
	
	

	/**
	 * Saving to .dot file -- Xiao X.Deng
	 *   for the visible elements -- Yijun
	 * @param propositions
	 *            individuals in a model
	 * @return String the content of the .dot file
	 */
	public static String saveToDot(Proposition[] propositions) {
		Vector nodes = new Vector();
		Vector linkNames = new Vector();
		Vector linkTypes = new Vector();
		Vector subs = new Vector();
		Vector fromNodes = new Vector();
		Vector toNodes = new Vector();
		
		for (int c = 0; c < propositions.length; c++) {
			if (!propositions[c].isBuiltin()) {
				String type = ((TelosParserIndividual) propositions[c]).cls;
				if (type.equals("Token")) {
					if (propositions[c].telosName().startsWith("Element")) {
						String nodeName = "";
						Sub newSub = new Sub();
						boolean isChild = false;
						boolean isParent = false;
						Attribute[] directAttrsE = propositions[c]
								.directAttributes();
						for (int i = 0; i < directAttrsE.length; i++) {
							String[] catLabels = directAttrsE[i].categories();
							if (catLabels.length == 2
									&& catLabels[1].equals("name")) {
								nodeName = directAttrsE[i].to().telosName();
							}
							if (catLabels.length == 2
									&& catLabels[1].startsWith("children")) {
								String child = directAttrsE[i].to().telosName()
										.substring(8);
								newSub.children.add(child);
								isParent = true;
							}
							if (catLabels.length == 2
									&& catLabels[1].equals("parent")) {
								isChild = true;
							}
						}
						if (isParent) {
							newSub.name = nodeName;
							newSub.parentName = propositions[c].telosName()
									.substring(8);
							subs.add(newSub);
						}
						if (!isParent && !isChild) {
							nodes.add(propositions[c].telosName().substring(8)
									);
						}
					}
					if (propositions[c].telosName().startsWith("Link")) {
						String id = propositions[c].telosName().substring(5);
						// check for dependency links so that to invert their directions
						boolean is_dependency = false;
						boolean is_decomposition = false;
						Proposition[] directAncestors = removeBuiltIns(propositions[c].directAncestors());
						if (directAncestors.length > 0) {
							for (int i = 0; i < directAncestors.length; i++) {
								String t = directAncestors[i].telosName();
								if (t.equalsIgnoreCase("IStarDependencyLink")) {
									is_dependency = true;
									break;
								}
								if (t.equalsIgnoreCase("IStarDecompositionLink")
										|| t.equalsIgnoreCase("IStarMeansEndsLink")) {
									is_decomposition = true;
									break;
								}
							}
						}
						Attribute[] directAttrsL = propositions[c].directAttributes();
						for (int i = 0; i < directAttrsL.length; i++) {
							// Yijun Yu: sometimes the label is not used, while the attribute name only
							// appear in the categories
							String[] catLabels = directAttrsL[i].categories();
							if (catLabels.length == 2 && catLabels[1].equals("from") 
								|| directAttrsL[i].label().startsWith("from")) {
								String name = directAttrsL[i].to().telosName().substring(8);
								if (is_dependency)
									toNodes.add(name);
								else
									fromNodes.add(name);
							}
							if (catLabels.length == 2 && catLabels[1].equals("to") 
									|| directAttrsL[i].label().startsWith("to")) {
								String name = directAttrsL[i].to().telosName().substring(8);
								if (is_dependency)
									fromNodes.add(name);
								else
									toNodes.add(name);
								linkTypes.add(new Boolean(is_decomposition));
							} 							
							if (catLabels.length == 2 && catLabels[1].equals("name")
									|| directAttrsL[i].label().startsWith("name")) {
								linkNames.add(id);
							}
						}
					}
				}
			}
		}
		for (int a = 0; a < fromNodes.size(); a++) {
			for (int h = 0; h < subs.size(); h++) {
				Sub aSub = (Sub) subs.elementAt(h);
				if (isInaSub(aSub, (String) fromNodes.elementAt(a))
						&& isInaSub(aSub, (String) toNodes.elementAt(a))) {
					aSub.subFrom.add((String) fromNodes.elementAt(a));
					aSub.subTo.add((String) toNodes.elementAt(a));
					aSub.subLinkNames.add((String) linkNames.elementAt(a));
					fromNodes.remove(a);
					toNodes.remove(a);
					linkNames.remove(a);
					linkTypes.remove(a);
					// break is necessary to avoid a bug that a node has been
					// removed in the vector, while the iterator still tries to
					// access it
					break;
				}
			}
		}
		String text = "";
		boolean neato = System.getProperty("Using neato")!=null; 
		if (!neato)
			text += "digraph G {\n";
		else
			text += "graph G {\n";
		text += "size=\"7.5, 10\";\n";
		for (int i = 0; i < nodes.size(); i++) {
			text += (String) nodes.elementAt(i) + ";\n";
		}
		for (int h = 0; h < subs.size(); h++) {
			Sub aSub = (Sub) subs.elementAt(h);
			if (neato)
				text += "{\n";
			else {
				text += "subgraph cluster" + h + " {\n";
				text += aSub.parentName	+ ";\n";
			}
			for (int h1 = 0; h1 < aSub.children.size(); h1++) {
				text += aSub.children.elementAt(h1) + ";\n";
			}
			for (int h2 = 0; h2 < aSub.subFrom.size(); h2++) {
				text += (String) aSub.subFrom.elementAt(h2) + (neato?"--":"->")
						+ (String) aSub.subTo.elementAt(h2) + "[label="
						+ (String) aSub.subLinkNames.elementAt(h2) + "];\n";
			}
			text += "}\n";
		}
		// Yijun: using hidden links to enforce ordering among AND (decomposed) subgoals
		Hashtable s = new Hashtable();
		for (int j = 0; j < fromNodes.size(); j++) {
			text += (String) fromNodes.elementAt(j) + (neato?"--":"->")
					+ (String) toNodes.elementAt(j) + "[label="
					+ (String) linkNames.elementAt(j) + "];\n";
			Boolean b = (Boolean) linkTypes.elementAt(j);
			if (b.booleanValue()) {
				String t = (String) toNodes.elementAt(j);
				SortArrayList l = (SortArrayList) s.get(t);
				if (l==null) {
					l = new SortArrayList();
					s.put(t, l);
				}
				boolean already = false;
				int m = Integer.parseInt((String) fromNodes.elementAt(j));
				for (int i =0; i<l.size(); i++) {
					Integer n = (Integer) l.get(i);
					if (n.intValue() == m) {
						already = true; break;
					}
				}
				if (!already)
					l.add(new Integer(m));
				s.put(t, l);
			}
		}
		for (Enumeration j = s.keys(); j.hasMoreElements();) {
			String t = (String) j.nextElement();
			SortArrayList l = (SortArrayList) s.get(t);
			if (l.size()>1) {
				text += "{";
				text += "rank = same\n";
				text += (Integer) l.get(0); 
				for (int k = 1; k < l.size(); k++) {
					text += " -> " + ((Integer) l.get(k)); 
				}
				text += "[weight=1000, style=\"invis\"" + "];\n";
				text += "}\n";
			}
		}
		text += "}\n";
		return text;
	}

	/**
	 * Tell if a node is in the subgraph--Xiao X.Deng
	 * 
	 * @param aSub
	 *            the subgraph
	 * @param s
	 *            the node'id
	 * @return boolean true if the node is in the subgraph
	 */
	public static boolean isInaSub(Sub aSub, String s) {
		if (s.equals(aSub.parentName)) {
			return true;
		} else {
			for (int i = 0; i < aSub.children.size(); i++) {
				if (s.equals((String) (aSub.children.elementAt(i)))) {
					return true;
				}
			}
			return false;
		}
	}

	/**
	 * do parsing--Xiao X.Deng modified by Yijun: use property to avoid hard
	 * coding file names
	 * 
	 * @param f
	 *            the .dot file to parse
	 * @return Graph the graph generated from the parsed .dot file
	 * @throws Exception
	 */
	public static Graph doParse(File f) throws Exception {
		boolean neato = System.getProperty("edu.toronto.cs.ome.layout.neato")!=null;
		String sCmd = neato?"neato":"dot";
		String cmdDot = System.getProperty("java.library.path")+"/ATT/bin/"+sCmd+".exe";
		if (cmdDot == null)
			cmdDot = new String(sCmd + ".exe");
		if (cmdDot.indexOf(":")>=0 && cmdDot.startsWith("/"))
			cmdDot = cmdDot.substring(1);
		String fPath = f.getPath();
		String tmpDot = Computing.getTempFilename("tmp.dot");
		String[] cmd = { cmdDot, "-q -Tdot", fPath, "-o", tmpDot };
		try {
//			Process p = Runtime.getRuntime().exec(cmd);
			String cmdline = cmd[0] + " " + cmd[1] + " " + cmd[2] +  " " + cmd[3] +  " " + cmd[4];
			System.out.println(cmdline);
			Runtime.getRuntime().exec(cmdline);
//			System.out.println("If the cmd does not finish, you have to restart the program");
//			p.waitFor();
		} catch (IOException e) {
			cmdDot = System.getProperty("java.library.path")+"/ATT/bin/" + sCmd;
			if (cmdDot == null)
				cmdDot = new String(sCmd);
			try {
				String cmdline = "chmod +x " + cmdDot;
				Process p1 = Runtime.getRuntime().exec(cmdline);
				System.out.println(cmdline);
				p1.waitFor();
			} catch (Exception i) {
				i.printStackTrace();
			}
//			String[] cmd2 = { cmdDot, " -q -Tdot ", fPath, " -o ", tmpDot };
			String cmdline = cmdDot + " -q -Tdot " + fPath + " -o " + tmpDot;
			Process p = Runtime.getRuntime().exec(cmdline);
			System.out.println(cmdline);
			p.waitFor();
		}
		InputStream input = null;
		try {
			input = new FileInputStream(tmpDot);
		} catch (FileNotFoundException fnf) {
			System.err.println(fnf.toString());
		}
		try {
			Parser program = new Parser(input, System.err);
			program.parse();
			Graph graph = null;
			graph = program.getGraph();
			graph.setEditable(true);
			graph.setErrorWriter(new PrintWriter(System.err, true));
			return graph;
		} catch (Exception ex) {
			System.err.println("Exception: " + ex.getMessage());
			return null;
		}
	}

	/**
	 * Back to OME model--Xiao X.Deng
	 * 
	 * @param view
	 *            the view of the old model
	 * @param graph
	 *            the new graph used to update the view
	 */

	public static void backToOME(GraphicView view, Graph graph) {
		int expand_mode = OMEDefaultPlugin.to_expand;
		Rectangle viewRec = view.getDisplayBounds();
		double zoom1 = 1.0;
		double zoom2 = 1.0;
		if (System.getProperty("fitDot").equalsIgnoreCase("true")) {
			zoom1 = viewRec.getWidth() / graph.getBoundingBox().getWidth();
			zoom2 = viewRec.getHeight() / graph.getBoundingBox().getHeight();
		}
		ViewSerializer vs = view.getViewSerializer();
		Vector newGRs = new Vector();
		GRecord newGR = view.new GRecord();
		Iterator i = vs.iterator();
		while (i.hasNext()) {
			GRecord gr = (GRecord) i.next();
			newGR = update(gr, graph, zoom1, zoom2);
			newGRs.add(newGR);
		}
		vs.clear();
		for (int a = 0; a < newGRs.size(); a++) {
			GRecord newGr = (GRecord) newGRs.elementAt(a);
			vs.serialize(newGr);
		}
		view.load(vs);
		GraphicViewCanvas gvc = view.getGraphicViewCanvas();
		Iterator ii = view.getAllLinks().iterator();
			while (ii.hasNext()) {
				ViewObject vo = (ViewObject) ii.next();
				view.promptStraighten(vo);
			}
		OMEDefaultPlugin.to_expand = expand_mode;
		if (gvc!=null)
			gvc.repaint();
	}

	/**
	 * Update a GRecord--Xiao X.Deng
	 * 
	 * @param gr
	 *            the GRecord to update
	 * @param graph
	 *            the graph with new GRecord informaiton
	 * @param zoom1
	 *            the zoom scale for x axis
	 * @param zoom2
	 *            the zooom scale for y axis
	 * @return GRecord the updated GRecord
	 */

	public static GRecord update(GRecord gr, Graph graph, double zoom1,
			double zoom2) {
		Enumeration elements = graph.elements();
		Element ele;
		while (elements.hasMoreElements()) {
			ele = (Element) elements.nextElement();
			if (ele != null) {
				if (gr.objecttype == 1) {
					if (ele.isNode() && gr.ID == Integer.parseInt((ele.getName()))) {
						gr.x = (int) (Math.abs(((Node) ele).getCenterPoint().x) * zoom1);
						gr.y = (int) (Math.abs(((Node) ele).getCenterPoint().y) * zoom2);
					}
				}
				if (gr.objecttype == 0) {
					if (ele.getAttribute(GrappaConstants.LABEL_ATTR)!=null)							
					if (ele.isEdge()
							&& gr.ID == Integer.parseInt((ele
									.getAttribute(GrappaConstants.LABEL_ATTR)
									.getStringValue()))) {
						int xpos = 0;
						int ypos = 0;
						Vector controlPointsX = new Vector();
						Vector controlPointsY = new Vector();
						String beX = "";
						String beY = "";
						String prefix = "";
						int j = 0;
						if (ele.hasAttributeForKey(GrappaConstants.POS_ATTR)) {
							String pos = ele.getAttribute(
									GrappaConstants.POS_ATTR).getStringValue();
							prefix = pos.substring(0, 1);
							if (prefix.equals("s") || prefix.equals("e")) {
								xpos = pos.indexOf(" ") + 1;
								int p = 0;
								for (int k = 2; k < xpos; k++) {
									if (pos.substring(k, k + 1).equals(",")) {
										beX = pos.substring(2, k);
										p = k + 1;
									}
									if (k == xpos - 1) {
										beY = pos.substring(p, k);
									}
								}
							} else
								xpos = 0;
							for (int h = xpos; h < pos.length(); h++) {
								if (pos.substring(h, h + 1).equals(",")) {
									controlPointsX.add(pos.substring(xpos, h));
									ypos = h + 1;

								}
								if (pos.substring(h, h + 1).equals(" ")) {
									controlPointsY.add(pos.substring(ypos, h));
									xpos = h + 1;
									j++;
								}
								if (h == pos.length() - 1) {
									controlPointsY.add(pos.substring(ypos));
									j++;
								}
							}
						}
						if (prefix.equals("s")) {
							gr.end1x = Double.parseDouble(beX) * zoom1;
							gr.end1y = Double.parseDouble(beY) * zoom2;
							gr.start2x = Double
									.parseDouble((String) controlPointsX
											.elementAt(j - 1))
									* zoom1;
							gr.start2y = Double
									.parseDouble((String) controlPointsY
											.elementAt(j - 1))
									* zoom2;
						}
						if (prefix.equals("e")) {
							gr.end1x = Double
									.parseDouble((String) controlPointsX
											.elementAt(0))
									* zoom1;
							gr.end1y = Double
									.parseDouble((String) controlPointsY
											.elementAt(0))
									* zoom2;
							gr.start2x = Double
									.parseDouble((String) controlPointsX
											.elementAt(0))
									* zoom1;
							gr.start2y = Double
									.parseDouble((String) controlPointsY
											.elementAt(0))
									* zoom2;
						} else {
							gr.end1x = Double
									.parseDouble((String) controlPointsX
											.elementAt(0))
									* zoom1;
							gr.end1y = Double
									.parseDouble((String) controlPointsY
											.elementAt(0))
									* zoom2;
							gr.start2x = Double
									.parseDouble((String) controlPointsX
											.elementAt(j - 1))
									* zoom1;
							gr.start2y = Double
									.parseDouble((String) controlPointsY
											.elementAt(j - 1))
									* zoom2;
						}
						gr.control1x = Double
								.parseDouble((String) controlPointsX
										.elementAt(1))
								* zoom1;
						gr.control1y = Double
								.parseDouble((String) controlPointsY
										.elementAt(1))
								* zoom2;
						gr.control2x = Double
								.parseDouble((String) controlPointsX
										.elementAt(j - 2))
								* zoom1;
						gr.control2y = Double
								.parseDouble((String) controlPointsY
										.elementAt(j - 2))
								* zoom2;
						gr.setJustification(2);
					}
				}
			}
		}
		return gr;
	}
}
