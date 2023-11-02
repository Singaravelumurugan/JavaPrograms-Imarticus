package Sorting;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexGroup2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Match not found");
		String str1= s.nextLine();
		Pattern p=Pattern.compile("javaTraining",
				Pattern.CASE_INSENSITIVE);
				Matcher m=p.matcher (str1);
				boolean matchFound=m.find();
				if(matchFound) {
					System.out.println("Match found");
				}else {
					System.out.println("Match not found");


				}
	}

}
