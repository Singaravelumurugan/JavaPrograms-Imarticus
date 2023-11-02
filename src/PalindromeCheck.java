
import java.util.*;                         
class PalindromeCheck {
	public static int isPalindrome(String s) {
		  // Enter the logic here
		  int i = 0; // initialize a pointer from the left
		  int j = s.length() - 1; // initialize a pointer from the right
		  while (i < j) { // while the pointers do not cross
		    if (s.charAt(i) != s.charAt(j)) { // if there is a mismatch
		      return 0; // return 0 as the answer
		    }
		    i++; // increment the left pointer
		    j--; // decrement the right pointer
		  }
		  return 1; // return 1 as the answer
		}


    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
       String s = sc.nextLine(); 
        int result = isPalindrome(s);
        System.out.println(result);
    }
}