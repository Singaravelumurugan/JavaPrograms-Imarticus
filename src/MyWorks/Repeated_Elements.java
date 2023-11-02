package MyWorks;

import java.util.Scanner;

public class Repeated_Elements {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		System.out.println ("Enter the number of Elements ");
		int n= s.nextInt();
		int[] a= new int[n];
		System.out.println ("Enter the all  Elements ");
		for (int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}int flag=0;
		System.out.println ("Non Repeated  Elements ");
		for(int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				if((a[i]==a[j] && i!=j)) {
					flag=1;	
					//break;
				}

			}if (flag==0) {
				System.out.println(a[i]);
			}
			flag=0;
		}
	}

}
