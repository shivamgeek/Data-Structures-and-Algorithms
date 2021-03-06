package com.pack;

class node{
	int freq;
	char ch;
	node left,right;
		}

public class Heap {

	int size,capacity;
	node arr[];
	
	
	
	Heap(int capacity){
		this.capacity=capacity;
		size=0;
		arr=new node[capacity];
		for(int i=0;i<capacity;i++){
			arr[i]=new node();
		}
	}
	
	
	int parent(int i){
		return (i-1)/2;
	}
	
	int left(int i){
		return 2*i+1;
	}
	
	int right(int i){
		return 2*i+2;
	}
	
	void minHeapify(int i){
		int l=left(i),r=right(i),smallest=i;
		if(l<size && arr[smallest].freq>arr[l].freq){
			smallest=l;
		}
		if(r<size && arr[smallest].freq>arr[r].freq){
			smallest=r;
		}
		if(i!=smallest){
			//swap(smallest,i);
			node temp=arr[i];
			arr[i]=arr[smallest];
			arr[smallest]=temp;
			
			minHeapify(smallest);
		}
		
		
	}
	
	void swap(int index1,int index2){
		node temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
	}
	
	void insert(node n){
		if(size>=capacity){
			System.out.println("Heap Overflow");
		}else{
			arr[size].ch=n.ch;
			arr[size].freq=n.freq;
			arr[size].left=n.left;
			arr[size].right=n.right;
			size++;
			fixPosition(size-1);
		}
	}
	
	void fixPosition(int i){
		while(i!=0 && arr[parent(i)].freq>arr[i].freq){
		//	swap(i,parent(i));
			node temp=arr[i];
			arr[i]=arr[parent(i)];
			arr[parent(i)]=temp;
			i=parent(i);
		}
	}
	
	void show(){
		/*for(int i=0;i<size;i++){
			System.out.println(arr[i].freq);
		}
		*/
		while(size>0){
			System.out.println(extractMin().freq);
		}
		
	}
	
	node extractMin(){
		node temp=arr[0];
		if(size==0){
			System.out.println("Empty heap");
			return temp;
		}
		
		else if(size==1){
			//arr[size-1].freq=9999;
			size--;
			return temp;
		}
		
		else {
		arr[0]=arr[size-1];
		//arr[size-1].freq=9999;
		size--;    //no need to increment size while inserting
		minHeapify(0);
		return temp;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
