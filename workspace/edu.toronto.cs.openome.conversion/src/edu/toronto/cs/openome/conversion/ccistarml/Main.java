/*
 * Main.java
 * Sample of using ccistarml Java Package
 *
 * it is part of the ccistarml Java Package
 * version 0.6
 * Created on July 4 of 2007, By Carlos Cares
 * Updated to v0.6.1  on September 20 of 2007 By Carlos Cares
 */
package edu.toronto.cs.openome.conversion.ccistarml;

import java.lang.String;
import java.util.*;
import java.io.*;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {
//		ERelementList erL;
//		ERelement erle;
//		ccistarmlFile f = new ccistarmlFile();
//		f.loadFile("sample.istarml"); // put your file name here !
//		f.xmlParser();
//		f.istarmlParser();
//		System.out.println("Cantidad de errores: " + f.errors());
//		f.displayErrors();
		


		ccistarmlFile f = new ccistarmlFile();
		ccistarmlContent s = f.xmlStructure();
		
		ccistarmlContent d1,a,b,c,d,e,g,h,t, st1, st2;
		d1 = f.add_diagram("My new i* diagram");
		a = d1.add_task("a");
		b = d1.add_goal("b");
		c = d1.add_goal("c");
		b.add_decomposition(a);
		c.add_decomposition(a);
		a = d1.add_actor("My organizational unit");
		b = d1.add_agent("Carlos");
		c = d1.add_role("Finance Supervisor");
		d = d1.add_position("General Manager");
		d.add_covers(c);
		b.add_occupies(d);
		b.add_covers(c);
		
		e = d1.add_goal("To provide software support");
		t = d1.add_task("To implement a metric bases quality");
		g = b.add_resource("Viruses behaviour databse");
		h = b.add_goal("A support job allows knowing organizations");
		
		st1 = d.add_task("To elicitate quality metrics");
		st2 = d.add_task("To configure BSC system");
		st1.add_decomposition(t, "and");
		st2.add_decomposition(t, "and");
		g.add_means_end(st2);
		t.add_means_end(e);
		//System.out.println(f.buildXML());
		f.saveFile("/home/showzeb/Desktop/test.istarml");
		
		
		ERelementList erL;
		ERelement erle;
		f = new ccistarmlFile();
		f.loadFile("/home/showzeb/Desktop/test.istarml");
		f.xmlParser();
		erL = new ERelementList(f.xmlStructure());
		erL.display();
		
		Iterator it = erL.list().iterator();
		System.out.println("Intentional Elements");
		while(it.hasNext()) {
			erle = (ERelement)it.next();
//			if (erle.name.equals("ielement"))
//				System.out.println("Code:"+erle.ID+" " +
//						erle.attribute + " is on diagram " + erle.diagram);
		}
	}
}
