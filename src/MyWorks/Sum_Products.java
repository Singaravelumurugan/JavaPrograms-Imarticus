package MyWorks;

import java.util.Scanner;

public class Sum_Products {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int product, num,rem,sum,result;
		System.out.println("Enter the Number:");
		 num =s.nextInt();
		 rem=num%10;
		 result=num/10;
		 sum=result+rem;
		 product=result*rem;
		 System.out.println("Sum value is "+sum);
		 System.out.println("Product value is "+product);
		 s.close();
	}

}
