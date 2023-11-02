package Myworks_2;
import java.util.Scanner;
  class BubbleSort {
	  
	  static void bubblesort(int []a,int n) {
		  int temp = 0;
		  for (int i=0;i<n-1;i++) {
			  for(int j=0;j<n-i-1;j++) {
				  if(a[j]>a[j+1]) { 
					  temp=a[j];
					  a[j]=a[j+1];
					  a[j+1]=temp;
			  }
			  }
		  }
	  }
		 static void printArray(int a[],int n) {
				for (int i=0;i<n;i++) 
					System.out.print(a[i]+" ");
				System.out.println();
			}

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the number of elements ");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the All Array Elements : ");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		
		}
		bubblesort(a, n);
		System.out.println("After bubblesort ");
		printArray(a, n);
		
	}

}
