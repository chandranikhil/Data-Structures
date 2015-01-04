package queues;
import linkedlist.LLNode;
import linkedlist.LLOp;
import stacks.LLStacks;

public class QueueReversal {
	
	public static void main(String args[]){
		

		LLQueue llQ = new LLQueue();
		for ( int i=0; i<10;i++)
		{
			llQ.enQ( new Integer(i));
			System.out.println(llQ.rearNode.getData()+"<--");
		}
		
		LLQueue newQ =  reverseQ(llQ);
		LLNode temp = newQ.frontNode;
		LLOp.printLL(temp);
		
	}

	public static LLQueue reverseQ(LLQueue q){
		
		LLStacks stack =  new LLStacks();
		while(!q.isEmpty()){
			stack.push(q.dQ());
		}
		while(!stack.isEmpty()){
			q.enQ(stack.pop());
		}
		return q;
		
	}
}
