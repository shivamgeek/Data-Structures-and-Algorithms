package com.pack;

import java.util.Random;

public class sequence {
	
	public static void main(String args[]){
		sequence ob=new sequence(5);
		char ch[]=new char[]{'a','b','c','d','e'};
		int deadline[]=new int[]{2,1,2,1,3};
		int profit[]=new int[]{100,19,27,25,15};
		for(int i=0;i<5;i++){
			ob.j[i].deadline=deadline[i];
			ob.j[i].id=ch[i];
			ob.j[i].profit=profit[i];
		}
		ob.schedule();
	}
	
	
	job j[];
	int n;
	char result[];
	
	
	class job{
		char id;
		int deadline;
		int profit;
		
		job(){}
		
		job(char id,int deadline,int profit){
			this.deadline=deadline;
			this.profit=profit;
			this.id=id;
		}
	}
	
	
	sequence(int n){
		this.n=n;
		result=new char[n];
		j=new job[n];
		for(int i=0;i<n;i++){
			j[i]=new job();
		}
	}
	
	void schedule(){
		sort();
		int k=0,temp=j[0].deadline-1;
		result[k]=j[0].id;
		for(int i=1;i<n;i++){
			if(temp>=0){
				k++;
				result[k]=j[i].id;
				temp--;
			}
			
		}
		show();
		System.out.println("--------------");
		showId();
	}
	
	void sort(){
		for(int a=0;a<n;a++){
			for(int b=0;b<n;b++){
				if(j[a].profit>j[b].profit){
					job temp=j[a];
					j[a]=j[b];
					j[b]=temp;
				}
			}
		}
	}
	
void show(){
	for(int i=0;i<n;i++){
		System.out.println("Job "+j[i].id+" deadline is "+j[i].deadline+" profit is "+j[i].profit);
	}
}

void showId(){
	for(int i=0;i<n;i++){
		System.out.println("Job "+result[i]);
	}
}
	
	
	
}
