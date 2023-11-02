package Sorting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample3 {

	public static void main(String[] args) {
		String line="This order was placed for QT3000! OK?";
		Pattern p=Pattern.compile("(.*?)(\\d+)(.*)");
		Matcher m=p.matcher(line);
		while(m.find()) {
			System.out.println("group 1:"+m.group(1));
			System.out.println("group 1:"+m.group(2));
			System.out.println("group 1:"+m.group(3));


			
		}
		
	}

}
