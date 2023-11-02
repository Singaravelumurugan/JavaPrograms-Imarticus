package MyWorks;
import java.util.Scanner;
public class UpperTriangle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the row ");
		int r=s.nextInt();
		System.out.print("Enter the column ");
		int c=s.nextInt();
		int a[][]=new int[r][c];
		System.out.print("Enter the all elements ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=s.nextInt();
			}	
		}
		System.out.println("you have entred ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
			System.out.print(a[i][j]+" ");
	}
			System.out.println();
		}
		System.out.println("Lower Triangle is ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(i>=j) {		// if(i<=j)=upper triangle
					System.out.print(a[i][j]+" ");
				}else {
					System.out.print("0"+" ");
				}
			}
			System.out.println();	

			}
		}
	}

