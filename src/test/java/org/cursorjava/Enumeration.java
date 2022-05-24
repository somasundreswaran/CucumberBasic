package org.cursorjava;

import java.lang.*;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Enumeration {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("A");
		v.add("B");
		v.add("c");
		v.add("d");
		v.add("e");
		
		java.util.Enumeration<String> elements = v.elements();
		while (elements.hasMoreElements()) {
		String	 v1 =  elements.nextElement();
		
	
		
		System.out.println(v1);
		
		
	}
		
		Iterator<String> iterator = v.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			
			
			
			if (string.equals("e")) {
				iterator.remove();
				
				
			}
		}
			System.out.println(v);

			
			ListIterator<String> listIterator = v.listIterator();
			while (listIterator.hasNext()) {
				String string2 = (String) listIterator.next();
				if (string2.equals("A")) {
					listIterator.add("soma");
					
				} else if (string2.equals("B")){
					listIterator.remove();
					
				}
				else if (string2.equals("e")) {
					listIterator.set("sridhar");
					
					
				
					

				}
				
			}
			System.out.println(v);

		}
		
	}
	
	


