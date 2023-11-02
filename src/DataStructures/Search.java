package DataStructures;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		int n,search,flag=0;
		Scanner s=new Scanner (System.in);
		System.out.print("Enter the number of  Element : ");
		n=s.nextInt();
		int arr[]=new int [n];	//Dynamic array
		System.out.println("Enter the all  Elements : ");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();	
		}
		System.out.print("\nSearch Element: ");
		search=s.nextInt();
		for(int i=0;i<n;i++) {
			if (arr[i]==search) {
				System.out.println("Search Element is at the position : "+(i+1));
			flag=1;
		}
		}
		if (flag==0){
			System.out.println("No Search Element");
		}

	}

}
