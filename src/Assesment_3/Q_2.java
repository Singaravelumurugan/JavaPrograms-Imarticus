package Assesment_3;

import java.util.Scanner;

public class Q_2 {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 System.out.print("Enter number of elements in the array:");
		int n = s.nextInt();
		 int a[] = new int[n];
		 System.out.println("Enter elements of array:");
		for(int i=0;i<n;i++) {
		a[i]=s.nextInt();	
		}
		int temp;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
			 if(a[i]>a[j]) {
			 temp = a[i];
			 a[i] = a[j];
			 a[j] = temp;
			 }
			 }
			 }
			 System.out.println("Second Largest:"+a[n-2]);
			 System.out.println("Smallest:"+a[0]);
			 }
			}
