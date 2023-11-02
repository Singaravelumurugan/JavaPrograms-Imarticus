package Assesment_3;
import java.util.Scanner;
public class  Q_5  {
	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter number of elements in the array:");
	        int n = s.nextInt();
	        int[] array = new int[n];
	        System.out.println("Enter elements of array:");
	        for (int i=0;i<n;i++) {
	            array[i] =s.nextInt();
	        }
	        System.out.print("Enter the element of which you want to count number of occurrences ");
	        int num = s.nextInt();
	        int occur = 0;
	        for (int i=0;i<n;i++) {
	            if (array[i] == num) {
	                occur++;
	            }
	        }
	        System.out.println("Number of Occurrence of the Element : " + occur);
	    }
	}
