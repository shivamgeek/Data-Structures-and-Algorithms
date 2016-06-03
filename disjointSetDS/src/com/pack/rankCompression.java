package com.pack;

public class rankCompression {

	public static void main(String args[]){
		
		
		graph1 g=new graph1(4,3);
		g.e[0].src=0; 
		g.e[0].dest=1; 
		g.e[1].src=1; 
		g.e[1].dest=2; 
		g.e[2].src=2; 
		g.e[2].dest=3; 
		g.isCycle();
		
		
		
		
		
	}
	
	
	
}

class graph1{
	int V,E;
	node n[];
	edge e[];
	
	class edge{
		int src,dest;
	}
	
	class node{
		int rank,parent;
	}
	
	graph1(int V,int E){
		this.E=E;
		this.V=V;
		e=new edge[E];
		n=new node[V];
		for(int i=0;i<E;i++){
			e[i]=new edge();
		}
		for(int i=0;i<V;i++){   //MAKE SET 
			n[i]=new node();
			n[i].parent=i;
			n[i].rank=0;
		}
		
		
	}
	
	int find(int i){
		if(n[i].parent!=i){
			n[i].parent=find(n[i].parent);
		}
		
		return n[i].parent;
	}
	
	
	void union(int i,int j){
		int root1=find(i);
		int rank1=n[root1].rank;
		int root2=find(j);
		int rank2=n[root2].rank;
		if(rank1>rank2){
			n[root2].parent=root1;
		}
		else if(rank1<rank2){
			n[root1].parent=root2;
		}
		else{
			n[root2].parent=root1;
			n[root1].rank++;
		}
		
	}
	
	void isCycle(){
		for(int i=0;i<E;i++){
			int p1=e[i].src;
			int p2=e[i].dest;
			if(find(p1)!=find(p2)){
				union(p1,p2);
			}
			else{
				System.out.println("Cycle found");
				return;
			}
	}
		System.out.println("No Cycle Found");
		
		
		
		
	}
	
	
}