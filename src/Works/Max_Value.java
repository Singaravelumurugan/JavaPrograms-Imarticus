package Works;

import java.util.Scanner;

public class Max_Value {

	public static void main(String[] args) {
			Scanner s= new Scanner (System.in);
			int max;
			System.out.println ("Enter the number of Elements ");
			int n= s.nextInt();
			int[] a= new int[n];
			System.out.println ("Enter the all  Elements ");
			for (int i=0;i<n;i++) {
				a[i]=s.nextInt();	
			}	
			max=a[0];
			for(int i=0;i<n;i++) {
				if(max<a[i]) {
					max=a[i];
					
				}
			}
			System.out.print("maximum value is "+max);
			s.close();
	}

}
