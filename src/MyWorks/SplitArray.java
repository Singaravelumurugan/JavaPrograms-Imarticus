package MyWorks;
import java.util.Scanner;
public class SplitArray {

	public static void main(String[] args) {
		int j=0,k=0;
	Scanner s = new Scanner(System.in);
	System.out.print("Enter the number of elements ");
	int n=s.nextInt();
	int a[]=new int[n];
	int b[]=new int[n];
	int c[]=new int[n];
	System.out.print("Enter the all the elemnts ");
	for(int i=0;i<n;i++) {
		a[i]=s.nextInt();
	}
	System.out.print("Split the element position  ");
	int spl=s.nextInt();
	for(int i=0;i<spl;i++) {
		b[j]=a[i];
		j++;
	}
	for(int i=spl;i<n;i++) {
		c[k]=a[i];
		k++;
	}
	System.out.print("first  split Array ");
	for(int i=0;i<j;i++) {
		System.out.print(b[i]+" ");
	}
	System.out.println();

	System.out.print("Second  split Array ");
	for(int i=0;i<k;i++) {
		System.out.print(c[i]+" ");
	}
	}

}
