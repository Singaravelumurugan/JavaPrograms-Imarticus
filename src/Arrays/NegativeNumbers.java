package Arrays;

public class NegativeNumbers {

	public static void main(String[] args) {
		int [] arr=new int[] {1,-20,3,-4,2,-17,8,8,3};
		System.out.println("Negative Elements in given array:");
		for(int i=0;i<arr.length;i++) {
				if(arr[i]<0) {
					System.out.println(arr[i]);
				}
		}
	}

}
