package Assesment1;

import java.util.Scanner;

public abstract class SingleDigit2 {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int num = sc.nextInt();
		        int sum = 0;
		        while (num > 0 || sum > 9) {
		            if (num == 0) {
		                num = sum;
		                sum = 0;
		            }
		            sum += num % 10;
		            num /= 10;
		        }
		        System.out.println("The sum of digits until single digit is " + sum);

		}
}