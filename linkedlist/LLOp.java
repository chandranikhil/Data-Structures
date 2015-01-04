package linkedlist;

public class LLOp {
	
	public static void printLL(LLNode head){
		
		LLNode presentNode = head;
		while(presentNode!=null){
			
			System.out.print(presentNode.getData()+"-->");
			presentNode = presentNode.getNext();
			
		}
		System.out.print("NULL");
	}
	
	public static int getLengthLL(LLNode head){
		int length = 0;
		LLNode presentNode = head;
		if(head==null)
			return 0;
		
		while(presentNode!=null){
			
			length++;
			presentNode = presentNode.getNext();
		}
		
		return length;
			
	}
	
	public static LLNode insertNode(LLNode head, LLNode nodeInsert, int position){
		
		if(head==null)
			return nodeInsert;
		
		int length = getLengthLL(head);
		
		if (position>length+1||position<1){
			System.out.println("Position Invalid");
		}
		
		if(position==1){
			nodeInsert.setNext(head);
			return nodeInsert;
		}
		else
		{LLNode previousNode = head;
		
		int count=1;
		
		while(count<position-1){
			previousNode = previousNode.getNext();
			count++;
		}
		
		LLNode currentNode = previousNode.getNext();
		nodeInsert.setNext(currentNode);
		previousNode.setNext(nodeInsert);
		
		}
		
		return head;	
		
	}
	
	public static LLNode deleteNode(LLNode head, int position){
		
		int length = getLengthLL(head);
		
		if(position>length || position<1)
			return head;
		
		if(position==1){
			head = head.getNext();
			return head;
		}
		else{
			int count = 1;
			LLNode previousNode = head;
			
			while(count<position-1){
				previousNode = previousNode.getNext();
				count++;
			}
			
			LLNode currentNode = previousNode.getNext();
			previousNode.setNext(currentNode.getNext());
			currentNode =  null;
		}
		
		return head;
	}	

}
