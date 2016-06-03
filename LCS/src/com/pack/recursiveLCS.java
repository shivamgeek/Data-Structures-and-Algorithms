package com.pack;

public class recursiveLCS {
	
	char arr1[],arr2[],L[][],store[][];
	int m,n,len,max=20;
	
	recursiveLCS(){
		arr2=new char[]{'A','G','G','T','A','B'};
		arr1=new char[]{'G','X','T','X','A','Y','B'};
		store=new char[max][max];
		L=new char[max][max];
	}
	
	public static void main(String args[]){
		recursiveLCS ob=new recursiveLCS();
		
		System.out.println(ob.find(ob.arr1.length,ob.arr2.length));
		
		
		
	}
	
	int find(int m,int n){
		if(m==0||n==0){
			return 0;
		}
	else if(arr1[m-1]==arr2[n-1]){
			return 1+find(m-1,n-1);
		}
		else{
			return max(find(m,n-1),find(m-1,n));
		}
		
		
	}
	
	
	
	int max(int m,int n){
		return m>n?m:n;
	}
	
	
	
	
	
	
	
	
	
	
	

}
