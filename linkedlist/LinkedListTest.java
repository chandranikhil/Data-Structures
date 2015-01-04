/*package linkedlist;

import linkedlist.LLNode;
import linkedlist.LinkedList;
import linkedlist.LLOp;

public class LinkedListTest {

	public static void main(String args[]){
		
		insertTest();
		deleteTest();
		
	}
	
	public static void deleteTest(){
		

		Integer[] data = new Integer[5];
		for(int i=1;i<=data.length;i++)
			data[i-1] = Integer.valueOf(10*i);
		LLNode headNode = LinkedList.constructLL(data);
		
		//Print the linked list 
		LLOp.printLL(headNode);
		
		//Delete the first one
		headNode = LLOp.deleteNode(headNode,1);
		System.out.println("\nLinkedListOperations after deleting at 1st position: ");
		LLOp.printLL(headNode);		
		
		//Delete the third Node
		headNode = LinkedList.constructLL(data);
		headNode = LLOp.deleteNode(headNode,3);
		System.out.println("\nLinkedListOperations after deleting at 3rd position: ");
		LLOp.printLL(headNode);
		
		//Delete the last node
		headNode = LinkedList.constructLL(data);
		headNode = LLOp.deleteNode(headNode,5);
		System.out.println("\nLinkedListOperations after deleting at 5th position: ");
		LLOp.printLL(headNode);
		
		
	}
	
	public static void insertTest(){
		
		Integer[] data = new Integer[5];
		for(int i=1;i<=data.length;i++)
			data[i-1] = Integer.valueOf(10*i);
		LLNode headNode = LinkedList.constructLL(data);
		
		//Print the linked list 
		LLOp.printLL(headNode);
		
		LLNode nodeToInsert = new LLNode(new Integer(25));
		
		//Insert at first position
		headNode = LLOp.insertNode(headNode,nodeToInsert,1);
		System.out.println("\nLinkedListOperations after inserting at 1st position: ");
		LLOp.printLL(headNode);
		
		//Insert at position 3
		headNode = LinkedList.constructLL(data);
		headNode = LLOp.insertNode(headNode,nodeToInsert,3);
		System.out.println("\nLinkedListOperations after inserting at 3rd position: ");
		LLOp.printLL(headNode);
		
		//Insert at last position
		headNode = LinkedList.constructLL(data);
		headNode = LLOp.insertNode(headNode,nodeToInsert,6);
		System.out.println("\nLinkedListOperations after inserting at 6th position: ");
		LLOp.printLL(headNode);
				
		
	}
	
}*/
