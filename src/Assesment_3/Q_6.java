package Assesment_3;

import java.util.Scanner;

public class Q_6 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the number array ");
		int n=s.nextInt();
		int[]a=new int[n];
		System.out.println("Enter Array elements ");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		if (a[0]<= a[1] &&
	            a[n-2]<=a[n-1]){
			   System.out.println("The given array is strictly increasing");
		} else {
	            System.out.println("The given array is not strictly increasing");	
		}
	}

	}
