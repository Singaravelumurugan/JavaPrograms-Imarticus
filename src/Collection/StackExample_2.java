package Collection;

import java.util.Stack;

public class StackExample_2 {
	static void pushelement (Stack<Integer> stk,int x) {
		stk.push(x);
		System.out.println("push ->" +x);
		System.out.println("stack: " +stk);

	}
	static void popelement (Stack<Integer> stk) {
		if (stk.isEmpty()) {
			System.out.println("stack is empty");
		}else {
		//System.out.print("pop ->");
		Integer x= (Integer)stk.pop();
		System.out.println("pop -> " +x);
		System.out.println("stack: " +stk);
		}
	}

	public static void main(String[] args) {
		Stack <Integer> stk = new Stack<Integer>();
		System.out.println("stack: " +stk);
	/*	try {
			popelement(stk);
		}
		catch (EmptyStackException e) {
			System.out.println("empty stack");
		}*/
		popelement(stk);
		
		pushelement(stk, 20); // pushelement meaning is add
		pushelement(stk, 13);
		pushelement(stk, 89);
		pushelement(stk, 90);
		pushelement(stk, 11);
		pushelement(stk, 45);
		pushelement(stk, 18);
		//popping elements from the stack
		popelement(stk);// popelement meaning is remove
		popelement(stk);
		//peek() will print the top element 
		System.out.println(stk.peek());
		int loc = 1+ stk.search(13);
		System.out.println("Location :"+loc); //top la irunthu count pannum

		



	}

}
