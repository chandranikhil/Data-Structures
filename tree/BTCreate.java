package tree;
import java.util.Arrays;

import tree.BTNode;
public class BTCreate {

	public static BTNode createFromPreandIn(Object[] inOrderData, Object[] preOrderData){
		
		if(inOrderData.length!=preOrderData.length){
			System.out.println("ERROR in Traversal Array length enequal");
			return null;
		}
				
		BTNode root = new BTNode();
		Object rootData =  preOrderData[0];
		root.setData(rootData);
		
		if(inOrderData.length==1)
			return root;
		
		int inOrderIndex = Arrays.binarySearch(inOrderData, rootData);
		Object[] leftSubInOrderData = Arrays.copyOfRange(inOrderData, 0, inOrderIndex);
		Object[] leftSubPreOrderData = Arrays.copyOfRange(preOrderData, 1, inOrderIndex+1);
		Object[] rightSubInOrderData = Arrays.copyOfRange(inOrderData, inOrderIndex+1, inOrderData.length);
		Object[] rightSubPreOrderData = Arrays.copyOfRange(preOrderData, inOrderIndex+1, inOrderData.length);
		
		root.setLeft(createFromPreandIn( leftSubInOrderData, leftSubPreOrderData));
		root.setRight(createFromPreandIn(rightSubInOrderData,rightSubPreOrderData));
		return root;
		
	}
}
