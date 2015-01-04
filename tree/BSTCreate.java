package tree;

import java.util.Arrays;

public class BSTCreate {

	public static BTNode createBST(Object[] inOrderData, Object[] preOrderData){
		Object[] inOrderCopy =  Arrays.copyOf(inOrderData,inOrderData.length);
		Arrays.sort(inOrderCopy);
		boolean sorted = Arrays.equals(inOrderData,inOrderCopy);
		if(sorted){
			return BTCreate.createFromPreandIn(inOrderData, preOrderData);
		}
		else
			return null;
	}
}
