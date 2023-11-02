package Loop;

import java.util.Scanner;

public class Amstrong { //Input:153,1634,1,2,3,4,5,6,7,8,9,370,378,54748

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n,count=0, num,reminder,result = 0;
		System.out.println("Enter the Number:");
		 num =s.nextInt();
		 n=num;
		 while(n!=0) {
			 count++;
			 n=n/10;
		 }
		 n=num;
		 	while(n!=0) {
		 		 reminder=n%10;
				 result=(int) (result+Math.pow(reminder, count));
				 n=n/10;

		 	}		 
		 
		
		if (num==result) {
			System.out.println("It is an Amstrong number");
		}else{
			System.out.println ("It is not an Amstrong number");
		}s.close();

	}

}
