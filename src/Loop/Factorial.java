package Loop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	    int num,fact=1;
		Scanner s = new Scanner (System.in);
		 System.out.print("Enter the number:");
		 num =s.nextInt();
		 for(int i =num; i>0;i--) {
			 fact=fact*i;
		 }
		 System.out.printf("Factorial is %d",fact);
		 s.close();
	}

}
