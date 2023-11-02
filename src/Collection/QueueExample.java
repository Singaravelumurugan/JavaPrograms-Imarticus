package Collection;
import java.util.*;

import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		/*
		 * We cannot create instance if queue as it is an
		 * interface we can create Linkedlist or
		 * PriorityQueue and assign it to queue
		 * */
		
		Queue<String> q =new LinkedList <String>();
		q.add("Rick");
		q.add("Maggie");
		q.add("Glen");
		q.add("Negan");
		q.add("Daryl");
		
		System.out.println("Element in Queue "+q);
		
		System.out.println("Remove Element "+q.remove());
		
		System.out.println("Head Element "+q.element());
		
		System.out.println("poll() "+q.poll());
		
		System.out.println("peek() "+q.peek());
		
		System.out.println("Element in Queue "+q);





		




	}

}
