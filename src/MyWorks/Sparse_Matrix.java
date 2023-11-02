package MyWorks;

import java.util.Scanner;

public class Sparse_Matrix {

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
			int zero=0;
			int count=0;
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					if((a[i][j]==0)) {
						zero++;
					}
					else {
						count++;
					}
				}
			} if(zero>count) {
				System.out.println("This is a Sparse matrix ");
			}else {
				System.out.println("This is not a Sparse matrix ");

			}
	}

}
