package Programs;

import java.util.Scanner;

public class Perimeter {

	public static void main(String[] args) {
		int Length = 0 ,Breadth = 0 ,Height = 0 ;
		
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the Length:");
		int length=sc.nextInt();
		System.out.println("Enter the Breadth:");
		int breadth=sc.nextInt();
		System.out.println("Enter the Height:");
		int height=sc.nextInt();
		
		
			System.out.println("Multification:"+(4*(length+breadth+height)));
		
		
	}

}
