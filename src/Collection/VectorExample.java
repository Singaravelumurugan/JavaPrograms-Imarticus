package Collection;
import java.util.*;
public class VectorExample {

	public static void main(String[] args) {
		Vector<String> vec=new Vector <String> (2);
		
		
		vec.addElement("Apple"); 
		vec.addElement("Orange");
		vec.addElement("Mango");
		vec.addElement("Fig");	// this 4 elements is add one time =capacity is 4
		System.out.println("Size is : "+vec.size());
		System.out.println("Default capacity increment is : "+vec.capacity());
		
		vec.addElement("Fruit1");//how many times u add the element =capacity is double
		vec.addElement("Fruit2");
		vec.addElement("Fruit3");	//this 3 elements is add second time =capacity is 8
		

		System.out.println("Size after addition is : "+vec.size());
		System.out.println("Capacity after increment is : "+vec.capacity());
		
		
		Enumeration<String> en =vec.elements();
		System.out.println("\nElements are :");
		while(en.hasMoreElements())
		System.out.print(en.nextElement()+" ");
	}

}
