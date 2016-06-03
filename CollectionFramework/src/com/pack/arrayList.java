package com.pack;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class arrayList {
	
	void display(List<String> l){
		Iterator<String> i=l.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		
		
	}
	

	public static void main(String[] args) {
		
		ArrayList<String> l=new ArrayList<String>();
		
		l.add("hi");
		l.add("a");
		l.add("jjj");
		l.add("false");
		
		for(int i=0;i<l.size();i++){
			System.out.println(l.get(i));
		}
		
		l.remove("2");
		System.out.println("Removing 2 ...");
		new arrayList().display(l);
		Collections.sort(l);
		System.out.println("After sorting");
		new arrayList().display(l);
		Collections.reverse(l);
		System.out.println("Reversing the arrayList");
		new arrayList().display(l);
		
		
	}

}
