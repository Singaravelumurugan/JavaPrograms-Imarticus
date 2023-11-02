package Works;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=s.nextInt();
		
		System.out.println("Get the numbers ");
		
		
		for(int i=1;i<=n;i++) {
			System.out.print(i+" ");
		}
			s.close();

	}

}
