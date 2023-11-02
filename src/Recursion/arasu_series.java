package Recursion;

import java.util.Scanner;

public class arasu_series {

	public static void main(String[] args) {
		int n;
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter the value of n:");
		 n=s.nextInt();
		 for (int i=1;i<=4;i++) {
			System.out.print((i*i+1)+" "); 
		 }
		 s.close();
	}

}
