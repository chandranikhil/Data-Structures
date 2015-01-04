package tree;
import tree.BTNode;
import java.util.Arrays;
import java.util.List;

public class BSTCreateTest {
	
	public static void main(String args[]){
		
		int[] inOrder = {2,4,6,8,10,12,14};
		int[] preOrder= {8,4,2,6,12,10,14};	
		
		Integer[] inOrderData = new Integer[inOrder.length];
		Integer[] preOrderData =  new Integer[preOrder.length];
		
		Integer sData = Integer.valueOf(4);
		Integer sNotData = Integer.valueOf(10);
		
		for( int i=0;i<inOrder.length;i++)
			inOrderData[i] = Integer.valueOf(inOrder[i]);
		
		for( int i=0;i<preOrder.length;i++)
			preOrderData[i] = Integer.valueOf(preOrder[i]);
		
		BTNode root = BSTCreate.createBST(inOrderData,preOrderData);
		
		List tree_pre =  BTOp.preOrder(root);
		System.out.println(Arrays.toString(tree_pre.toArray()));
		
		BTNode temp = findNum(root,22);
		if(temp!=null)
			System.out.println("Number Found!");
		else
			System.out.println("Number Not Found!");
		
		temp = insertBST(root,22);
		tree_pre =  BTOp.preOrder(root);
		System.out.println(Arrays.toString(tree_pre.toArray()));
		
		System.out.println(findMin(root));
		System.out.println(findMax(root));
		
	}
	
	public static BTNode findNum(BTNode root,int data){
		if(root==null) return null;
		if(data<((Integer)root.getData()).intValue())
			return findNum(root.getLeft(),data);
		if(data>((Integer)root.getData()).intValue())
			return findNum(root.getLeft(),data);
		return root;
		
	}
	
	public static BTNode insertBST(BTNode root, int data){
		
		if(root==null) {
			Integer temp =  new Integer(data);
			root = new BTNode();
			root.setData(temp);
			return root;
		}		
		if(data<((Integer)root.getData()).intValue())
			root.setLeft(insertBST(root.getLeft(),data));
		else if(data>((Integer)root.getData()).intValue())
			root.setRight(insertBST(root.getRight(),data));
		return root;		
		}
	
	public static int findMin(BTNode root){
		if(root==null) return -1;
		else
			if (root.getLeft()==null)
				return ((Integer)root.getData()).intValue();
			else return findMin(root.getLeft());		
	}
	
	public static int findMax(BTNode root){
		if(root==null) return -1;
		else
			if (root.getRight()==null)
				return ((Integer)root.getData()).intValue();
			else return findMax(root.getRight());		
	}
	
}
