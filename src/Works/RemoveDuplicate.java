package Works;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		System.out.println ("Enter the number of Elements ");
		int n= s.nextInt();
		int[] a= new int[n];
		System.out.println ("Enter the all  Elements ");
		for (int i=0;i<n;i++) {
			a[i]=s.nextInt();	
		}
		Set<Integer> set=new HashSet<Integer>(); 
		for (int i=0;i<n;i++) {
		set.add(a[i]);
		}
		TreeSet<Integer> sortedSet=new TreeSet<Integer>(set); 
		System.out.println("The sorted list is : ");
		for(int sort:sortedSet)
		System.out.print(sort+" ");
		s.close();	
	}
}
