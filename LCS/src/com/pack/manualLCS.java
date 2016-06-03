package com.pack;

public class manualLCS {
	
	char[] arr1,arr2,sub;
	int max=30;
	
	manualLCS(){
		arr1=new char[]{'A','G','G','T','A','B'};
		arr2=new char[]{'G','X','T','X','A','Y','B'};
		sub=new char[max];
	}
	
	public static void main(String args[]){
		manualLCS f=new manualLCS();
		System.out.println(f.find());
		f.show(f.sub);
		
	}
	
	int find(){
		int select=0,match=0,count=0;
		for(int i=0;i<arr1.length;i++){
			for(int j=match;j<arr2.length;j++){
				System.out.println(arr1[i]+" vs "+arr2[j]+" "+(arr1[i]==arr2[j]));
			    if(arr1[i]==arr2[j]){
				sub[count]=arr1[i];
				match=j+1;count++;
				break;
			}
			
			
			}
			
			
		}
	
		return count;
	}
	
	void show(char a[]){
		System.out.println("Sequence is ");
		for(int i=0;i<a.length;i++){
			System.out.println(sub[i]);
		}
	}
	
	

}
