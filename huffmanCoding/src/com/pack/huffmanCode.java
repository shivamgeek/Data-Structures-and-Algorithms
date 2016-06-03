package com.pack;

public class huffmanCode {

	int code[];
	
	huffmanCode(){
		code=new int[100];
		
		
		
		}
	
	
	public static void main(String args[]){
		huffmanCode huff=new huffmanCode();
		huff.createHuffmanCode();
	}
	
	void createHuffmanCode(){
		
		char[] c=new char[]{'a','b','c','d','e','f'};
		int[] f=new int[]{5,9,12,13,16,45};
		Heap h=new Heap(c.length);
		node[] n=new node[c.length];
		for(int i=0;i<c.length-1;i++){
			n[i]=new node();
			n[i].ch=c[i];
			n[i].freq=f[i];
			h.insert(n[i]);
		}
		node b=new node();b.freq=14;b.ch='Q';
		//h.extractMin();	
		h.extractMin();
		h.insert(b);
		h.show();
		node x,y,z=null;
		while(h.size<1){
		 x=h.extractMin();
		 y=h.extractMin();
		 z=new node();
		 z.ch='#';
		z.freq=x.freq+y.freq;
		z.left=x;
		z.right=y;
		h.insert(z);
		}
		//printCodes(0,z);
		
	}
	
	void printCodes(int index,node current){
		if(current.left!=null){
			code[index]=0;
			printCodes(index+1,current.left);
		}
		if(current.right!=null){
			code[index]=1;
			printCodes(index+1,current.right);
		}
		if(current.left==null && current.right==null){
			System.out.println("char is "+current.ch+" code is ");
			for(int i=0;i<index;i++){
				System.out.println(code[i]);
			}
		}
		
		
		
		
	}
	
	
	
}