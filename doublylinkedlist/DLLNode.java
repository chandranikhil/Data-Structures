package doublylinkedlist;

public class DLLNode {

	Object data;
	DLLNode next;
	DLLNode previous;
	
	public DLLNode(Object data){
		this.data=data;
	}
	
	public void  setData(Object data){
		this.data = data;
	}
	
	public Object getData(){
		return this.data;
	}
	
	public void setNext(DLLNode next){
		this.next = next;
	}
	
	public DLLNode getNext(){
		return this.next;
	}
	
	public DLLNode getPrevious(){
		return this.previous;
	}
	
	public void setPrevious(DLLNode previous){
		this.previous = previous;
	}
	
	
}
