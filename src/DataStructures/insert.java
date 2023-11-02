package DataStructures;
import java.util.Scanner;
public class insert {

	public static void main(String[] args) {
		int insertion,ind,j,n;
		Scanner s=new Scanner (System.in);
		System.out.print("Enter the number of  Element : ");
		n=s.nextInt();
		int arr[]=new int [n+1];
		System.out.print("Enter the array  Element");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();	
		}
		System.out.print("Insert Element :");
		insertion=s.nextInt();
		System.out.print("\nInsert Index :");
		ind=s.nextInt();
		j=n;
		System.out.println("Original Array");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		n=n+1;
		System.out.println("j = "+j);
		while(j>=ind) {
			arr[j]=arr[j-1];
			j=j-1;
		}
		arr[ind]=insertion;
		System.out.println("Inserted Array : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
