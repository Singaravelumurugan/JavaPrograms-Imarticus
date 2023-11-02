package Works;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class LargestString {
	static void printLargestAndSmallest(String str) {
		int maxlength,minlength;
		  String arr [] =str .split(" ");
			int i=0;
			maxlength = Integer.MIN_VALUE;
			minlength= Integer.MAX_VALUE;
			String largest,smallest;
			largest = smallest="";
			for(i=0;i<arr.length;i++) {
			if(arr[i].length()<minlength) {
				smallest =arr[i];
				minlength=arr[i].length();
			}
			if(arr[i].length()>maxlength) {
				largest = arr[i];
				maxlength=arr[i].length();
			}

		}
			System.out.println("The Largest word \""+largest+"\"");
			System.out.println("The Smallest word \""+smallest+"\"");
				
	}

	public static void main(String[] args) {
		 BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		  System.out.println("Enter the String Words ");
			String str;
		  try {
			 str = br.readLine();
		} catch (IOException e) {
			System.out.println("Error reading input ");
			return;
		}
		  printLargestAndSmallest(str);  //example: we belong to Russia
	}
}

