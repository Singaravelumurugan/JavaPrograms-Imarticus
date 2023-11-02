package Assesment1;

public class Calculator11 {

	public static void main(String[] args) {				
				double f1=10,f2=10;
				double result=1;
				char operator='/';
			
				switch(operator) {
					case'+':
						result=f1+f2;
						break;
					case'-':
						result=f1-f2;
						break;
					case'*':
						result=f1*f2;
						break;
					case'/':
						result=f1/f2;
						break;
					default:
						System.out.println("error operator is not correct");
				}
				System.out.println(result);	
	}
}
