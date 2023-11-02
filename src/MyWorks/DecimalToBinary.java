package MyWorks;
import java.util.Scanner;
public class DecimalToBinary {
	public static void main(String[] args) {	 
		 Scanner s = new Scanner (System.in);
         System.out.println("Enter the Element ");
         int n=s.nextInt();
         int[] a = new int[n];
         int i=0;
         while (n>0) {
             a[i]=n%2;
             n=n/2;
             i++;
         }
      //   System.out.println("Binary is ");
         for(int j=i-1;j>=0;j--)
             System.out.print(a[j]); 
         System.out.println();
         System.out.println("Enter the index\n ");
         int num=s.nextInt();
         System.out.println((num=a[num])+ " is present in the given position");
         s.close();
         
	}

}
