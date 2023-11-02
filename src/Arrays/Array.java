package Arrays;

public class Array {

	public static void main(String[] args) {
		double[] myList= {1.9,2.9,3.4,3.5};           //Loop 
		//print all array elements
		for (int i=0;i<myList.length;i++)
		{
			System.out.println(myList[i]);
		}
		
		
		//Example 2     For Each Loop
		double[] myList1= {1.9,2.9,3.4,3.5};
		//print all array elements
		for(double element: myList1) {
			System.out.println(element);
		}
	}

}
