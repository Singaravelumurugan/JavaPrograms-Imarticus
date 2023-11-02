package Works;

import java.util.Scanner;

public class Occurance {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		int count=0;
		System.out.println ("Enter the number of Elements ");
		int n= s.nextInt();
		int[] arr= new int[n];
		System.out.println ("Enter the all  Elements ");
		for (int i=0;i<n;i++) {
			arr[i]=s.nextInt();	
		}
		System.out.println("Enter the element of which you want to count number of occurrences ");
		int n1=s.nextInt();
		for(int i=0;i<n;i++) {
				if(arr[i]==n1) {
					count++;
			}
			
		}
		System.out.println(" Number of Occurance is "+count);
	}

}
