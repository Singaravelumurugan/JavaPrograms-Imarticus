package Works;
import java.util.Scanner;
public class Amst {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int count=0; int n,rem,res = 0;
		System.out.print("Enter amstr number");
		int num=s.nextInt();
		 n=num;
		while(n!=0) {
			count++;
			n=n/10;
		}
		n=num;
		while(n!=0) {
			rem=n%10;
			res=(int) (res+Math.pow(rem, count));
			n=n/10;
		}
		if(num==res) {
			System.out.print("It is Amst");

		}else {
			System.out.print("Not amst");

		}

	}

}
