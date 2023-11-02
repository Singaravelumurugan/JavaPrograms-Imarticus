package Loop;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {

	int count=0,num;
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the number:");
	num =s.nextInt();
	
	while (num>0) {
		num= num/10;
		count++;
	}
	System.out.println("Count:"+count);
	}

}
