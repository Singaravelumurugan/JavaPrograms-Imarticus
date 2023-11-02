package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList <String> a1= new ArrayList <String>();
		a1.add("C");
		a1.add("A");
		a1.add("E");
		a1.add("B");
		a1.add("D");
		a1.add("F");
	    System.out.print("Original contents of a1 : ");
	    Iterator<String> itr=a1.iterator();
	    while(itr.hasNext()){
	    Object element=itr.next();
	    System.out.print(element+" ");
		
	}
	System.out.println();
	
	ListIterator<String> litr=a1.listIterator();
	while(litr.hasNext()){
	  Object element=litr.next();
	  litr.set(element+"+");
	
	}
	   System.out.print("Modified contents of a1 : ");
	   itr=a1.iterator();
	   while(itr.hasNext()){
		    Object element=itr.next();
		    System.out.print(element+" ");
   
	   }
	   System.out.println();
	   System.out.print("Modified list backwards  ");
	   while(litr.hasPrevious()){
	   Object element=litr.previous();
	    System.out.print(element+" ");

	   }
	    System.out.println();

	}
}
