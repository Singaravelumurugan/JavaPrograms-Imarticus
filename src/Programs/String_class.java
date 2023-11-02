package Programs;

public class String_class {

	public static void main(String[] args) {
		String str= "Hello World";
		String anotherString="hello world";
		Object objStr=str;
		
		System.out.println(str.compareTo(anotherString));
		System.out.println(str.compareToIgnoreCase(anotherString));
		System.out.println(str.compareTo(objStr.toString()));

		
		String s1="google";					//Storage = normal memory=s1&s2, heap memory_s3
		String s2="google";
		String s3=new String("google");
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		
		String str1 ="Hello World, HEllo reader,Hello";
		int lastIndex=str1.lastIndexOf("Hello");
		
		if (lastIndex==-1) {
			System.out.println("Hello not found");
		}
		else {
			System.out.println("Last occurence of Hello is at index "+ lastIndex);	
		}
		
		//String Reverse Example 1:
		String string="abcdef";
		String reverse = new StringBuffer(string).reverse().toString();
		System.out.println("\nString before reverse:"+string);
		System.out.println("String after reverse:"+reverse);
		
		//Example 2:
		String input="abcdef";
		char[] try1=input.toCharArray();
		for(int i=try1.length-1;i>=0;i--)
		
			System.out.print(try1[i]);
		
	}

}
