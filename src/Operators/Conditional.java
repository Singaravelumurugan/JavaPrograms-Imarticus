package Operators;

import java.util.Scanner;

public class Conditional {

	public static void main(String[] args) {
		int num;
		String result;
		Scanner s =new Scanner (System.in);
		System.out.println("Enter the Number:");
		num =s.nextInt();
		result= (num%2==0)? "Even Number":"Odd Number";
		System.out.println(result);
		s.close();
	}

}
