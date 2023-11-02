package Pattern;

import java.util.Scanner;

public class Pascal_Triangle {

	public static void main(String[] args) {
		int n ,i,j,space,k,value;
		Scanner s= new Scanner (System.in);
		 System.out.print("Enter the number of lines: "); 
		 n=s.nextInt();
		 for(i=1;i<=n;i++) {
			 for(space=n;space>i;space--) {		
				 System.out.print(" ");	
			 }
			 for(j=1;j<=i;j++) {
				 System.out.print(j+" ");
			 }
			 value=--j;
			 for(k=1;k<j;k++) {
				 System.out.print(--value+" ");	
			 }
			 System.out.println();	
	}

	}
}
