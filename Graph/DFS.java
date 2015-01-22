package Graph;

import java.util.Stack;

public class DFS {

	private boolean marked[];
	private int edgeTo[];
	private int s;
	
	public DFS(Graph G, int s){
		marked = new boolean[G.getVertex()];
		this.edgeTo = new int[G.getVertex()];
		this.s = s;
		dfs(G,s);
		
	}
	
	private void dfs(Graph G, int v){
		
		marked[v]= true;
		
		for(int i=0;i<v;i++){
			if(!marked[i]){
				edgeTo[i]=v;
				dfs(G,i);
			}
		}
	}
	
	public boolean marked(int w){
		return marked[w];
	}
	
	
	public boolean hasPathTo(int v){
		return marked[v];
	}
	
	public Iterable<Integer>pathTo(int v){
		if(!hasPathTo(v)) return null;
		Stack<Integer> path = new Stack<Integer>();
		for( int x=v;x!=s;x=edgeTo[x]){
			path.push(x);
		}
		return path;
	}
	
	
}