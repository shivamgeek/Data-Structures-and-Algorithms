package com.pack;

public class shortestPath {

	public static void main(String args[]){
		new shortestPath(9).Dijkstra();
		
	}
	
	int weight[][],parent[],dist[],V;
	boolean set[];
	
	shortestPath(int V){
		this.V=V;
		weight=new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
            {4, 0, 8, 0, 0, 0, 0, 11, 0},
            {0, 8, 0, 7, 0, 4, 0, 0, 2},
            {0, 0, 7, 0, 9, 14, 0, 0, 0},
            {0, 0, 0, 9, 0, 10, 0, 0, 0},
            {0, 0, 4, 0, 10, 0, 2, 0, 0},
            {0, 0, 0, 14, 0, 2, 0, 1, 6},
            {8, 11, 0, 0, 0, 0, 1, 0, 7},
            {0, 0, 2, 0, 0, 0, 6, 7, 0}
           };
		parent=new int[V];
		dist=new int[V];
		set=new boolean[V];
		for(int i=0;i<V;i++){
			dist[i]=Integer.MAX_VALUE;
			set[i]=false;
			
		}
	dist[0]=0;
	parent[0]=0;
	}
	
	int findMin(){
		int minDist=Integer.MAX_VALUE,minVertex=-1;
		for(int i=0;i<V;i++){
			if(set[i]==false && dist[i]<minDist){
				minDist=dist[i];
				minVertex=i;
			}
		}
		return minVertex;
	}
	
	
	
	void Dijkstra(){
		for(int i=0;i<V;i++){
			int u=findMin();
			set[u]=true;
			for(int v=0;v<V;v++){
				if(weight[u][v]!=0 && set[v]==false && dist[v]>dist[u]+weight[u][v]){
					dist[v]=dist[u]+weight[u][v];
					parent[v]=u;
				}
			}
	}
		           printDist();  		//printHere
}
	
	void printDist(){
		for(int i=0;i<V;i++){
			System.out.println("edge "+parent[i]+" "+i+" | minimum distance is "+dist[i]);
		}
	}
	
	
	
	
	
	
	
	
	
}
