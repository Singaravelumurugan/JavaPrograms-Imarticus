package DataStructures;
import java.util.Scanner;
public class SumofSreies {

	static double sum(int n)
    {
      double Sum = 0.0;
      for (int i =1;i<=n;i++)
          Sum=Sum+(1/i);
      return Sum;
    }

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the value ");
		int n=s.nextInt();
		System.out.println(sum(n));
		s.close();
	}
	
}