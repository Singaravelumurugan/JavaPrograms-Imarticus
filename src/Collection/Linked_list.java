package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_list {

	public static void main(String[] args) {
		LinkedList <String> list= new LinkedList <String>();
		
		list.add("Steve");
		list.add("Carl");
		list.add("Raj");
		
		list.addFirst("Negan");
		list.addLast("Rick");
		list.add(2,"Glenn");
		
		 System.out.println(list);

		
	//	list.removeFirst();
		 Iterator<String> iterator=list.iterator();
		 while(iterator.hasNext()){
		 System.out.println(iterator.next());


	}
	}
}
