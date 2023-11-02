package Assesment_3;

import java.util.Scanner;

public class Q_7 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the number array ");
		int n=s.nextInt();
		int[]a=new int[n];
		System.out.println("Enter Array elements ");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("The initial Array ");
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);	
		}
		for (int i=0;i<n;i++){
            int max=0;
            for (int j=i+1;j<n;j++) {
                max= Math.max(max,a[j]);
            }
            a[i]=max;
        }
		 System.out.println("The final array is: ");
		  for (int i=0;i<n;i++) {
	            System.out.print(a[i] + " ");
	        System.out.println();	
}
}
}
