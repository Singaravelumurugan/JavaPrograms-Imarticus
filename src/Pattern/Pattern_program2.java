package Pattern;

import java.util.Scanner;

public class Pattern_program2 {

	public static void main(String[] args) {
		int n ,i,j,space;
		Scanner s= new Scanner (System.in);
		 System.out.print("Enter the number of lines: "); 
		 n=s.nextInt();
		 for(i=1;i<=n;i++) {
			 for(space=n;space>i;space--) {		
				 System.out.print(" ");	
			 }
			 for(j=1;j<=i;j++) {
				 System.out.print("* ");
					 }
					 System.out.println();
				 }
		 for(i=2;i<=n;i++) {
			 for(space=1;space<i;space++) {		
				 System.out.print(" ");	
			 }
			 for(j=n;j>=i;j--) {
				 System.out.print("* ");
					 }
					 System.out.println();
				 }
			 

	}

}
