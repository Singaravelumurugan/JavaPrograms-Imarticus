package Sorting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_4 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("s.");
		Matcher m=p.matcher("as");
		boolean b=m.matches();
		
		//2nd Way
		boolean b1=Pattern.compile(".s").matcher("as") != null;
		//3rd Way
		boolean b2=Pattern.matches(".s","as");
		
		System.out.println(b+" "+b1+" "+b2+" ");
		
	}

}
