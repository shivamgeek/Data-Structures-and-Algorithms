package com.stack;

public class stack {

	int top=-1,max=10;
	char arr[]=new char[max];
	
	void push(char data){
		top++;
		if(top>=max){
		top--;
		
		System.out.println("stack overflow !!!");
		}
		else{
			arr[top]=data;
		}
	}
	
	char pop(){
		top--;
		int t=top;
		if(top<-1){
			top++;
			System.out.println("stack underflow !!!");
			return (Character) null;
		}else{
			//System.out.println("element popped");
			return arr[++t];
		}
		
		
	}
	
	void display(){
	 for(int i=0;i<=top;i++){
		 System.out.println(arr[i]);
	 }
		
	}
	 
	char peek(){
		if(top<0){
			System.out.println("stack empty");
			return (Character) null;
		}
		else{
			return arr[top];
		}
	}
	
	void postfixEvaluation(){
		
	}
	
	
	
	
}
