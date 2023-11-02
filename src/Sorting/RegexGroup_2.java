package Sorting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexGroup_2 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("javaTraining",
		Pattern.CASE_INSENSITIVE);
		Matcher m=p.matcher ("Welcome to JavaTraining");
		boolean matchFound=m.find();
		if(matchFound) {
			System.out.println("Match found");
		}else {
			System.out.println("Match not found");


		}
	}

}
