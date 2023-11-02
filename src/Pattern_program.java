import java.util.Scanner;

public class Pattern_program {

	public static void main(String[] args) {
		int n ,i,j;
		Scanner s= new Scanner (System.in);
		 System.out.print("Enter the number of lines "); 
		 n=s.nextInt();
		 for(i=1;i<=n;i++) {
			 for(j=1;j<=i;j++) {		// reverse type: for (j==n;j>=n;j--)
				 System.out.print("*");	// u can print the value of reverse
			 }
			 System.out.println();
		 }
	}

}
