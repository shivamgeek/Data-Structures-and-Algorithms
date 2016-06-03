package com.pack;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		
		Stack<Integer> s=new Stack<Integer>();
		s.push(4);
		s.push(3);
		s.push(5);
		s.push(7);
		show(s);
		s.pop();
		s.pop();
		show(s);
		
		

	}
	
	static void show(Stack<Integer> s){
		if(s.isEmpty()){
			System.out.println("Empty stack");
		}
		else{
			System.out.println(s);
		}
		
	}

}
