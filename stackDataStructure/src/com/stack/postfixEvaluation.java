package com.stack;

public class postfixEvaluation {

	//String exp;
	stack s;
	char temp;
	
	postfixEvaluation(){
		s=new stack();
	}
	
	void evaluate(String exp){
		for(int i=0;i<exp.length();i++){
			temp=exp.charAt(i);
		if(Character.isDigit(temp)){
			System.out.println("pushed "+temp);
			s.push(temp);
		}
		else{
			System.out.println("doing operation on "+temp);
			char val=Character.forDigit(operation(temp),10);
			//char val1=(char) operation(temp);
			s.push(val);
            System.out.println("pushed is "+val);
		}
	}
		System.out.println("output is "+Character.getNumericValue(s.pop()));
	}
	
	
	int operation(char oper){
		
		int b=Character.getNumericValue(s.pop());
		System.out.println("popped "+b);
		int a=Character.getNumericValue(s.pop());
		System.out.println("popped "+a);
		
		switch(oper){
			case('+'):{
				System.out.println("operation + result is "+(a+b));
				return a+b;
				
			}
		 
			case('-'):{
				System.out.println("operation - result is "+(a-b));
				return a-b;
				
			}
			case('*'):{
                    System.out.println("operation * result is "+a*b);
				return a*b;
				
			}
			
			case('/'):{
				System.out.println("operation / result is "+a/b);
				return a/b;
			}
			
	
		}
		
		return '\0';
		
		
		
	}
	
	
	
	
}




