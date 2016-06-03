package com.pack;

public class mst {

	public static void main(String args[]){
		mst ob=new mst(5);
		ob.MST();
		ob.printMST();
	}
	
	int[][] graph;
	int V,key[],parent[];
	boolean mstSet[];
	
	
	mst(int V){
		this.V=V;
		graph=new int[][]{{0, 2, 0, 6, 0},
            {2, 0, 3, 8, 5},
            {0, 3, 0, 0, 7},
            {6, 8, 0, 0, 9},
            {0, 5, 7, 9, 0},
           };;
		mstSet=new boolean[V];
		parent=new int[V];
		key=new int[V];
		for(int i=0;i<V;i++){
			mstSet[i]=false;
			key[i]=Integer.MAX_VALUE;
		}
		key[0]=0;
		parent[0]=-1;
	}
	
	int findMin(){
		int min=Integer.MAX_VALUE,node=0;
		for(int i=0;i<V;i++){
			if(mstSet[i]==false && key[i]<min){
			   min=key[i];
			   node=i;
			}
		}
		return node;
	}
	
	void MST(){
		
		for(int i=0;i<V;i++){
		int u=findMin();
			mstSet[u]=true;
			for(int v=0;v<V;v++){
				if(graph[u][v]!=0 && mstSet[v]==false && key[v]>graph[u][v]){
					parent[v]=u;
					key[v]=graph[u][v];
				}
			}
			
		}
}
	
	
	void printMST(){
		for(int i=1;i<V;i++){
			System.out.println("Edge-"+parent[i]+" "+i+" |weight "+key[i]);
		}
		
		
		
		
	}
	
	
	
}
