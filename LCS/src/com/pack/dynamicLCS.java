package com.pack;

public class dynamicLCS {

	char arr1[],arr2[],store[];int L[][];
	int m,n,max=20,count;
	
	dynamicLCS(){
		arr1=new char[]{'A','G','G','T','A','B'};//,'Q','H','A','B','C','D'};
		arr2=new char[]{'G','X','T','X','A','Y','B'};//,'Q','H','B','D'};
		L=new int[arr1.length][arr2.length];
		store=new char[max];
	}
	
	
	public static void main(String[] args) {
	
		dynamicLCS ob=new dynamicLCS();
		for(int i=0;i<ob.arr1.length;i++){
			for(int j=0;j<ob.arr2.length;j++){
				ob.L[i][j]=9999;
			}
			
		}
		System.out.println(ob.find(ob.arr1.length-1, ob.arr2.length-1));
		ob.show();
		
		

	}
	
	
	int find(int m,int n){
		if(L[m][n]==9999){
		if(m==0||n==0){
			L[m][n]=0;
			store[count]=arr1[m];
			count++;
		}
		else if(arr1[m]==arr2[n]){
			L[m][n]=1+find(m-1,n-1);
		}
		
		else{
			L[m][n]=max(find(m,n-1),find(m-1,n));
		}
		}
		
		return L[m][n];
	}
	
	
	int max(int m,int n){
		return m>n?m:n;
	}
	
	
	void show(){
		System.out.println("Sequence is ");
		for(int i=0;i<store.length;i++){
			System.out.println(store[i]);
		}
	}
	
	
	
	
	

}
