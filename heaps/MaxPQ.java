package heaps;

public class MaxPQ<Key extends Comparable<Key>>{
	
	private Key[] pq;
	private int N=0;
	
	public MaxPQ(int maxN){
		pq = (Key[]) new Comparable[maxN+1];
	}
	
	public boolean isEmpty(){
		return N==0;
	}
	
	public int size(){
		return N;
	}
	
	public void insert(Key k){
		pq[++N]=k;
		swim(N);
	}
	
	public Key delMax(){
		Key max = pq[1];
		exch(1,N--);
		pq[N+1]=null;
		sink(1);
		return max;
	}
	
	private boolean less(int a, int b){
		return (pq[a].compareTo(pq[b])<0);
	}
	
	private void exch( int a, int b){
		Key temp=pq[a];
		pq[a]=pq[b];
		pq[b]=temp;
	}
	
	private void swim(int k){
	
		while(k>1 && less(k/2,k)){
			exch(k,k/2);
			k=k/2;
		}
	}
	
	private void sink( int k){
		while(2*k<=N){
			int j=2*k;
			if(j<N&&less(j,j+1)){
				j++;
			}
			if(!less(k,j)) break;
			exch(k,j);
			k=j;
		}
	}
	
	public void heapSort(){
		
		while(N>=1){
			exch(1,N);
			System.out.println(pq[N]);
			N--;
			sink(1);
		}
	}
	
	public void print(){
		for( int i=1;i<=N;i++){
			System.out.println(pq[i]);
		}
		
		System.out.println("The length is :"+N);
	}
	
	public static void main(String args[]){
		MaxPQ<Integer> heap = new MaxPQ<Integer>(10);
		for( Integer i=1;i<=10;i++){
			heap.insert(i);
		}
		heap.print();
		heap.heapSort();
	}
	
	
}
