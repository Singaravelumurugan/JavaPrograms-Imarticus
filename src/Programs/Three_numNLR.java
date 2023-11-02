package Programs;

import java.util.Scanner;

public class Three_numNLR {

	public static void main(String[] args) {
		int N,L,R;
		 Scanner s = new Scanner(System.in);
		System.out.print("Enter the N value:");
		N=s.nextInt();
		System.out.print("Enter the L value:");
		L=s.nextInt();
		System.out.print("Enter the R value:");
		R=s.nextInt();
		if((N>L)&& (N<R)) {
			System.out.print("The number 'L' is between L&R:");
			
		}else {
			System.out.print("The number 'N' is between L&R");
			s.close();
		}


	}

}
