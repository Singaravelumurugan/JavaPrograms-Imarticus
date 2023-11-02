package Datatype;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=s.nextInt();
			if(num%2!=0) {
				System.out.print("Odd number: "+num);
				
			}
			else{
				System.out.print("Even number: "+num);			//if(num%2==0) Even number loop
			}
			
		}
			
	
	}

