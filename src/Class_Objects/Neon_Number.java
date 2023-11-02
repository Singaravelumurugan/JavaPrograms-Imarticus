package Class_Objects;

import java.util.Scanner;

public class Neon_Number {

	public static void main(String[] args) {
		int num, temp=0;
		Scanner s = new Scanner(System.in);		// Neon =9 =9*9=81; 8+1=9
		System.out.println("Enter the Number:");
		num = s.nextInt();
		int square=num*num;
		
		while(square!=0) {
			int digit=square%10;
			temp=temp+digit;
			square=square/10;
		}
		if (num==temp) {
			System.out.println("Neon Number:");
		}
		else {
			System.out.println("Not a Neon Number:");
		}
	}

}
