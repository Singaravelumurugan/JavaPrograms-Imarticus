package Assesment_3;

import java.util.Scanner;

public class Q_9 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter number of rows in first matrix:");
		int r=s.nextInt();
		System.out.println("Enter number of column in first matrix:");
		int c=s.nextInt();
		int a[][]=new int[r][c];
		System.out.println("Enter the all elements ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=s.nextInt();
			}
		}
		int count=0;
		int count2=0;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(a[i][j]%2==0) {
					count++;
				}else {
					count2++;
				}
	}
		}
		System.out.println("Odd number frequency");
		System.out.print(count2);
		System.out.println();
		System.out.println("Even number frequency");
		System.out.print(count);

	}
}
