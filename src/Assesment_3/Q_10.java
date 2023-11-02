package Assesment_3;
import java.util.Scanner;
public class Q_10 {

	public static void main(String[] args) {
		int r,c;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter number of rows in first matrix:");
		r=s.nextInt();
		System.out.println("Enter number of column in first matrix:");
		c=s.nextInt();
		int [][]a=new int[r][c];
		System.out.println("Enter number of rows in second matrix:");
		r=s.nextInt();
		System.out.println("Enter number of column in second matrix:");
		c=s.nextInt();
		int [][]b=new int[r][c];
		
		System.out.println("Enter number of elements in first matrix:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("Enter number of elements in second matrix:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				b[i][j]=s.nextInt();
	}
		}
		System.out.println("First matrix ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(a[i][j]+"");
				 }
			System.out.println();
				}
		System.out.println("second matrix ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(b[i][j]+"");
				 }
			System.out.println();
				}
		int [][] sum=new int [r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
					sum[i][j]+=a[i][j]+b[i][j];
				}
			}
				System.out.println("Matrix addition");
				for(int[]row:sum) {
					for(int column:row) {
						System.out.print(column+" ");
					}
					System.out.println();
				}
		}
		}
