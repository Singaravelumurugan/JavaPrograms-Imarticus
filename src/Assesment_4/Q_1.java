package Assesment_4;
import java.util.Scanner;
public class Q_1 {
	static void insertionsort(int a[],int n){
		for(int i=1;i<n;i++) {
			int key=i;
			for (int j=i-1;j>=0;j--) {
				if (a[j]>a[key]) {
				int	temp=a[j];
					a[j]=a[key];
					a[key]=temp;
					key--;
						}
			}
		}
	}
	static void printarray(int a[],int n) {
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
	}
	}

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements one by one");
		for (int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		insertionsort(a,n);
		System.out.println("Array after sort :");
		printarray(a,n);
		s.close();  //7 4 3 9 2 6 8 1 5
	}				//15 31 29 12 36 18 41 43

}

