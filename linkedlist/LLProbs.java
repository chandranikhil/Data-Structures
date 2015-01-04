package linkedlist;
import linkedlist.LLOp;
import linkedlist.LLNode;
import linkedlist.LinkedList;
public class LLProbs {
	
	public static void main(String args[]){
		Integer[] data = new Integer[5];
		for(int i=1;i<=data.length;i++)
			data[i-1] = Integer.valueOf(10*i);
		LLNode headNode = LinkedList.constructLL(data);
		LLOp.printLL(headNode);
		System.out.println("\n");
		LLOp.printLL(reverseLL(headNode));
		System.out.println("\n");
		headNode = LinkedList.constructLL(data);
		LLOp.printLL(reversePair(headNode));
	}
	public static LLNode reverseLL(LLNode head){
		
		LLNode firstNode =  head;
		LLNode secondNode = firstNode.getNext();
		LLNode thirdNode =  secondNode.getNext();
		firstNode.setNext(null);
		while(secondNode!=null){
			secondNode.setNext(firstNode);
			firstNode=secondNode;
			secondNode = thirdNode;
			if(thirdNode!=null)
				thirdNode = thirdNode.getNext();
		}
		return firstNode;
		
	}
	
	public static LLNode reversePair(LLNode head){
		
		LLNode firstNode =  head;
		 
		while(firstNode!=null && firstNode.getNext()!=null){
		Object temp = firstNode.getData();
		firstNode.setData(firstNode.getNext().getData());
		firstNode.getNext().setData(temp);
		firstNode =  firstNode.getNext().getNext();
		}
		return head;
	}
}
