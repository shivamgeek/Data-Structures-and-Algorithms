package com.pack;

import java.util.SortedSet;
import java.util.TreeSet;

public class sortedSet {
	public static void main(String args[]){
		
		SortedSet s=new TreeSet();
		s.add("1");
        s.add("a");
        s.add("2");
        s.add("b");
        s.add("3");
        s.add("c");
        s.add("c");
        
        System.out.println(s);
        System.out.println(s.headSet("a"));
		System.out.println(s.tailSet("a"));
		
		
	}
	

}
