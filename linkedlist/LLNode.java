package linkedlist;

public class LLNode {

	private Object data;
	private LLNode next;
	
	public LLNode(Object data){
		
		this.data = data;
	}
	
	public void setData(Object data){
		this.data = data;
	}
	
	public Object getData(){
		
		return this.data;
	}
	
	public void setNext(LLNode next){
		
		this.next = next;
		
	}
	
	public LLNode getNext(){
		
		return this.next;
	}
	
}
