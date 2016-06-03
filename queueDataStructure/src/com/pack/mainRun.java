package com.pack;

public class mainRun {
	public static void main(String args[]){
		
		queueImplementation q=new queueImplementation();
		for(int i=1;i<=10;i++){
			q.enqueue(i);
		}
		q.show();
		
		for(int i=0;i<10;i++){
			q.dequeue();
		}
		q.dequeue();
		q.show();
		for(int i=1;i<=10;i++){
			q.enqueue(i);
		}
		q.show();
	}

}
