package circularlinkedlist;
import linkedlist.LLNode;


public class CLinkedList {

	public static LLNode constructCLL(Object[] data){
		LLNode head =  new LLNode(data[0]);
		LLNode currentNode = head;
		currentNode.setNext(head);
		
		for (int i=1;i<data.length;i++){
			currentNode.setNext(new LLNode(data[i]));
			currentNode = currentNode.getNext();
		}
		
		currentNode.setNext(head);
		return head;
	}
	
	
}
