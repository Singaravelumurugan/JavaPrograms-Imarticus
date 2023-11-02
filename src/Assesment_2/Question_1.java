package Assesment_2;

public class Question_1 {

	public static void main(String[] args) {
			      int numbers[] = new int[]{4,2,3,6,1};
			      int smallest = numbers[0];
			      int largest = numbers[0];
			      for (int i = 1; i < numbers.length; i++) {
			         if (numbers[i] > largest)
			            largest = numbers[i];
			         else if (numbers[i] < smallest)
			            smallest = numbers[i];
			      }
			      System.out.println("Largest Number is : " + largest);
			      System.out.println("Smallest Number is : " + smallest);
			   }
			}
