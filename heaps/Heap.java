package heaps;

//MAX HEAP

public class Heap {

	public int[] array;
	public int count;
	public int capacity;
	public int heap_type;
	
	public Heap(int capacity,int heap_type){
		this.heap_type = heap_type;
		this.count = 0;
		this.capacity = capacity;
		this.array =  new int[capacity];
	}
	
	public int parent(int i){
		if(i<=0||i>=this.count) return -1;
		return (i-1)/2;
	}
	
	public int leftChild(int i){
		int left = 2*i+1;
		if(left>=this.count)
			return -1;
		return left;
	}
	
	public int rightChild(int i){
		int right =  2*i+2;
		if(right>=this.count)
			return -1;
		return right;
	}
	
	public int getMax(){
		if(this.count==0)
			return -1;
		return array[0];
	}
	//Heapify the element at position 'i'
	public void percolateDown(int i){
		
		int l,r,max,temp;
		l=leftChild(i);
		r=rightChild(i);
		max=i;
		if(l!=-1&&this.array[i]<this.array[l])
			max=l;
		if(r!=-1&&this.array[i]<this.array[r])
			max=r;
		
		if(max!=i){
			temp=array[i];
			this.array[i]=this.array[max];
			this.array[max] = temp;
		}
		
		percolateDown(max);
			
		
	}
	
	public int deleteMax(){
		if(this.count==0)
			return -1;
		int data = this.array[0];
		this.array[0]=this.array[this.count-1];
		this.count--;
		percolateDown(0);
		return data;
	}
	
	public int insert(int data){
		
		int i;
		if(this.count==this.capacity)
			return -1;
		this.count++;
		i=this.count-1;
		while(i>=0&&data>this.array[(i-1)/2]){
			this.array[i]=this.array[(i-1)/2];
			i=(i-1)/2;		
			}
		return this.array[i]=data;
	}
}
