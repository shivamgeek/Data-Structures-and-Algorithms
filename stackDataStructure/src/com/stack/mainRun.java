package com.stack;

public class mainRun {
	
	public static void main(String args[]){
		
		stack s=new stack();
	String exp="231*+9-";
		postfixEvaluation ob=new postfixEvaluation();
		ob.evaluate(exp);
		
		
	}

}
