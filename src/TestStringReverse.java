
    class StringFormatter{
	public static String reverseString(String str) {
		char ch[]=str.toCharArray();
		String rev=" ";
		for(int i=ch.length-1;i>=0;i--) {
			rev+=ch[i];
		}
		return rev;
	}
}

public class TestStringReverse {

	public static void main(String[] args) {
		System.out.println(StringFormatter.reverseString("my name is khan"));
		System.out.println(StringFormatter.reverseString("i am sonoo jaiswal"));


	}

}
