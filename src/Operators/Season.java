package Operators;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		  try (Scanner in = new Scanner(System.in)) {
			System.out.print("Enter month's number: ");
	        int monthNumber;
	        monthNumber = in.nextInt();
	        switch (monthNumber) {
	        case 1,2,3,4:
	            System.out.println("Summer");
	            break;
	        
	        case 5,6,7,8:
	            System.out.println("Rainy");
	            break;
	       
	        case 9,10,11,12:
	            System.out.println("Winter");
	            break;
	      
	        default:
	            System.out.println("Invalid month.");
	            break;
	        }
		}

	}

}
