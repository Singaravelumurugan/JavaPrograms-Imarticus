package Assesment_4;

import java.util.Stack;

public class Q_4 {
				static void pushelement(Stack<Integer>stk,int x) {
					stk.push(x);
					System.out.println("Push : "+x);
					System.out.println("Stack  : "+stk);
				}
				static void popelement(Stack<Integer> stk) {
					if(stk.isEmpty()) {
					System.out.println("Stack is empty");
				}else {
					Integer x=(Integer)stk.pop();
					System.out.println("Pop : "+x);
					System.out.println("Stack  : "+stk);
				}
				}

	public static void main(String[] args) {
		Stack<Integer> stk =new Stack<Integer>();
		popelement(stk);
		pushelement(stk,10);
		pushelement(stk,20);
		pushelement(stk,30);
		pushelement(stk,40);
		pushelement(stk,50);
		popelement(stk);
		pushelement(stk,60);
		pushelement(stk,70);
		popelement(stk);
		System.out.println("Stack is full ");
	}

}
