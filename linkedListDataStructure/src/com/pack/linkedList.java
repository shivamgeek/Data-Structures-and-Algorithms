package com.pack;

public class linkedList {
	node start,temp,newNode;
	
	void addNode(int data){
		
		if(start==null){
			newNode=new node();
			start=newNode;
			temp=newNode;
			start.setData(data);
		}
		else{
			newNode=new node();
			newNode.setData(data);
		    temp.setNext(newNode);
		    temp=newNode;
		}
		
		
	}
	
	void removeNodeByIndex(int index){
		if(index==1){
			start=start.getNext();
			System.out.println("Node removed");
			return;
		}
		node move=start;
		for(int i=1;i<index-1;i++){
			move=move.getNext();
		}
		node previous=move;
		move=move.getNext();
		move=move.getNext();
		previous.setNext(move);
		System.out.println("Node removed");
		
	}
	
	void showList(){
		node move=start;
		while(move.getNext()!=null){
			System.out.println(move.getData());
			move=move.getNext();
			}
		System.out.println(move.getData());
		
		
	}
	
	void searchData(int data){
		int counter=1;
		node move=start;
		while(move.getNext()!=null){
			if(move.getData()==data){
				System.out.println("data found at index "+counter);
				return;
			}
			else{
				move=move.getNext();
				counter++;
			}
			
			
		}
		if(move.getData()==data){
			System.out.println("data found at index "+counter);
		}
		else{
			System.out.println("data not found");
		}
		
	}
	
    void removeNodeByData(int data){
    	node previous=start,move=start;
    if(start.getData()==data){
    		start=start.getNext();
    		System.out.println("data removed");
    	}
    else{
    	
    	boolean flag=false;
    	while(move!=null && !flag){
    		if(move.getData()==data){
    			move=move.getNext();
    			previous.setNext(move);
    			flag=true;
    			System.out.println("data removed");
    		}
    		else{
    			previous=move;
    			move=move.getNext();
    		}
    
    	}
    	
   }
    	
    	
    }

    void addNodeAtIndex(int index,int data){
    	
    	if(index==1){
    		newNode=new node();
    		newNode.setData(data);
            newNode.setNext(start);
            start=newNode;
    		
    	}
    	node move=start,previous=start;
    	for(int i=1;i<index-1;i++){
    		move=move.getNext();
    	}
    	previous=move;
    	move=move.getNext();
    	newNode=new node();
    	previous.setNext(newNode);
    	newNode.setNext(move);
    	newNode.setData(data);
    	System.out.println("node inserted");
    }
	

	
	
	
	
}
