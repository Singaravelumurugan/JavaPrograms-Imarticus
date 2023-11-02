
import java.util.*;

class Solution {
	public String checkStrictlyIncreasing(int[] arr, int N) {
		  // Enter the logic here
		  int prev = 0; // initialize the previous element as 0
		  for (int i = 0; i < N; i++) { // loop through the array
		    int curr = arr[i]; // store the current element
		    int div = curr; // initialize the divisor as the current element
		    while (div > prev) { // while the divisor is greater than the previous element
		      if (curr % div == 0) { // if the current element is divisible by the divisor
		        break; // break the loop
		      }
		      div--; // decrement the divisor
		    }
		    if (div <= prev) { // if the divisor is not greater than the previous element
		      return "No"; // return "No" as the answer
		    }
		    prev = div; // update the previous element as the divisor
		  }
		  return "Yes"; // return "Yes" as the answer
		}


    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline character after integer input

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        Solution solution = new Solution();
        String result = solution.checkStrictlyIncreasing(arr, N);
        System.out.println(result);
    }
}