package Myworks_2;
import java.util.Scanner;
public class Bobble_2 {
	static void bubble(int[] arr,int n) {
		int temp;
		for(int i=0;i<n;i++) {
			for(int j=1;j<n;j++) {
				if(arr[j-1]>arr[j]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=s.nextInt();
		int[] arr= new int[n];
		System.out.println("Enter the all elements");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		bubble(arr, n);
		System.out.println("After bubble sort elements");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" "); //3,60,35,2,45,320,5

		}
	}

}
