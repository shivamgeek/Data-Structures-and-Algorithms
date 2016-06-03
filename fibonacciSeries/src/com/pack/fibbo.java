package com.pack;

public class fibbo {
 static int memoize[];
	static int size=100;
	
	public static void main(String args[]){
			
		//generate(5,6,7);
		//recFibbo(0,1,n);
		//System.out.println(recTerm(6));
		memoize=new int[size];
		for(int i=0;i<size;i++){
			memoize[i]=99999;//(Integer) null;
		}
		System.out.println(dynamicFibbo(22));
		//System.out.println(recTerm(22));
		
	}
	
	
	static int dynamicFibbo(int n){
		
		if(memoize[n]==99999){
			if(n==0){
				memoize[n]=0;
				//return 0;
			}
			else if(n==1){
				memoize[n]=1;
			   // return 1;
			}
			else{
				memoize[n]=dynamicFibbo(n-1)+dynamicFibbo(n-2);
				//return memoize[n];
			}
			return memoize[n];
		}
		
		else{
			return memoize[n];
		}
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static void generate(int a,int b,int n){
		int temp;
		System.out.println(a+"\n"+b);
		while(n>0){
			temp=a+b;
		 	System.out.println(temp);
			a=b;
			b=temp;
			
			n--;
		}
	}
	
	

	
  static int recTerm(int n){
	  if(n==0){
		  return 0;
	  }
	  else if(n==1){
		  return 1;
	  }
	  else{
		  return (recTerm(n-1)+recTerm(n-2));
	  }
  }
	
	
	
	
}
