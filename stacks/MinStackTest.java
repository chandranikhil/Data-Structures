package stacks;

public class MinStackTest {

	public static void main(String args[]){
		
		testMin();
	}
	
	public static  void testMin(){
		
		MinStack stack = new MinStack();
		
		stack.push(new Integer(9));
		stack.push(new Integer(4));
		stack.push(new Integer(2));
		stack.push(new Integer(6));
		stack.push(new Integer(7));
		stack.push(new Integer(3));
		
		while(!stack.isEmpty()){
			System.out.println(stack.top() + "------>"+ stack.getMin());
			stack.pop();
		}
		
		
	}
	
}
