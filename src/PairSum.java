
 import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class PairSum {
    public static int sumSecondElements(List<Pair<Integer, Integer>> list) {
        int sum = 0;
        for (Pair<Integer, Integer> pair : list) {
            sum += pair.second;
        }
        return sum;
    }
    public static void main(String[] args) {
    	  // enter your code here
    	  Scanner scanner = new Scanner(System.in); // create a scanner object
    	  int n = scanner.nextInt(); // read the size of the array
    	  List<Pair<Integer, Integer>> list = new ArrayList<>(); // create a list of pairs
    	  for (int i = 0; i < n; i++) { // loop through the array
    	    int first = scanner.nextInt(); // read the first element of the pair
    	    int second = scanner.nextInt(); // read the second element of the pair
    	    Pair<Integer, Integer> pair = new Pair<>(first, second);
    	    list.add(pair); // add the pair to the list
    	  }
    	  int result = sumSecondElements(list); // call the method to get the sum of second elements
    	  System.out.println(result); // print the result
    	}

    static class Pair<F, S> {
        F first;
        S second;

        public Pair(F first, S second) {
            this.first = first;
            this.second = second;
        }
    }
}