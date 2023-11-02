package DataStructures;

import java.util.Scanner;

public class update {

	public static void main(String[] args) {
		int pos,j,n,ele;
		Scanner s=new Scanner (System.in);
		System.out.print("Enter the number of  Element : ");
		n=s.nextInt();
		int arr[]=new int [n];	//Dynamic array
		System.out.print("Enter the array  Element");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();	
		}
		System.out.print("\nInsert position");
		pos=s.nextInt();
		System.out.println();
		System.out.println("Update Element");
		ele=s.nextInt();
		
		System.out.println("Original Array");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		arr[pos-1]=ele;
		System.out.println();
		System.out.println("Update Array : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
