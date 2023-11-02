package Myworks_2;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class Set_2 {

	public static void main(String[] args) {
		int a[]= {34,20,10,60,75,58,20};
		Set<Integer> s=new HashSet<Integer>();
		for (int i=0;i<a.length;i++) {
			s.add(a[i]);
		}
		System.out.println(s);
		TreeSet<Integer> tre=new TreeSet<Integer>(s);
		System.out.println(tre);
		System.out.print("First element: ");
		System.out.println(tre.first());
		System.out.print("Last element: ");

		System.out.println(tre.last());


		
	}

}
