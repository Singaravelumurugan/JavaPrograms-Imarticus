package Assesment1;
import java.util.Scanner;
public class Duck_Number {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int num = sc.nextInt();
		        int lastDigit = 0;
		        while (num > 0) {
		            lastDigit = num % 10;
		            if (lastDigit == 0) {
		                System.out.println(num + " is a duck number.");
		                break;
		            }
		            num /= 10;
		        }
		        if (lastDigit != 0) {
		            System.out.println(num + " is not a duck number.");
		        }
		    }
		}
