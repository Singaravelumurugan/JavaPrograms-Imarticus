package Programs;

import java.util.Scanner;

public class Nobita {
	int purchasing, selling;

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the pricing value:");
		int purchasing=sc.nextInt();
		System.out.println("Enter the selling value:");
		int selling=sc.nextInt();
		
		System.out.println("Difference:"+Math.abs(purchasing-selling));
		
		
	}

}
