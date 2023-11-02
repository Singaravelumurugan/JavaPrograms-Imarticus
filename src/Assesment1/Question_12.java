package Assesment1;

import java.util.Scanner;

public class Question_12 {

	public static void main(String[] args) {
		int n ,i,j,space;
		Scanner s= new Scanner (System.in);
		 System.out.print("Enter the number of lines: "); 
		 n=s.nextInt();
		 for(i=1;i<=n;i++) {
			 for(space=1;space<=n;space++) {		
				 System.out.print("");	
			 }
			 for(j=1;j<=i;j++) {
				 System.out.print(j+" ");
					 }
					 System.out.println();
		 }
	}
}
