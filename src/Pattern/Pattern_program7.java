package Pattern;

import java.util.Scanner;

public class Pattern_program7 {		// Characters

	public static void main(String[] args) {
		int n ,i,j,space;
		char ch;
		Scanner s= new Scanner (System.in);
		 System.out.print("Enter the number of lines: "); 
		 n=s.nextInt();
		 for(i=1;i<=n;i++) {
			 for(space=n;space>i;space--) {		
				 System.out.print(" ");	
			 }
			 ch='A';
			 for(j=1;j<=i;j++) {
				 System.out.print(ch+++" ");
					 }
					 System.out.println();
				 }
	}

}
