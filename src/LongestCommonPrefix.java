
import java.util.Scanner;

class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] strs) {
		  // Enter the logic here
		  if (strs == null || strs.length == 0) { // if the array is null or empty
		    return "-1"; // return "-1" as the answer
		  }
		  String prefix = strs[0]; // initialize the prefix as the first string
		  for (int i = 1; i < strs.length; i++) { // loop through the other strings
		    int j = 0; // initialize a pointer to compare characters
		    while (j < prefix.length() && j < strs[i].length()) { // while within the bounds of both strings
		      if (prefix.charAt(j) != strs[i].charAt(j)) { // if there is a mismatch
		        break; // break the loop
		      }
		      j++; // increment the pointer
		    }
		    prefix = prefix.substring(0, j); // update the prefix as the common substring until that point
		    if (prefix.isEmpty()) { // if the prefix becomes empty
		      return "-1"; // return "-1" as the answer
		    }
		  }
		  return prefix; // return the prefix as the answer
		}


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline character after reading the integer 'n'

        String[] strs = new String[n];

        for (int i = 0; i < n; i++) {
            strs[i] = scanner.next();
        }

        String longestPrefix = longestCommonPrefix(strs);
        System.out.println(longestPrefix);// geeksforgeeks geeks geek geezer
    }
}