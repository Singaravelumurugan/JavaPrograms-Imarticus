package Loop;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int num,f1,f2,f3  ;
		f1=0; f2=1;
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the total number generate:");
		 num =s1.nextInt();
		 System.out.println("Fibonacci Series");
		 for (int i=0; i<num;i++) {
			 f3=f1+f2;
			 f1=f2;
			 f2=f3;
			 System.out.print(f1+" ");
			 s1.close();
		 }
		
	}

}
