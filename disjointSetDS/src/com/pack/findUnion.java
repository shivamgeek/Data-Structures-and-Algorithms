package com.pack;

public class findUnion {
	
	public static void main(String args[]){
		
		graph g=new graph(3,4);
		g.e[0].src=0;
		g.e[0].dest=1;
		g.e[1].src=1;
		g.e[1].dest=2;
		g.e[2].src=2;
		g.e[2].dest=3;
		g.findCycle();
		
	}	

}


class graph{
	
	int E,V,parent[];
	edge e[];
	
	graph(int E,int V){
		this.E=E;
		this.V=V;
		e=new edge[E];
		for(int i=0;i<E;i++){
			e[i]=new edge();
		}
		parent=new int[V];
		for(int i=0;i<V;i++){
			parent[i]=-1;
		}
		
	}
	
	class edge{
		int src,dest;
	}
	
	
	
	int find(int node){
		if(parent[node]==-1){
			return node;
		}
		else{
		return find(parent[node]);
	}
	}
	
	void union(int node1,int node2){
	
		int parentNode1=find(node1);
		int parentNode2=find(node2);
		parent[parentNode1]=parentNode2;
			}
		
		
	void findCycle(){
		
		for(int i=0;i<E;i++){
			
			int node1=e[i].src;
			int node2=e[i].dest;
			int parentNode1=find(node1);
			int parentNode2=find(node2);
			
			if(parentNode1==parentNode2){
				System.out.println("Cycle detected");
				return;
			}
			
		   union(node1,node2);
		}
		
		System.out.println("No cycle detected"); //Loop ended
		
		
	}
	
	
		
		
	}
	
	
	
	
	
	
