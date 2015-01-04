package queues;

import queues.CircularQueue.*;

public class CircularQueueTest {

	public static void main(String args[]){
		
		testIsEmpty();
		testEnQ();
		testMore();
	}
	
	public static void testIsEmpty(){
		
		CircularQueue q =  new CircularQueue(10);
		System.out.println("Is Array Queue Empty: " + q.isEmpty());
	}
	
	public static void testEnQ(){
		CircularQueue aQueue = new CircularQueue(10);
		for(int i=0;i<10;i++){
			aQueue.enQ(new Integer(i+1));
		}
		
		// Deleting three variables
		for (int i=0;i<3;i++)
		aQueue.dQ();
		
		System.out.println("The Front is "+ aQueue.getFront() + " The rear is "+ aQueue.getRear());
		
		// Inserting again to check the cyclic nature
		for(int i=0;i<3;i++)
		aQueue.enQ(new Integer(i));
		
		System.out.println("The Front is "+ aQueue.getFront() + " The rear is "+ aQueue.getRear());
		
		// Now enQ should give an error !
		aQueue.enQ(new Integer(15));
		
	}
	
	public static void testMore(){
		
		CircularQueue aQueue = new CircularQueue(10);
		for(int i=0;i<10;i++){
			aQueue.enQ(new Integer(i+1));
		}
		
		for(int i=0;i<9;i++)
			aQueue.dQ();
		
		System.out.println("The Front is "+ aQueue.getFront() + " The rear is "+ aQueue.getRear());
		aQueue.dQ();
		System.out.println("The Front is "+ aQueue.getFront() + " The rear is "+ aQueue.getRear());
		
	}
	
	
}
