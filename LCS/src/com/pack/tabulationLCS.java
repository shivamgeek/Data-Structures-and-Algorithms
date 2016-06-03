package com.pack;

public class tabulationLCS {

	char arr1[],arr2[],store[];
	int m,n,max=20,L[][];
	
	tabulationLCS(){
		arr1=new char[]{'A','G','G','T','A','B'};//,'Q','H','A','B','C','D'};
		arr2=new char[]{'G','X','T','X','A','Y','B'};//,'Q','H','B','D'};
		L=new int[(arr1.length)+1][(arr2.length)+1];  //7 //8
		store=new char[max];
		m=arr1.length;  //6
		n=arr2.length;  //7

	}
	
	
	public static void main(String[] args) {
	
		tabulationLCS ob=new tabulationLCS();
		System.out.println(ob.find());

	}

	
	
	int find(){
	for(int i=0;i<=m;i++){
		for(int j=0;j<=n;j++){
			
			if(i==0||j==0){
				L[i][j]=0;
			}
			
			else if(arr1[i-1]==arr2[j-1]){
				L[i][j]=1+L[i-1][j-1];
			}
			else if(L[i][j-1]>L[i-1][j]){
				L[i][j]=L[i][j-1];
			}
			else{
				L[i][j]=L[i-1][j];
			}
			
			
		}
		
	}
		
		
	return L[m][n];
	}
	
	
	
	
	
	
	
	
}
