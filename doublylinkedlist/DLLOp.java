package doublylinkedlist;

import doublylinkedlist.DLLNode;


public class DLLOp {

	public static void printDLL(DLLNode headNode){
		DLLNode currentNode = headNode;
		while(currentNode!=null){
			System.out.print(currentNode.getData()+"<-->");
			currentNode = currentNode.getNext();
		}
		
		System.out.print("NULL");
	}
	
	public static int getLengthDLL(DLLNode headNode){
		int len=0;
		DLLNode currentNode = headNode;
		while(currentNode!=null){
			len++;
			currentNode = currentNode.getNext();
		}
		
		return len;
	}
	
	public static DLLNode insertNode(DLLNode headNode, DLLNode nodeInsert, int position){
		
		if(headNode ==  null)
			return nodeInsert;
		
		int len = getLengthDLL(headNode);
		
		if(position>len+1 || position<1)
			return headNode;
		
		if(position==1){
			headNode.setPrevious(nodeInsert);
			nodeInsert.setNext(headNode);
			return nodeInsert;
			
		}else{
			DLLNode previousNode = headNode;
			int count = 1;
			
			while(count<position-1){
				previousNode = previousNode.getNext();
				count++;
				
			}
			
			DLLNode currentNode = previousNode.getNext();
			previousNode.setNext(nodeInsert);
			nodeInsert.setPrevious(previousNode);
			nodeInsert.setNext(currentNode);
			if(currentNode!=null)
				currentNode.setPrevious(nodeInsert);
			
		}
		
		return headNode;
		
	}
	
	
public static DLLNode deleteNode(DLLNode headNode,int position){
		
		
		int len = getLengthDLL(headNode);
		
		if(position>len || position<1)
			return headNode;
		
		if(position==1){
			DLLNode currentNode = headNode.getNext();
			headNode = null;
			currentNode.setPrevious(null);
			return currentNode;
			
		}else{
			DLLNode previousNode = headNode;
			int count = 1;
			
			while(count<position-1){
				previousNode = previousNode.getNext();
				count++;
				
			}
			
			DLLNode currentNode = previousNode.getNext();
			DLLNode laterNode = currentNode.getNext();
									
			previousNode.setNext(laterNode);
			if(laterNode!=null)
			laterNode.setPrevious(previousNode);
			currentNode=null;
			
		}
		
		return headNode;
		
	}
	
	
}
