package Graph;
import java.util.Scanner;

import bag.Bag;


public class Graph {

	private int v;
	private int e;
	private Bag<Integer>[] adj;
	
	public Graph(int V){
		this.v=V;
		this.e=0;
		adj = new Bag[V];
		for(int v=0;v<V;v++){
			adj[v]=new Bag<Integer>();
		}
	}
	
	public void getGraph(){
		
		Scanner scan =  new Scanner(System.in);
		this.v = scan.nextInt();
		this.e = scan.nextInt();
		
		for( int i=0;i<v;i++){
			int a = scan.nextInt();
			int b = scan.nextInt();
			addEdge(a,b);
		}	
		
	}
	
	public void addEdge(int a , int b){
		
		adj[a].add(b);
		adj[b].add(a);
		e++;
	}
	
	public int getVertex(){
		return v;
	}
	
	public int getEdge(){
		return e;
	}
	
	public Iterable<Integer> adj(int v){
		return adj[v];
	}
	
}

