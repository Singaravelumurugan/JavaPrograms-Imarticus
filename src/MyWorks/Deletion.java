package MyWorks;

import java.util.Scanner;

public class Deletion {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements ");
		int n=s.nextInt();
		int a[]=new int[n+1];
		System.out.println("Enter the all elements ");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Remove the position ");
		int pos=s.nextInt();
		for(int i=pos;i<n;i++) {
			a[i-1]=a[i];
		}
		n=n-1;
		System.out.print("After Deletion  ");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
