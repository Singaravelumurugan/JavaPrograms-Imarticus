package Works;

import java.util.Scanner;

public class NextBiggestNumber {

	public static void main(String[] args) {
		int n;
		 Scanner s = new Scanner(System.in);
		 System.out.print("Enter number of elements in the array:");
		 n = s.nextInt();
		 int flag=0;
		 int a[] = new int[n];
		 System.out.println("Enter elements of array:");
		for(int i=0;i<n;i++) {
		a[i]=s.nextInt();	
		}
		for(int i=0;i<n;i++) {
			if (a[i]==a[n-1])
				System.out.println(a[i]+"-> -1");
			flag=1;
			
			for(int j=i+1;j<n;j++) {
			if(a[i]<a[j]) {
				System.out.println(a[i]+"-> "+a[j]);
				flag=1;
			break;
			}
			}
				
			}
		}
	}
