package Collection;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_2 {

	public static void main(String[] args) {
		ArrayList <String> arr= new ArrayList <String>();
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the number of elements");
		int n=s.nextInt();
		System.out.println("Enter the array elements one by one ");
		for(int i=0;i<n;i++) {
			arr.add(s.next());
		}
		arr.set(2, "Malathy");// (set) is replace the index
		System.out.println("Array List: ");
		System.out.println(arr);  // all elements are  one line print = normal method
		Collections.sort(arr); // this method using for Ascending order
		System.out.println("Array List using for each: ");
		for(String str1:arr) {  //all elements are next to next line or one by one print = for each loop
			System.out.println(str1);

		}
		System.out.println(arr.get(2)); //check the element of index
		System.out.println(arr.indexOf("Pat"));// check the index of elements
	



	}
	

}
