package Works;
import java.util.Scanner;

public class BinaryCount {
			public static void main(String[] args) {
				int n,count=0,i=0;
				Scanner s = new Scanner (System.in);
				System.out.println("Enter the element ");
				n = s.nextInt();   
			        int[] a = new int[n];
			        while (n!=0) {
			            a[i]=n%2;
			            n=n/2;
			            i++;
			        }
			        for (int j=i-1;j>=0;j--)
			        	if(a[j]==1)
			        	count++;	
			            System.out.print("Number of one's: " + count);
			            s.close();
	}

}
