package Myworks_2;

public class Odd_Even_withoutModulus {
	
static boolean isEven(int n){
	
	return ((n / 2) * 2 == n);
}

public static void main(String[] args)
{
	int n = 10;
	if(isEven(n) == true)
		System.out.print( "Even" );
	else
		System.out.print( "Odd" );
}
}
