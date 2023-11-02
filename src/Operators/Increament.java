package Operators;

public class Increament {

	public static void main(String[] args) {
		//declare variables
		int a=12, b=12;
		int result1, result2;
		//original value
		System.out.println("Value of a:"+a);
        //increment operator
		result1 =a++; //12++
		System.out.println("After increment:"+result1);
		System.out.println("Value of b:"+b);
		//decrement operator
		result2=--b; //b=11
		System.out.println("After increment:"+result2);
	}

}
