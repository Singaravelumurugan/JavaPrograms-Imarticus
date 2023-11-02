package Class_Objects;

import java.util.Scanner;

public class Tech_Number {		//ex:2025 is a Tech number

	public static void main(String[] args) {
		 int n, num, leftNumber, rightNumber, digits = 0,
			        sumSquare = 0;
			        try (Scanner sc = new Scanner(System.in)) {
						System.out.print("Enter number=");
						n = sc.nextInt();
					}
			        num = n;
			        while (num > 0)
			        {
			            digits++;
			            num = num / 10;
			        }
			        if (digits % 2 == 0)
			        {
			            num = n;
			            leftNumber = num % (int) Math.pow(10, digits / 2);
			            rightNumber = num / (int) Math.pow(10, digits / 2);

			            sumSquare = (leftNumber + rightNumber) * (leftNumber + rightNumber);
			            if (n == sumSquare)
			            {
			                System.out.println("Tech Number");
			            }
			            else
			            {
			                System.out.println("Not Tech Number");
			            }
			        }
			    }
			}