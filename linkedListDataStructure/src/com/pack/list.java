package com.pack;

public class list{
	public static void main(String args[]){
		linkedList ll=new linkedList();
		for(int i=1;i<=8;i++){
			ll.addNode(i);
		}
		
		ll.showList();
		ll.removeNodeByData(1);
		ll.showList();
	}
		
}


