package Pattern;

import java.util.Scanner;

public class Pattern_program4 {

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
				 if(j==1||j==i) {
				 System.out.print("* ");
					 }else {
						 System.out.print("  "); 
					 }
					
				 }
			 System.out.println();
		 }
		 for(i=2;i<=n;i++) {
			 for(space=i;space>1;space--) {		
				 System.out.print(" ");	
			 }
			 for(j=n;j>=i;j--) {
				 if(j==n||j==i) {
				 System.out.print("* ");
					 }else {
						 System.out.print("  ");
					 }
				 }
			 System.out.println();
			 

	}

}
	}

