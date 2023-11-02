package Myworks_2;
import java.util.Scanner;
public class Math_1 {

	public static void main(String[] args) {
//	double d1= 84.6;
	//double d2= 0.45;
	
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the first Number ");
	double d1=s.nextDouble();

	System.out.println("Enter the Second Number ");
	double d2=s.nextDouble();
	System.out.println("Ceiling of "+ d1 +"= "+Math.ceil(d1));
	System.out.println("Floor of "+ d1 +"= "+Math.floor(d1));
	System.out.println("Ceiling of "+ d2 +"= "+Math.ceil(d2));
	System.out.println("Floor of "+ d2 +"= "+Math.floor(d2));


	}

}
