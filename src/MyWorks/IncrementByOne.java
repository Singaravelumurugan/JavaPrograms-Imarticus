package MyWorks;

import java.util.Scanner;

public class IncrementByOne {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements ");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the all elements ");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
			a[i]++;
		}
		System.out .print("After Increment ");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
