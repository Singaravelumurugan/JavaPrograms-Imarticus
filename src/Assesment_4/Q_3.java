package Assesment_4;

import java.util.Scanner;

public class Q_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the all array elements one by one");
		for (int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		for (int i=0;i<n-1;i++) {
			int max =n-i-1;
			for(int j=n-i-2;j>=0;j--) {
				if(a[max]<a[j]) {
					max=j;
				}
			}
			int temp=a[max];
			a[max]=a[n-i-1];
			a[n-i-1]=temp;
		
		}
		System.out.println("Array after sort :");
		for(int i=0;i<n;i++) {
		System.out.print(a[i]+" ");
	}

	}
	}
