import java.util.Scanner;
public class StringSum {

	public static void main(String[] args) {
	//	String str = "abcd5678efgh1234";
		int b,sum=0;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the String ");
		String str=s.next();
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))){
				b=Integer.parseInt(String.valueOf(str.charAt(i)));
				sum=sum+b;
			}
		}
		System.out.println(sum);


	}

}
