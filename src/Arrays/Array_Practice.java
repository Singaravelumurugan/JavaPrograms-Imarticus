package Arrays;

import java.util.Scanner;

public class Array_Practice {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int rotate,x;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of rotation:");
		rotate=s.nextInt();
		int n=arr.length;
		for (int r=1;r<=rotate;r++) {
		 x=arr[n-1];

		for(int i=n-2;i>=0;i--) {
			arr[i+1]=arr[i];
		}
		arr[0]=x;
		}
		System.out.print("Rotated Array:");
		for (int array:arr) {
			System.out.print(array+" ");
			
		}
	}

 		}
