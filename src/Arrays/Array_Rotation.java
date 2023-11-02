package Arrays;

import java.util.Scanner;

public class Array_Rotation {

	public static void main(String[] args) {
		int arr[]= {0,0,0,0,0};      //Array Rotation
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the array elements:");
		for(int i=0;i<5;i++) {
			arr[i]=s.nextInt();
		}
		System.out.print("Array elements are:"); // for each loop method
		for (int a:arr) {
			System.out.print(" "+a);
		}
		
		
	
		
	}

}
