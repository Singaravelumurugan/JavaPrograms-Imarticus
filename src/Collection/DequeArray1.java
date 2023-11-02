package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeArray1 {

	public static void main(String[] args) {
		Deque<String> dq= new ArrayDeque<String>();
		dq.add("Rick");
		dq.add("Glen");
		dq.add("Negan");
		dq.add("Maggie");
		dq.add("Daryl");
		System.out.println("Element in Deque "+dq);
		System.out.println("Remove Element: "+dq.removeLast());
		System.out.println("Element in Deque "+dq);

		System.out.println("Remove Element : "+dq.removeFirst());
		System.out.println("Element in Deque "+dq);
		dq.addFirst("Charlas");		
		System.out.println("Element in Deque "+dq);
		System.out.println("Head Element : "+dq.element());
		System.out.println("poll(): "+dq.pollLast());
		System.out.println("peek(): "+dq.peek());
		
		System.out.println("Element in Deque "+dq);
		System.out.println("Element in Empty: "+dq.isEmpty());

		


	}

}
