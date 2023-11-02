package Assesment_3;

import java.util.Scanner;

public class Q_3 {

	public static void main(String[] args) {
	
		Scanner s=new Scanner (System.in);
		System.out.print("Enter the number of  Element : ");
		int n=s.nextInt();
		int a[]=new int [n];	
		System.out.println("Enter the all  Elements : ");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();	
		}
		  System.out.print("Enter the k th position at which you want to check number: ");
	        int k=s.nextInt();
	        System.out.println("Number "+ a[k-1]);
	}

	}

