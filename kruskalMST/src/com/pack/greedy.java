package com.pack;

public class greedy {

	public static void main(String args[]){
		graph g=new graph(5,4);
		g.e[0].src = 0;
        g.e[0].dest = 1;
        g.e[0].weight = 10;
 
        g.e[1].src = 0;
        g.e[1].dest = 2;
        g.e[1].weight = 6;
        
        g.e[2].src = 0;
        g.e[2].dest = 3;
        g.e[2].weight = 5;
        
        g.e[3].src = 1;
        g.e[3].dest = 3;
        g.e[3].weight = 15;
        
        g.e[4].src = 2;
        g.e[4].dest = 3;
        g.e[4].weight = 4;
        
        
        g.createMST();
        
	}
	
}



class graph{
	
	int E,V;
	edge e[];
	node n[];
	
	class edge{
		int src,dest,weight;
	}
	class node{
		int rank,parent;
	}
	
	graph(int E,int V){
		this.E=E;
		this.V=V;
		e=new edge[E];
		n=new node[V];
		for(int i=0;i<E;i++){
			e[i]=new edge();
			e[i].weight=0;
		}
		for(int i=0;i<V;i++){  //MAKE SET 
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
		int root2=find(j);
		int rank1=n[root1].rank;
		int rank2=n[root2].rank;
		if(rank1>rank2){
			n[root2].parent=root1;
		}
		else if(rank2>rank1){
			n[root1].parent=root2;
		}
		else{
			n[root2].parent=root1;
			n[root1].rank++;
		}
		
	}
	
	void sortEdges(){
		edge temp ;
        
        for(int i=0; i <e.length; i++){
                for(int j=1; j < (e.length-i); j++){
                       
                        if(e[j-1].weight >e[j].weight){
                                //swap the elements!
                                temp =e[j-1];
                                e[j-1] = e[j];
                                e[j] = temp;
                        }
                       
                }
        }

        for(int i=0;i<e.length;i++){
        	System.out.println("sorted edges are "+e[i].src+e[i].dest);
        }
	}
	
	
	public static int compareTo(edge a, edge b) {
		if(a.weight>b.weight){
			return a.weight;
		}
		else 
			return b.weight;
	}
	
	void createMST(){
		sortEdges();
		int j=0;
		edge result[]=new edge[E];
		for(int i=0;i<E;i++){
			result[i]=new edge();
		}
		for(int i=0;i<E;i++){
			int parent1=find(e[i].src);
			int parent2=find(e[i].dest);
			if(parent1!=parent2){
				union(e[i].src,e[i].dest);
				result[j]=e[i];
				j++;
			}
		}
		for(int i=0;i<E;i++){
			System.out.println("edge selected is "+result[i].src+" "+result[i].dest);
		}
		
		
		//return result;
	}
	
	
}