package Pattern;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		int n ,i,j,value;
		Scanner s= new Scanner (System.in);
		 System.out.print("Enter the number of lines: "); 
		 n=s.nextInt();
		 for ( i = 1; i <= n; i++)
		 {
		 if(i%2 == 0)
		 {
		 value = 0;
		 for (j = 1; j <= n; j++)
		 {
		 System.out.print(value);
		 value = (value == 0)? 1: 0;
		 }
		 }
		 else
		 {
		 value= 1;
		 for ( j = 1; j <= n; j++)
		 {
		 System.out.print(value);

		 value = (value == 0)? 1 : 0;
		 }
		 }

		 System.out.println();
		 }


	}

}
