package edu.toronto.cs.ome.model;

import edu.toronto.cs.ome.view.GraphicViewElement;

public class TwinElemts{

	/**
	 * 
	 * @uml.property name="original"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	private GraphicViewElement original;

	/**
	 * 
	 * @uml.property name="copied"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	private GraphicViewElement copied;

	  
	  public TwinElemts(GraphicViewElement  original,GraphicViewElement  copied) {
	  	this.original=original;
	  	this.copied=copied;
		}

	/**
	 * 
	 * @uml.property name="original"
	 */
	public GraphicViewElement getOriginal() {
		return original;
	}

	/**
	 * 
	 * @uml.property name="copied"
	 */
	public GraphicViewElement getCopied() {
		return copied;
	}

	  
 } 