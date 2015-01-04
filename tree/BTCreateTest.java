package tree;
import java.util.Arrays;
import tree.BTCreate;

public class BTCreateTest {

	public static void main(String args[]){
		
	}
	
	public static void btCreateTest(){
		
		int[] inOrder = {3,2,1,4,5,7,6};
		int[] preOrder = {4,2,3,1,7,5,6};
		
		Integer[] inOrderData = new Integer[inOrder.length];
		Integer[] preOrderData =  new Integer[preOrder.length];
		System.arraycopy(inOrder,0,inOrderData,0,inOrder.length);
		System.arraycopy(preOrder,0,preOrderData,0,preOrder.length);
		BTNode root = BTCreate.createFromPreandIn(inOrderData, preOrderData);
	}
}

