package Arrays;
import java.util.Scanner;
public class Upper_Triangular {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int r,c;
		System.out.println("Enter the row ");
		r=s.nextInt();
		System.out.println("Enter the column ");
		c=s.nextInt();
		
		int a[][]=new int[r][c];
		System.out.println("Enter the array elements one by one");
		for (int i=0;i<r;i++) {
			for(int j=0;j<c;j++)
			a[i][j]=s.nextInt();
		}
		int flag = 0;
		for(int i=1;i<r;i++) {
			for(int j=0;j<i;j++) {
				if(a[i][j]!=0) {
					flag=1;
				}
			}
		}
		if(flag==0) {
			System.out.println(" ");

			System.out.println("Yes");	//r=3,c=3  123
		}else {									 //056
			System.out.println("No");			// 008

		}
	}

}
