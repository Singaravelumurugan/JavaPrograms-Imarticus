package Assesment_2;

public class Question_4 {

	public static void main(String[] args) {
		 int num[] = new int[]{1,2,3,4,5,6,7,8,9};
			System.out.println("Even numbers");
			for(int i=0;i<num.length;i++) {
					if(num[i]%2==0) {
						System.out.println(num[i]);
					} 
				}
			System.out.println("Odd numbers");
			for(int i=0;i<num.length;i++) {
				if(num[i]%2!=0) {
					System.out.println(num[i]);
					
				}}

	}
}
