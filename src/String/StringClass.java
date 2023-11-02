package String;

public class StringClass {

	public static void main(String[] args) {
		int num=1234;
		
		String str1=Integer.toString(num);
		String str=String.valueOf(num); //Convert int to String
		System.out.println(str.length());
		System.out.println(str1.length());

	}

}
