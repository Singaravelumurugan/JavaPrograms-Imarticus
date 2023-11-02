package Sorting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Password_check {
	public static boolean isValidPassword(String Password) {
		String regex="^(?=.*[0-9])" 
						+"(?=.*[a-z])(?=.*[A-Z])" 
						+"(?=.*[@#$%^&+=])" 
						+"(?=\\S+$).{8,20}$";
		
		Pattern p=Pattern.compile(regex);
		
		if (Password==null) {
			return false;
		}
		
		Matcher m=p.matcher(Password);
		return m.matches();
		
	}

	public static void main(String[] args) {
		String str1="Pass@portal20";
		System.out.println(isValidPassword(str1));
		
		String str2="PasswordCheck";
		System.out.println(isValidPassword(str2));
		
		String str3="Pass@ portal9";
		System.out.println(isValidPassword(str3));
		
		String str4="1234";
		System.out.println(isValidPassword(str4));
		
		String str5="Check@20";
		System.out.println(isValidPassword(str5));
		
		String str6="check@portal20";
		System.out.println(isValidPassword(str6));
		
		
	}

}
