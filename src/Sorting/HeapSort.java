package Sorting;

import java.util.Scanner;

public class HeapSort {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements of the array");
		for (int i=0;i<n;i++) {
			a[i]=s.nextInt();
			}
		for(int step=0;step<n-1;step++) {
			int max_index=n-step-1;
			for(int i=n-step-2;i>=0;i--) {
				if(a[max_index]<a[i]) {
					max_index=i;
				}
			}
			int temp=a[max_index];
			a[max_index]=a[n-step-1];
			a[n-step-1]=temp;
		}
		System.out.println("Array after  sort ");
		for (int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
	}
	}
}
