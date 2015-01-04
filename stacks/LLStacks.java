package stacks;
import linkedlist.LLNode;
public class LLStacks implements Stack{
	
	private LLNode headNode;
	
	public LLStacks(){
		this.headNode = null;
		
	}
	

	public  void push(Object data) {
		
		if(headNode == null){
			headNode =  new LLNode(data);
		}
		else{
			LLNode newNode =  new LLNode(data);
			newNode.setNext(headNode);
			headNode  = newNode;
		}
	}

	public  Object top() {
		
		if(headNode == null)
			return null;
			else
				return headNode.getData();
	}

	public  Object pop() {
		
		if(headNode ==  null)
		{
			System.out.println("Stack Empty !");
			return null;
		}
		else
		{
			Object data =  headNode.getData();
			headNode =  headNode.getNext();
			return data;
		}
		
		
	}

	public  boolean isEmpty() {
		
		if (headNode == null)
				return true;
		else
			return false;		
	}

	
}
