package treeDataStructure;

import java.util.LinkedList;

public class test {
	
	test(){
		//System.out.println("parameterized constructer");
	}
	static LinkedList<test> l;
	
	
	public static void main(String args[]){
		Runtime r=Runtime.getRuntime();
	    l=new LinkedList<test>();
	    test[] t=new test[10000000];
		for(int i=0;i<1000000000;i++){
			t[i]=new test();
			System.out.println(i);
			//t=null;
			
		}
		
	}
	
	public void finalize(){
		System.out.println("this is the finalize method" );
	}
	
	
	
	

}
