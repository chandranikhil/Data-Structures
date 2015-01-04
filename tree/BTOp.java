package tree;

import tree.BTCreate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import queues.LLQueue;
import linkedlist.LLNode;
import linkedlist.LLOp;

public class BTOp {
	public static int diameter=0;
	public static void main(String args[]){
		int[] inOrder = {3,2,1,4,5,7,6}; 
		int[] preOrder= {4,2,3,1,7,5,6};	
		
		Integer[] inOrderData = new Integer[inOrder.length];
		Integer[] preOrderData =  new Integer[preOrder.length];
		
		Integer sData = Integer.valueOf(4);
		Integer sNotData = Integer.valueOf(10);
		
		for( int i=0;i<inOrder.length;i++)
			inOrderData[i] = Integer.valueOf(inOrder[i]);
		
		for( int i=0;i<preOrder.length;i++)
			preOrderData[i] = Integer.valueOf(preOrder[i]);
		
		
		BTNode root = BTCreate.createFromPreandIn(inOrderData,preOrderData);
		List tree_pre =  preOrder(root);
		//List tree_post  =  postOrder(root);
		//List tree_in = inOrder(root);
		//List tree_l = levelOrder(root);
		//LLOp.printLL(flattenTree(root));
		System.out.println(Arrays.toString(tree_pre.toArray()));
		//System.out.println(Arrays.toString(tree_post.toArray()));
		//System.out.println(Arrays.toString(tree_in.toArray()));
		//System.out.println(Arrays.toString(tree_l.toArray()));
		//System.out.println(addAll(root));
		//System.out.println(sizeOfTree(root));
		System.out.println(findHeight(root));
		System.out.println(findDiameter(root));
		//System.out.println(findLevel(root));
		//System.out.println(hasSum(root,9));
		//System.out.println(findMax(root));
		//System.out.println(searchBT(root,sData));
		//System.out.println(findDeepest(root).getData());
		//deleteBT(root,sData);
		//System.out.println(Arrays.toString(preOrder(root).toArray()));	
				
	}
	
	public static BTNode insertInBT(BTNode root, Object data){
		
		BTNode newNode =  new BTNode();
		newNode.setData(data);
		
		if(root==null)
			return newNode;
		
		LLQueue newQ =  new LLQueue();
		newQ.enQ(root);
		
		while(!newQ.isEmpty())
		{
			BTNode temp = (BTNode)newQ.dQ();
			
			if(temp.getLeft()!=null)
				newQ.enQ(temp.getLeft());
			else
			{
				temp.setLeft(newNode);
				return root;
			}
			
			if(temp.getRight()!=null){
				newQ.enQ(temp.getRight());
				
			}
			else
			{
				temp.setRight(newNode);
				return root;
			}
			
		}
		
		return root;		
		
	}
	
	public static BTNode searchBT(BTNode root, Object data){
		
		if(root==null) return null;
		if(root.getData().equals(data))
			return root;
		else{
			BTNode find =  searchBT(root.getLeft(), data);
			{
				if(find==null)
					return searchBT(root.getRight(),data);
				else return find;
			}
		}
		
	}
	
	public static boolean deleteBT(BTNode root, Object data){
		
		if(root==null) return false;
		BTNode temp =  searchBT(root,data);
		if(temp!=null){
			BTNode deepest =  findDeepest(root);
			temp.setData(deepest.getData());
			deepest.setData(Integer.valueOf(0));
			deepest=null;			
			return true;
		}
		else
			return false;
					
			
	}
	
	public static BTNode findDeepest(BTNode root){
		if(root==null)
			return null;
		LLQueue Q =  new LLQueue();
		Q.enQ(root);
		BTNode temp = root;;
		
		while(!Q.isEmpty()){
			
			temp =  (BTNode)Q.dQ();
			if(temp.getLeft()!=null)
				Q.enQ(temp.getLeft());
			if(temp.getRight()!=null)
				Q.enQ(temp.getRight());
				
		}
		
		return temp;
	}

	public static List preOrder(BTNode root){
		
		if(root==null)
			return null;
		
		List preOrderList =  new ArrayList();
		
		preOrderList.add(root.getData());
		BTNode leftNode =  root.getLeft();
		if(leftNode!=null) preOrderList.addAll(preOrder(leftNode));
		BTNode rightNode =  root.getRight();
		if(rightNode!=null) preOrderList.addAll(preOrder(rightNode));
		
		return preOrderList;
		
	}
	
	public static List postOrder(BTNode root){
		if(root==null)
			return null;
		
		List postOrderList = new ArrayList();
		BTNode leftNode =  root.getLeft();
		if(leftNode!=null)
			postOrderList.addAll(postOrder(leftNode));
		BTNode rightNode =  root.getRight();
		if(rightNode!=null)
			postOrderList.addAll(postOrder(rightNode));
		
		postOrderList.add(root.getData());
		return postOrderList;
	}
	
	public static List inOrder(BTNode root){
		if(root==null)
			return null;
		List inOrderList  =  new ArrayList();
		BTNode leftNode = root.getLeft();
		if(leftNode!=null)
			inOrderList.addAll(postOrder(leftNode));
		inOrderList.add(root.getData());
		BTNode rightNode =  root.getRight();
		if(rightNode!=null)
			inOrderList.addAll(postOrder(rightNode));
		return inOrderList;
	}
	
	public static int addAll(BTNode root){
		if(root==null)
			return 0;
		else
			return ((Integer)(root.getData())).intValue()+addAll(root.getLeft())+addAll(root.getRight());
	}
	
	public static int findMax(BTNode root){
		int maxVal = 0;
		if(root!=null){
			int rootVal = ((Integer)root.getData()).intValue();
			int leftVal = findMax(root.getLeft());
			int rightVal =  findMax(root.getRight());
			
			maxVal = Math.max(leftVal,rightVal);
			maxVal = Math.max(rootVal, maxVal);
		}
		
		return maxVal;
	}
	
	public static int sizeOfTree(BTNode root){
		if (root==null) return 0;
		return 1 + sizeOfTree(root.getLeft()) + sizeOfTree(root.getRight());
	}
	
	public static int findHeight(BTNode root){
		if(root==null) return 0;
		int leftH =  findHeight(root.getLeft());
		int rightH =  findHeight(root.getRight());
		
		if(leftH>rightH)
			return leftH+1;
		else
			return rightH+1;
	}
	
	public static int findDiameter(BTNode root){
		
		if(root==null) return 0;
		int lH =  findHeight(root.getLeft());
		int rH = findHeight(root.getRight());
		
		int lD = findDiameter(root.getLeft());
		int rD = findDiameter(root.getRight());
		
		int maxVal =  Math.max(rD, lD);
		return Math.max(maxVal, lH+rH+1);
				
	}
	
	public static int findLevel(BTNode root){
		
		BTNode temp = new BTNode();
		int level=1, maxLevel =0;
		int currentSum =0 , maxSum=0;
		
		LLQueue Q = new LLQueue();
		Q.enQ(root);
		Q.enQ(null);
		
		while(!Q.isEmpty()){
			temp = (BTNode)Q.dQ();
			
			if(temp==null){
				if(currentSum>maxSum)
				{
					maxSum = currentSum;
					maxLevel =  level;
				}
				currentSum=0;
				level++;
				if(!Q.isEmpty())
					Q.enQ(null);
			}			
			else{
				currentSum+= ((Integer)temp.getData()).intValue();
				if(temp.getLeft()!=null)
					Q.enQ(temp.getLeft());
				if(temp.getRight()!=null)
					Q.enQ(temp.getRight());				
			}
			
			
		}
		return maxLevel;
	}
	
		
	public static boolean hasSum(BTNode root,int sum){
		if(root==null)
			return (sum==0);
		else
			{
			int subSum = sum-((Integer)root.getData()).intValue();
			return(hasSum(root.getLeft(),subSum)||hasSum(root.getRight(),subSum));			
			}
			
				
	}
	
	public static List levelOrder(BTNode root){
		
		if(root==null)
			return null;
		List levelOrder = new ArrayList();
		LLQueue Q = new LLQueue();
		Q.enQ(root);
		
		while(!Q.isEmpty()){
			BTNode temp = (BTNode)Q.dQ();
			levelOrder.add(temp.getData());
			if(temp.getLeft()!=null)
				Q.enQ(temp.getLeft());
			if(temp.getRight()!=null)
				Q.enQ(temp.getRight());				
		}
		
		return levelOrder;
	}
	
	public static LLNode flattenTree(BTNode root){
		if(root==null)
			return null;
		LLQueue Q = new LLQueue();
		LLNode head = new LLNode(root.getData());
		LLNode pHead = head;
		Q.enQ(root);
		while(!Q.isEmpty()){
			BTNode temp = (BTNode)Q.dQ();
			LLNode temp_node = new LLNode(temp.getData());
			pHead.setNext(temp_node);
			pHead = pHead.getNext();
			if(temp.getLeft()!=null)
				Q.enQ(temp.getLeft());
			if(temp.getRight()!=null)
				Q.enQ(temp.getRight());	
		}		
		return head.getNext();
	}
	
}
	

