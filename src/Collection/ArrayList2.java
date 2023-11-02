package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList <String> arr= new ArrayList <String>();
		arr.add("Steve");
		arr.add("Tim");
		arr.add("Lucy");
		arr.add("Pat");
		arr.add("Angela");
		arr.add("Tom");
		arr.set(2, "Malathy");// (set) is replace the index
		System.out.println("Array List: ");
		System.out.println(arr);  // all elements are  one line print = normal method
		Collections.sort(arr); // this method using for Ascending order
		System.out.println("Array List using for each: ");
		for(String str1:arr) {  //all elements are next to next line or one by one print = for each loop
			System.out.println(str1);

		}
		System.out.println(arr.get(2)); //check the index of the element
		System.out.println(arr.indexOf("Pat"));// check the index of elements
		System.out.println(arr.contains("Pat")); // Indha element iruka illayannu check pannum. iruntha Yes illanna No
		arr.clear();		// Clear the all array elements 
		System.out.println(arr);

	}

}
