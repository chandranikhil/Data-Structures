package tree;

public class BTNode {

	Object data;
	private BTNode left;
	private BTNode right;


	public Object getData(){
		return this.data;
	}
	
	public void setData(Object data){
		this.data = data;
	}
	
	public void setRight(BTNode right){
		this.right = right;
	}
	
	public void setLeft(BTNode left){
		this.left = left;
	}
	
	public BTNode getRight(){
		return this.right;
	}
	
	public BTNode getLeft(){
		return this.left;
	}

}