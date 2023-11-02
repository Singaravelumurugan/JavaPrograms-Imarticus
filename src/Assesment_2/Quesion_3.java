package Assesment_2;

public class Quesion_3 {

	public static void main(String[] args) {
		 int num[] = new int[]{1,2,2,3,3,4};
		 System.out.println("Duplicate Elements in given array:");
			for(int i=0;i<num.length;i++) {
				for(int j=i+1;j<num.length;j++){
					if(num[i]==num[j]) {
						System.out.println(num[j]);
					}
						
				}
			}
		}

	}
