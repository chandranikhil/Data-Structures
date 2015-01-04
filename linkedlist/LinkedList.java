package linkedlist;

public class LinkedList {
	
	public static LLNode constructLL(Object[] data){
		
		if(data==null||data.length==0){
			return null;
		}
		
		LLNode headNode = new LLNode(data[0]);
		LLNode presentNode = headNode;
		
		for (int i=1;i<data.length;i++){
			
			presentNode.setNext(new LLNode(data[i]));
			presentNode = presentNode.getNext();
			
		}
		
		return headNode;
	}

}
