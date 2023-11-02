package Collection;
import java.util.Stack;
public class StackEmpty {

	public static void main(String[] args) {
		
		Stack <Integer> stk=new Stack<Integer>();
		//checking Stack is empty or not
		boolean result=stk.empty();
		System.out.println("Stack is empty? "+result);
		//pushing elements in stack

		stk.push(78); // push meaning is Add 
		stk.push(113);
		stk.push(90);
		stk.push(120);
		// print elements in the stack
		System.out.println("Elements in Stack "+stk);
		result=stk.empty();
		System.out.println("Stack is empty? "+result);

	}

}
