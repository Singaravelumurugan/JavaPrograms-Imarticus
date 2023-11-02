package Operators;

import java.util.Scanner;

public class Logical {

	public static void main(String[] args) {
		int a=0, b=0, c=0;
		
			try (Scanner s = new Scanner(System.in)) {
				System.out.println("Enter the value of a:");
				a= s.nextInt();	
				System.out.println("Enter the value of b:");
				b= s.nextInt();
				System.out.println("Enter the value of c:");
				c= s.nextInt();
			}
			
			
				if (a>b&&a>c) {
					System.out.println("True");
				}
				else {System.out.println("False");
				}
				

	
	}
}
