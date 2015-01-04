package circularlinkedlist;

import linkedlist.LLNode;

public class CLLOp {
	
	public static int  getLengthCLL(LLNode head){
		int count=0;
		LLNode currentNode = head;
		
		while(currentNode!=null){
			count++;
			currentNode = currentNode.getNext();
			if(currentNode==head)
				break;			
		}		
		return count;		
	}
	
	public static void printCLL(LLNode head){
		int count=0;
		LLNode currentNode = head;
		
		while(currentNode!=null){
			System.out.print(currentNode.getData()+"-->");
			currentNode = currentNode.getNext();
			if(currentNode==head)
				break;			
		}		
			System.out.print(currentNode.getData());
	}
	
	public static LLNode insertCLL(LLNode head, LLNode nodeToInsert, int position){
		if(position<1){
			nodeToInsert.setNext(nodeToInsert);
			return nodeToInsert;
		}
		
		int len = getLengthCLL(head);
		if (position>len)
			position =  position%len;
		LLNode previousNode = head;
		LLNode currentNode =  previousNode.getNext();
		if(position==1){
			
			while(previousNode.getNext()!=head){
				previousNode = previousNode.getNext();
			}
			currentNode = previousNode.getNext();
			nodeToInsert.setNext(currentNode);
			previousNode.setNext(nodeToInsert);
			head = nodeToInsert;
		
		}
		else{
			int count = 1;
			while(count<position-1){
				previousNode = previousNode.getNext();
				count++;
			}
			
			currentNode = previousNode.getNext();
			nodeToInsert.setNext(currentNode);
			previousNode.setNext(nodeToInsert);
			
			}
		return head;
	}
	
	public static LLNode deleteCLL(LLNode head, int position){
		if (position<1)
			return head;
		int len = getLengthCLL(head);
		if (position>len)
			position =  position%len;
		
		LLNode previousNode = head;
		LLNode currentNode =  previousNode.getNext();
		if(position==1){
			while(previousNode.getNext()!=head)		//To move to the last node.
				previousNode = previousNode.getNext();
			currentNode = previousNode.getNext(); //a.k.a HeadNode
			head =  currentNode.getNext();
			previousNode.setNext(head);
			return head;
		}
		else{
			int count = 1;
			while(count<position-1){//To move to the second last node from the position given
				previousNode = previousNode.getNext();
				count++;
			}
			
			currentNode =  previousNode.getNext();
			previousNode.setNext(currentNode.getNext());
			currentNode = null;
			return head;
		}
		
	}
		
}

