package Programs;

import java.util.Arrays;

public class Test_Array {

	public static void main(String[] args) {
		int [] intArray= {1,2,3,4,5};
		String intArrayString =Arrays.toString(intArray);
		//print directly will elements
		System.out.println(intArray);//1 2 3 4 5
		for(int val:intArray) {
			System.out.println(val+" ");
			
		}
		System.out.println("\n "+intArrayString);
	}

}
