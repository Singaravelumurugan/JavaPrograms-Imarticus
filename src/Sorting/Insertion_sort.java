package Sorting;

import java.util.Scanner;

public class Insertion_sort {
	static void insertionsort(int a[],int n){
		for(int step=1;step<n;step++) {
			int key=step;
			for (int i=step-1;i>=0;i--) {
				if (a[i]>a[key]) {
				int	temp=a[i];
					a[i]=a[key];
					a[key]=temp;
					key--;
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
		insertionsort(a,n);
		System.out.println("Array after sort :");
		printarray(a,n);
		s.close();
	}

}
