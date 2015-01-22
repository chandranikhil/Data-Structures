package Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BFS {
	
	private boolean marked[];
	private int edgeTo[];
	private int s;
	
	public BFS(Graph G, int s){
		this.marked = new boolean[G.getVertex()];
		this.edgeTo = new int[G.getVertex()];
		this.s=s;
		bfs(G,s);		
	}
	
	private void bfs(Graph G, int s){
		
		Queue<Integer> queue = new LinkedList<Integer>();
		marked[s] = true;
		queue.add(s);
		
		while(!queue.isEmpty()){
			int v = queue.remove();
			for( int w:G.adj(v)){
				if(!marked[w]){
					marked[w]=true;
					edgeTo[w]=v;
					queue.add(w);
				}
			}
		}
	}
	
	public boolean hasPathTo( int v){
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
