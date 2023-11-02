package MyWorks;
import java.util.Scanner;
public class Rotation {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the number of rotation :");
		int rot=s.nextInt();
		int n=arr.length;
		for(int r=1;r<=rot;r++) {
			int temp=arr[n-1];
			for(int i=n-2;i>=0;i--) {
				arr[i+1]=arr[i];
			}
			arr[0]=temp;
		}
		for(int array:arr) {
		System.out.print(array);
		}
	}

}
