package MyWorks;
import java.util.Scanner;
public class peter {

	public static void main(String[] args) {
		int num,sum = 0,temp = 0,rem = 0;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=s.nextInt();
		int fact = 0;
		for(num=temp;temp>0;temp=temp/10) {
		 fact=1;rem=temp%10;
		}
		for (int i=1;i>=rem;i++) {
			sum=sum+fact;
		}
		if(sum==num) {
			System.out.print("Peterson ");
		}else {
			System.out.print("Not Peterson ");
		}
	}

}
