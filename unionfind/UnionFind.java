package unionfind;

public class UnionFind {

	int[] id;
	int[] sz;
	int count;
	public UnionFind(int N){
		this.count=N;
		id = new int[N];
		sz = new int[N];
		for( int i=0;i<N;i++){
			id[i]=i;
			sz[i]=1;
		}
	}
	public int find(int p){
		while(id[p]!=p)p=id[p];
		return p;
	}
	
	public boolean connected(int p, int q){
		return find(p)==find(q);
	}
	
	public void union(int p, int q){
		int pId = find(p);
		int qId = find(q);
		if(pId==qId) return;
		
		if(sz[pId]>sz[qId]){
			id[qId]=pId;
			sz[pId]+=qId;
		}
		
		if(sz[pId]<sz[qId]){
			id[pId]=qId;
			sz[qId]+=pId;
		}
		count--;
	}
}
