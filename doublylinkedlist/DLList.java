package doublylinkedlist;

public class DLList {

	public static DLLNode constructDLL(Object[] data){
		
		DLLNode headNode = new DLLNode(data[0]);
		DLLNode currentNode = headNode;
		for ( int i=1;i<data.length;i++){
			currentNode.setNext(new DLLNode(data[i]));
			currentNode.getNext().setPrevious(currentNode);
			currentNode = currentNode.getNext();
		}
		
		return headNode;
	}
}
