package Collection;

import java.util.ArrayList;

public class javaex1 {

	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList <Comparable> a1= new ArrayList <Comparable>();// All type of Datatypes
		a1.add("Steve");
		a1.add("Tim");
		a1.add("Lucy");
		a1.add("Pat");
		a1.add("Angela");
		a1.add("Tom");
		a1.add(3);
		a1.add(12.0);

		System.out.println(a1);
		
		a1.remove("Steve");
		a1.remove("Angela");
		
		System.out.println(a1);
		
		a1.remove(2);
		a1.add(1,"Harshita"); // 1 is a index number
		a1.add(4,"Jasmine");// 4 is a index number = add 4th index and extend the size

		System.out.println(a1);
		System.out.println(a1.size());



	}

}
