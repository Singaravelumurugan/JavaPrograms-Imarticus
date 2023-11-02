package Sorting;
import java.util.Scanner;
public class Bubble_Sorting {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements of the array");
		for (int i=0;i<n;i++) {
			a[i]=s.nextInt();
			
		}
		int temp;
		for(int step=0;step<n-1;step++) {
			for (int i=0;i<n-step-1;i++) {
				if (a[i]>a[i+1]) {
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
						}
			}
		}
			System.out.println("Array after sort :");
			for(int i=0;i<n;i++) {
				System.out.print(a[i]+" ");
	
}
	}

}
