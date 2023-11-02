package Assesment1;

import java.util.Scanner;

public class Arm5 {

	public static void main(String[] args) {
		int arm=0, num,reminder,result = 0;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Number:");
		 num =s.nextInt();
		 for(num=0;num>0;num=num%10) {
			 reminder=num%10;
			 arm=arm+(reminder*reminder*reminder);
			 num=num/10;
		 }
		 
		
		if (num==result) {
			System.out.println("It is a Amstrong number:");//153,1,2,3,4,5,6,7,8,9
		}else{
			System.out.println ("Not a Amstrong:");
		}s.close();


	}

}
