package Myworks_2;
import java.util.Collections;
import java.util.Stack;
public class Stack_2 {
	static void pushelement(Stack <Integer> stk,int x) {
		stk.push(x);
		System.out.println("push "+x);
		System.out.println("Stack "+stk);
	}
	static void popelement(Stack <Integer> stk) {
		if(stk.isEmpty()) {
		System.out.println("Stack is empty "); 
		}else {
			Integer x =(Integer)stk.pop();
			System.out.println("pop "+x);
			System.out.println("Stack "+stk);

			
		}
		
	}
	public static void reverse(Stack<Integer> stk) {
	    stk.sort(Collections.reverseOrder());
	    System.out.println("Reversed List:");
	    System.out.println(stk);
	}

	public static void main(String[] args) {
		Stack <Integer> stk = new Stack<Integer>();
		
		pushelement(stk, 2);
		pushelement(stk,3);
		pushelement(stk, 4);
		pushelement(stk,5);
		reverse(stk);
		popelement(stk);
		popelement(stk);
	    System.out.println("peek "+stk.peek());
	    System.out.println("search "+stk.search(3));


	}

}
