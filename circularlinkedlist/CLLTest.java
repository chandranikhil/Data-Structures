package circularlinkedlist;

import linkedlist.LLNode;
import circularlinkedlist.CLinkedList;
import circularlinkedlist.CLLOp;

public class CLLTest {
	
public static void main(String args[]){
	insertTest();
	deleteTest();
	
}
public static void deleteTest(){
		

		Integer[] data = new Integer[5];
		for(int i=1;i<=data.length;i++)
			data[i-1] = Integer.valueOf(10*i);
		LLNode headNode = CLinkedList.constructCLL(data);
		
		//Print the linked list 
		CLLOp.printCLL(headNode);
		
		//Delete the first one
		headNode = CLLOp.deleteCLL(headNode,1);
		System.out.println("\nLinkedListOperations after deleting at 1st position: ");
		CLLOp.printCLL(headNode);		
		
		//Delete the third Node
		headNode = CLinkedList.constructCLL(data);
		headNode = CLLOp.deleteCLL(headNode,3);
		System.out.println("\nLinkedListOperations after deleting at 3rd position: ");
		CLLOp.printCLL(headNode);
		
		//Delete the last node
		headNode = CLinkedList.constructCLL(data);
		headNode = CLLOp.deleteCLL(headNode,5);
		System.out.println("\nLinkedListOperations after deleting at 5th position: ");
		CLLOp.printCLL(headNode);
		
		
	}
	
	public static void insertTest(){
		
		Integer[] data = new Integer[5];
		for(int i=1;i<=data.length;i++)
			data[i-1] = Integer.valueOf(10*i);
		LLNode headNode = CLinkedList.constructCLL(data);
		
		//Print the linked list 
		CLLOp.printCLL(headNode);
		
		LLNode nodeToInsert = new LLNode(new Integer(25));
		
		//Insert at first position
		headNode = CLLOp.insertCLL(headNode,nodeToInsert,1);
		System.out.println("\nLinkedListOperations after inserting at 1st position: ");
		CLLOp.printCLL(headNode);
		
		//Insert at position 3
		headNode = CLinkedList.constructCLL(data);
		headNode = CLLOp.insertCLL(headNode,nodeToInsert,3);
		System.out.println("\nLinkedListOperations after inserting at 3rd position: ");
		CLLOp.printCLL(headNode);
		
		//Insert at last position
		headNode = CLinkedList.constructCLL(data);
		headNode = CLLOp.insertCLL(headNode,nodeToInsert,6);
		System.out.println("\nLinkedListOperations after inserting at 6th position: ");
		CLLOp.printCLL(headNode);
				
		
	}
}
