package Pattern;

import java.util.Scanner;

public class Pattern_program3 {

	public static void main(String[] args) {
		int n ,i,j,space;
		Scanner s= new Scanner (System.in);
		 System.out.print("Enter the number of lines: "); 
		 n=s.nextInt();
		 for(i=1;i<=n;i++) {
			 for(j=2*(n-i);j>=1;j--) {		 		//practice
				 System.out.print(" ");	
			 }
			 for(j=1;j<=i;j++) {
				 System.out.print(j+" ");
			 }
			 System.out.println();
		 }/*
		 for(i=1;i<=n;i++) {
			 for(j=2*(n-i);j<=1;j--) {		
				 System.out.print(" ");	
			 }
			 for(j=1;j>=n;j--) {
				 System.out.print("* ");
			 }
			 System.out.println();
		 }*/

	}

}
