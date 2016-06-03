package com.pack;

public class activity {
	
	int[] start,finish,act;
	int size=10;
	
	activity(){
		start=new int[]{1, 3, 0, 5,3,5,6,8,8,2,12};
		finish=new int[]{4,5,6,7,9,9,10,11,12,14,16};
		act=new int[size];
	}
	
	
	public static void main(String args[]){
		activity a=new activity();
		a.select();
		a.show();
		
		
	}
	
	
	void select(){
		int count=0,temp=finish[0];
		act[count]=0;
		for(int i=1;i<start.length;i++){
			if(temp<=start[i]){
				count++;
				act[count]=i;
				temp=finish[i];
			}
		}
		
		
	}
	
	void show(){
		for(int i:act){
			System.out.println(i);
		}
	}
	
	

}
