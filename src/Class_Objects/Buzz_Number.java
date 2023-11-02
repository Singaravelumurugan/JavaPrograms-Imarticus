package Class_Objects;

import java.util.Scanner;

public class Buzz_Number {

	public static void main(String[] args) {
		int num;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number:");
		 num=s.nextInt();
   
        if (num%10==7||num%7==0)
        { System.out.println("Buzz Number:"+num);
        }
        else {
        	 System.out.println("Not a Buzz Number:"+num);	
        }
	}

}
