package Works;
import java.util.Scanner;
import java.util.HashSet;

public class uniqueWords {
	
	
  public static void main(String[] args) { // This is wrong program 
	  Scanner s = new Scanner (System.in);
	  System.out.println("Enter the String Words ");
	  String words = s.nextLine();
	  String word [] =words .split(" ");
    HashSet<String> uniqueWords = new HashSet<String>();

    	for( String str:word) { // java is good c++ also is good
      uniqueWords.add(str);
    	}
    System.out.println("Number of unique words: " + uniqueWords.size());
    s.close();
  }
}

	
	      
	      
	

