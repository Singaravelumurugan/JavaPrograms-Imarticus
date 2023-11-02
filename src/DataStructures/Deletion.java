package DataStructures;

import java.util.Scanner;

public class Deletion {

	public static void main(String[] args) {
		int pos,j,n;
		Scanner s=new Scanner (System.in);
		System.out.print("Enter the number of  Element : ");
		n=s.nextInt();
		int arr[]=new int [n];	//Dynamic array
		System.out.print("Enter the array  Element");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();	
		}
		System.out.print("\nRemove position ");
		pos=s.nextInt();
		j=pos;
		System.out.println("Original Array");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("j = "+j);
		while(j<n) {
			arr[j-1]=arr[j];
			j++;
		}
		n=n-1;
		System.out.println("Deleted Array : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
