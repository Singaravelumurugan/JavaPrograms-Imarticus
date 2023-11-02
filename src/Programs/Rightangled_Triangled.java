package Programs;

import java.util.Scanner;

public class Rightangled_Triangled {

	public static void main(String[] args) {
		int length,height,hypotenuse,sum1,sum2,result;
		 Scanner s = new Scanner(System.in);
		System.out.println("Enter the Length:");
		length=s.nextInt();
		System.out.println("Enter the Height:");
		height=s.nextInt();
		System.out.println("Enter the hypotenuse:");
		hypotenuse=s.nextInt();
		length=length*length;
		height=height*height;
		sum1=length+height;
		sum2=hypotenuse*hypotenuse;
		if(sum1==sum2) {
			System.out.print("It is right angle triangle:");
		}else {
			System.out.println("It is not a right angle ");
			s.close();
		}
		}

	}
	

