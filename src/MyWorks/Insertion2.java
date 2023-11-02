package MyWorks;
import java.util.Scanner;
public class Insertion2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements ");
		int n=s.nextInt();
		int a[]=new int[n+1];
		System.out.println("Enter the all elements ");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Enter the position ");
		int pos=s.nextInt();
		System.out.println("Enter the number ");
		int ins=s.nextInt();
		for(int i=n-1;i>=pos-1;i--) {
			a[i+1]=a[i];
		}
		a[pos-1]=ins;
		System.out.println("After Inserting ");
		for(int i=0;i<n+1;i++) {
		System.out.print(a[i]+" ");	
		}
		//System.out.print(a[n]);	// a[n]= u have extra one element 
	}

}
