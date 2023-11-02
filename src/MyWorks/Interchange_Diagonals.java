package MyWorks;

import java.util.Scanner;

public class Interchange_Diagonals {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the row ");
		int r=s.nextInt();
		System.out.println("Enter the column ");
		int c=s.nextInt();
		int [][]a=new int [r][c];
		System.out.println("Enter the elements ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=s.nextInt();
			}
				}
		System.out.println("Given matrix");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
			System.out.print(a[i][j]+" ");	
		}
			System.out.println();
		}
		for(int i=0;i<c;i++) {
			int temp=a[i][i];
			a[i][i]=a[i][c-1-i];
			a[i][c-1-i]=temp;
		}
		System.out.println("After intechange ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
			System.out.print(a[i][j]+" ");	
		}
			System.out.println();
		}
	}
}
