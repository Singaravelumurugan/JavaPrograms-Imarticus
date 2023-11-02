package MyWorks;

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		int num,f1,f2,f3 = 0;
		f1=0;f2=1;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=s.nextInt();
		System.out.println("Fibo : ");
		for(int i=0;i<num;i++) {
		f3=f1+f2;
		f1=f2;
		f2=f3;
		System.out.print(f1+" ");
		}
	}

}
