package Sorting;

import java.util.regex.Pattern;

public class Regex_6 {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[a-z A-Z 0-9]{6}","arun32"));// true
		System.out.println(Pattern.matches("[a-z A-Z 0-9]{6}","kkvarun32"));//false more than 6 characters
		System.out.println(Pattern.matches("[a-z A-Z 0-9]{6}","JA2Uk2"));//true
		System.out.println(Pattern.matches("[a-z A-Z 0-9]{6}","arun$2"));//false ($ is not matched)

		



	}

}
