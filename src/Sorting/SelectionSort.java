package Sorting;

import java.util.Scanner;

public class SelectionSort {

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
			int min_index=step;
			for(int i=step+1;i<n;i++) {
				if(a[min_index]>a[i]) {
					min_index=i;
				}
			}
		int temp=a[step];
		a[step]=a[min_index];
		a[min_index]=temp;
		}
		System.out.println("Array after Search sort ");
		for (int i=0;i<n;i++) {
			System.out.print(a[i]+" ");

		}
	}

}
