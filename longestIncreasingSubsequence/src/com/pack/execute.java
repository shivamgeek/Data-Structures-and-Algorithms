package com.pack;

public class execute {
 
	static int arr[],val[];
	
	
	public static void main(String args[]){
		arr=new int[]{1, 12, 7, 0, 23, 11, 52, 31, 61, 69, 70, 2 };
		val=new int[12];
		
		find(12);
		show();
		
	}
	
	
  static void find(int n){
	  int temp=arr[0];
	  for(int i=0,j=0;i<n;i++){
		  if(temp<=arr[i]){
			  temp=arr[i];
			  val[j]=temp;
			  j++;
			  
		  }
	  }
	 
  }
  
  static void show(){
	  	  for(int x:val){
		  System.out.println(x);
	  }
  }
  
  
  
  
  
  
  
	
}
