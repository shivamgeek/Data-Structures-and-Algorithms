package com.pack;

public class queueImplementation {

	int front=0,rear=-1,max=10;
	int arr[]=new int[max];
	
	void enqueue(int data){
		rear++;
		if(rear>=max){
			rear--;
			System.out.println("queue overflow");
		}else{
			arr[rear]=data;
			System.out.println("pushed: "+data);
		}
		
		
	}
	
	void dequeue(){
		if(front<=rear){
			System.out.println("popped: "+arr[front]);
			front++;
		}else{
			front=0;
			rear=-1;
			System.out.println("queue underflow");
		}
		
	}
	
	
	void show(){
		for(int i=front;i<=rear;i++){
			System.out.println(arr[i]);
		}
	}
	
	
}
