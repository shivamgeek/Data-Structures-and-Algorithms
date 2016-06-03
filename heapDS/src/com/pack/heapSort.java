package com.pack;

public class heapSort {

	public static void main(String args[]){
		
		heap h=new heap(11);

		//System.out.println(h.extractMin());
		//System.out.println(h.extractMin());
		h.insertKey(5);
		h.insertKey(9);
		h.insertKey(12);
		h.insertKey(13);
		h.insertKey(16);
		h.insertKey(45);
		
		System.out.println(h.extractMin());
		System.out.println(h.extractMin()+"\n\n");
		h.insertKey(14);
		/*System.out.println(h.extractMin());
		System.out.println(h.extractMin());
		System.out.println(h.extractMin());
		System.out.println(h.extractMin());
		System.out.println(h.extractMin());
		System.out.println(h.extractMin());*/
	h.show();
	}
	
	
	
}


class heap{
	int capacity,size,arr[];
	
	heap(int capacity){

		this.capacity=capacity;
		size=0;
		arr=new int[capacity];
	}
	
	void show(){
	System.out.println("");
		for(int x:arr){
			System.out.print("\t"+x);
		}
		System.out.println("size- "+size);
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
	
	int getMin(){
		return arr[0];
	}
	
	void insertKey(int val){
		if(size>=capacity){
			System.out.println("Maximum capacity reached");
		}
		else{
			arr[size]=val;
			size++;
			fixPosition(val);
			}
	}
	
	void fixPosition(int val){

		int s=size-1;
		
		while(s!=0 && arr[parent(s)]>arr[s]){
			 int temp=arr[s];
			   arr[s]=arr[parent(s)];
			   arr[parent(s)]=temp;
			s=parent(s);
		}
	}
	
	void minHeapify(int i){
		int l=left(i),r=right(i),smallest=i;
		if(l<size && arr[l]<arr[smallest]){
			smallest=l;
		}
		 if(r<size && arr[r]<arr[smallest]){
			smallest=r;
		}
		if(smallest!=i){
		int temp=arr[i];
		arr[i]=arr[smallest];
		arr[smallest]=temp;
		minHeapify(smallest);
		}
		
	}

	
	void changeKey(int index,int val){
		int previous=arr[index];
		arr[index]=val;
		if(previous<val){
			minHeapify(index);
		}
		else{
			while(index!=0 && arr[parent(index)]>arr[index]){
				int temp=arr[parent(index)];
				arr[parent(index)]=arr[index];
				arr[index]=temp;
				index=parent(index);	
			}
		}
		
		
		
	}
	
	
	int extractMin(){
		if(size<=0){
			System.out.println("Empty heap");
			return size;
		}
		else if(size==1){
			size--;
			arr[size+1]=0;
			return arr[0];
			
		}
		 
		else{
			int temp=arr[0];
			arr[0]=arr[size-1];
			arr[size-1]=0;
			size--;
			minHeapify(0);
			return temp;
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
}