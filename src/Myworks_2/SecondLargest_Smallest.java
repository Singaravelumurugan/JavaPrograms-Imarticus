package Myworks_2;

import java.util.Scanner;

public class SecondLargest_Smallest {

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
					 temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;
				 }
			 }
		 }
		 System.out.println("Local Maxima Number is "+a[n-1]);
		
	}

}
