package Loop;

import java.util.Scanner;

public class Reverse {



	public static void main(String[] args) {
		
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number:");
		 
		 int num,reminder,result;
		 num =s.nextInt();
		 int d=num;
		 result=0;
		 while (num!=0){
			 reminder =num%10; 
			 result =result*10+reminder;
					 num=num/10;
		 }
		if (result==d) {
			System.out.println("Palintrome:");
		}else{
			System.out.println ("Not Palintrome:");
		}s.close();

	}

}
