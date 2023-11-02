package Assesment_2;
import java.util.Arrays;

public class Question_10 {

		    public static void main(String[] args) {
		        int[] arr = {1, 2, 3, 4, 5};
		        int n = 3;
		        System.out.println("Original Array: " + Arrays.toString(arr));
		        for(int i = 0; i < n; i++) {
		            int j, last;
		            last = arr[arr.length-1];
		            for(j = arr.length-1; j > 0; j--) {
		                arr[j] = arr[j-1];
		            }
		            arr[0] = last;
		        }
		        System.out.println("Array after right rotation: " + Arrays.toString(arr));
		    }
		}
