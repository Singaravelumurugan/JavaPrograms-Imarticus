package Class_Objects;

import java.util.Scanner;

public class Spy_Number {		//examples: 1124,22,123,132

	public static void main(String[] args) {
		int num,num1=1,temp=0,lastdigit;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number:");
		num = s.nextInt();
		
		while (num>0) {
			lastdigit=num%10;
			temp=temp+lastdigit;
			num1=num1*lastdigit;
			num=num/10;
		}
		if (temp==num1) {
			System.out.println("Spy Number:");
		}
		else {
			System.out.println("Not a Spy Number:");
		}

	}

}
