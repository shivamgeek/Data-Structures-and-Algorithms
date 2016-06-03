package com.pack;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class linkedList {
	
	static void display(List<String> l){
		Iterator<String> i=l.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		
	}
	
	static void reverseDisplay(List<String> l){
		ListIterator<String> i=l.listIterator(l.size());
		while(i.hasPrevious()){
			System.out.println(i.previous());
		}
		
	}
	
	public static void main(String args[]){
		
		LinkedList<String> l=new LinkedList<String>();
		l.addFirst("a");
		l.add("b");
		l.add("c");
		l.addLast("d");
	  display(l);
	  System.out.println("Reversing Linked list");
	  reverseDisplay(l);
		
		
	}

}
