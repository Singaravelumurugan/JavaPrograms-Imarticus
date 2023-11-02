import java.util.Scanner;

public class CharactersAtOddPositions {
	 public static void printCharactersAtOddPositions(String str) {
	       // Enter the logic here
	    	for(int i=0;i<str.length();i++) {
	    		if(i%2 ==0) {
	    			System.out.print(str.charAt(i)+" ");
	    		}
	    	}
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String str = scanner.nextLine();

	        printCharactersAtOddPositions(str);
	    }
	 
	}