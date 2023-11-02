package Recursion;

public class Minimum_Element {

	public static void main(String[] args) {
		int[] arr= {12,3,45,78,2};
		int n=arr.length;
		int min=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]<min)			//u need maximum element change (if(arr[i]>max)
				min=arr[i];
		}
		System.out.println("minimum element: "+min);
	}

}
