package Loop;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int num,count = 0;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number:");
		num =s.nextInt();
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if (count==0) {
			System.out.println("Number "+num+ " is a Prime number");
		}else{
			System.out.println ("Number "+num+ " is not a Prime number");
		}s.close();
	}
}
