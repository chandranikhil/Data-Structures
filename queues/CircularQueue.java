package queues;

public class CircularQueue implements Queue{
	
	private int front;
	private int rear;
	private int capacity;
	
	public Object[] array;
	
	public CircularQueue(int size){
		
		this.front = this.rear = -1;
		this.capacity =  size;
		array =  new Object[size];
		
	}

	public void enQ(Object data) {
		if(isFull())
			System.out.println("Error, Queue Full");
		else{
		rear =  (rear+1)%capacity;
		array[rear] =  data;
		if (front==-1)
			front = rear;
		}		
		
	}
	
	public boolean isFull(){
		return ((rear+1)%capacity ==  front);
	}

	public Object dQ() {
		Object data = null;
		if(isEmpty()){
			System.out.println("ERROR! Empty Queue");
		}
		else
		{
			data = array[front];
			if (front==rear)
				front=rear=-1;
			else
				front =  (front+1)%capacity;
		}
		
		return data;
	}

	public boolean isEmpty() {
				
		return (front==-1);
	}
	
	public int getFront(){
		return this.front;
	}
	
	public int getRear(){
		return this.rear;
	}

}
