package MyWorks;
import java.util.Scanner;
public class FrequencyOddEven {

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
			int count1=0;
		int count2=0;
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
				if ((a[i][j]%2==0)) {
					count1++;
				}else {
				count2++;
				}
				
			}
				
			}
			
		System.out.println("Even number frequency : "+count1);
		System.out.println("Odd number frequency : "+count2);

}
}
