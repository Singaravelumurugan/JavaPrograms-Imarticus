package Pattern;

import java.util.Scanner;

public class Pattern_program6 {

	public static void main(String[] args) {
		int n ,i,j,k=1,space;
		Scanner s= new Scanner (System.in);
		 System.out.print("Enter the number of lines: "); 
		 n=s.nextInt();
		 for(i=1;i<=n;i++) {
			 for(space=n;space>i;space--) {		
				 System.out.print(" ");	
			 }
			 for(j=1;j<=i;j++) {
				 System.out.print(k+++" ");
					 }
					 System.out.println();
				 }
	}

}
