package Works;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str =s.nextLine();
;		String  reverseStr =" ";
	    
	    int n = str.length();
	    for (int i=(n-1);i>=0;i--) {
	    	reverseStr = reverseStr + str.charAt(i);
	    }
	    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
	    	  System.out.println(str + " is a Palindrome String.");
	    } else {
	    	  System.out.println(str + " is not a Palindrome String.");
	    }   s.close();
	}
	}
