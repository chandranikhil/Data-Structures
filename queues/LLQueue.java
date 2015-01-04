package queues;

import linkedlist.LLNode;

public class LLQueue implements Queue {
	
	public LLNode frontNode;
	public LLNode rearNode;
	
	public LLQueue(){
		this.frontNode = null;
		this.rearNode = null;		
	}
	
	

	public void enQ(Object data) {
		LLNode newNode = new LLNode(data);
		if(rearNode!=null)
			rearNode.setNext(newNode);
		rearNode = newNode;
		if(frontNode==null)
			frontNode=rearNode;
		
		
	}

	public Object dQ() {
		
		Object data =  null;
		if(isEmpty()){
			System.out.println("ERROR.Queue Empty ! ");
			
		}
		else
		{
			data =  frontNode.getData();
			frontNode = frontNode.getNext();
			
		}
		return data;
		
				
	}

	public boolean isEmpty() {
		return (frontNode==null);
	}

}
