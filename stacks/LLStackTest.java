package stacks;

public class LLStackTest {

	public static void main(String args[]){
		testIsEmpty();
		pushTest();
		topTest();
	}
	
	public static void  testIsEmpty(){
		LLStacks stack = new LLStacks();
		System.out.println("Stack is Empty:"+ stack.isEmpty());
	}
	
	public static void pushTest(){
		
		LLStacks stack =  new LLStacks();
		for ( int i=0;i<10;i++)
			stack.push(new Integer(i));
		
		while(!stack.isEmpty())
			System.out.println(stack.pop());
		//Trying to pop from an empty stack !
		stack.pop();
	}
	
	public static void topTest(){
		LLStacks stack =  new LLStacks();
		for ( int i=0;i<10;i++)
			stack.push(new Integer(i));
		
		System.out.println("The top is "+stack.top());
		stack.pop();
		System.out.println("The new top is "+stack.top());
		
	}

}
