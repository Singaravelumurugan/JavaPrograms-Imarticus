package Collection;

public class CompareString {

	public static void main(String[] args) {
		String s1="hello";
		String s2="hello";
		String s3="meklo";
		String s4="hemlo";
		String s5="flag";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));// ASCII value of h=104,m=109 =(104-109=-5)
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareTo(s5));

	}

}
