package Works;

import java.util.Scanner;

public class FiboSeries {

	public static void main(String[] args) {
		int num,f1,f2,f3  ;
		f1=0; f2=1;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Fibo number ");
		 num =s.nextInt();
		 System.out.println("Fibonacci Series");
		 System.out.print("0 ");
		 for (int i=1; i<num;i++) {
			 f3=f1+f2;
			 f1=f2;
			 f2=f3;
			 System.out.print(f1+" ");
			 s.close();
		 }
		

	}

}
