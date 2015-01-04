package stacks;
import stacks.MinStack;
public class MinStack implements Stack {
	
	private LLStacks elementStack = new LLStacks();
	private LLStacks minStack =  new LLStacks();
	

	public void push(Object data) {
		elementStack.push(data);
		Integer minTop = (Integer)minStack.top();
		Integer stackData =  (Integer)data;
		if(minStack.isEmpty()|| minTop.intValue()>=stackData.intValue())	
			minStack.push(data);
		else
			minStack.push((Integer)minStack.top());
	}

	public Object top() {
		
		return elementStack.top();
	}

	public Object pop() {
		minStack.pop();
		return elementStack.pop();
		
	}

	public boolean isEmpty() {
		return elementStack.isEmpty();
	}

	public Object getMin(){
		return minStack.top();
	}
	
}
