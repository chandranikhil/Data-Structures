package doublylinkedlist;

import doublylinkedlist.DLLNode;
import doublylinkedlist.DLLOp;
import doublylinkedlist.DLList;

public class DLLTest {
	
public static void main(String args[]){
		
		insertTest();
		deleteTest();
		
	}

public static void deleteTest(){
		

		Integer[] data = new Integer[5];
		for(int i=1;i<=data.length;i++)
			data[i-1] = Integer.valueOf(10*i);
		DLLNode headNode = DLList.constructDLL(data);
		
		//Print the linked list 
		DLLOp.printDLL(headNode);
		
		//Delete the first one
		headNode = DLList.constructDLL(data);
		System.out.println("\nLinkedListOperations after deleting at 1st position: ");
		DLLOp.printDLL(headNode);		
		
		//Delete the third Node
		headNode = DLList.constructDLL(data);
		headNode = DLLOp.deleteNode(headNode,3);
		System.out.println("\nLinkedListOperations after deleting at 3rd position: ");
		DLLOp.printDLL(headNode);
		
		//Delete the last node
		headNode = DLList.constructDLL(data);
		headNode = DLLOp.deleteNode(headNode,5);
		System.out.println("\nLinkedListOperations after deleting at 5th position: ");
		DLLOp.printDLL(headNode);
		
		
	}
	
	public static void insertTest(){
		
		Integer[] data = new Integer[5];
		for(int i=1;i<=data.length;i++)
			data[i-1] = Integer.valueOf(10*i);
		DLLNode headNode = DLList.constructDLL(data);
		
		//Print the linked list 
		DLLOp.printDLL(headNode);
		
		DLLNode nodeToInsert = new DLLNode(new Integer(25));
		
		//Insert at first position
		headNode = DLLOp.insertNode(headNode,nodeToInsert,1);
		System.out.println("\nLinkedListOperations after inserting at 1st position: ");
		DLLOp.printDLL(headNode);
		
		//Insert at position 3
		headNode = DLList.constructDLL(data);
		headNode = DLLOp.insertNode(headNode,nodeToInsert,3);
		System.out.println("\nLinkedListOperations after inserting at 3rd position: ");
		DLLOp.printDLL(headNode);
		
		//Insert at last position
		headNode = DLList.constructDLL(data);
		headNode = DLLOp.insertNode(headNode,nodeToInsert,6);
		System.out.println("\nLinkedListOperations after inserting at 6th position: ");
		DLLOp.printDLL(headNode);
				
		
	}
}
