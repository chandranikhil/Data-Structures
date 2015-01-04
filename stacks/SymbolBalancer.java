package stacks;
import stacks.LLStacks;
public class SymbolBalancer {
	
	public static void main(String args[]){
		
		String expression = "(){}[]((()))[[[{{{}}}]]]";
		System.out.println("The expression " + expression +" is balanced: " 
				+ SymbolBalancer.isBalanced(expression));
	}
	
	public static boolean isBalanced(String expression){
		
		char arr[] = expression.toCharArray();
		LLStacks newStack =  new LLStacks();
		for (int i=0;i<arr.length;i++){
			if(arr[i]=='['||arr[i]=='('||arr[i]=='{')
				newStack.push(new Character(arr[i]));
			if(arr[i]==']'||arr[i]==')'||arr[i]=='}'){
				char open = ((Character)(newStack.pop())).charValue();
				if(!doesMatch(open,arr[i]))
					return false;
			}
				
		}
		if(!newStack.isEmpty())return false;
		return true;
		
		
	}

	public static boolean doesMatch(char open, char close){
		
		if( (open=='('&& close==')')||(open=='{'&& close=='}')||(open=='['&& close==']'))
			return true;
		else
			return false;
	}
}

