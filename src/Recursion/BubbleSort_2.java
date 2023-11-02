package Recursion;

import java.util.Scanner;

public class BubbleSort_2 {
	static void bubblesort(int a[],int n){
		for(int step=0;step<n-1;step++) {
			for (int i=0;i<n-step-1;i++) {
				if (a[i]>a[i+1]) {
				int	temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
						}
			}
		}
	}
	static void printarray(int a[],int n) {
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
	}
	}

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements one by one");
		for (int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		bubblesort(a,n);
		System.out.println("Array after sort :");
		printarray(a,n);
		s.close();
	}

}
