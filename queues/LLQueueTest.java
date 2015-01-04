package queues;

import queues.LLQueue;


public class LLQueueTest {

	public static void main(String args[]){
		
		TestEnQ();
		testIsEmpty();
		
	}
	
	public static void TestEnQ(){
		
		LLQueue llQ = new LLQueue();
		for ( int i=0; i<10;i++)
		{
			llQ.enQ( new Integer(i));
			System.out.print(llQ.rearNode.getData()+"<--");
		}
		System.out.print("\n");
		while(!llQ.isEmpty())
			System.out.print(llQ.dQ()+"<--");
		System.out.print("\n");
	}
	
	public static void testIsEmpty(){	
	
		LLQueue llQ = new LLQueue();
		System.out.println("Queue Empty:"+llQ.isEmpty());
		
	}
	
	
}
