package com.pack;

public class problem {
	
	public static void main(String args[]){
	
	problem p=new problem();
	p.divide(2913,0);
	p.show();
	//System.out.println(p.min(233));
		
		
		
		
	}
	
	
	int changes[]=new int[]{1,2,5,10,20,50,100,500,1000};
	int result[];

	problem(){
		result=new int[50];
	}
	
	
	int min(int num){
		for(int i=8;i>=0;i--){
		if(num>=changes[i]){	
			return changes[i];
		}
		else if(num==0){
			return 0;
		}
	}
		return 1000;
	}
	
	void divide(int num,int i){    //41
		int temp=min(num);   //20
		if(num==temp){
			result[i]=num;
			return;
		}
		else{
			int rem=num%temp;
			int times=num/temp;
			while(times!=0){
				result[i]=temp;i++;
				times--;
			}i--;
			divide(rem,i+1);
		}
		
	}
	
	void show(){
		for(int i=0;i<20;i++){
			System.out.println(result[i]);
		}
	}
	
	
	
	
}
