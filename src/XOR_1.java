import java.util.Scanner;
public class XOR_1 {
	static int countSetBits(int n) {
		int count=0;
		while(n>0) {
			n=(n & (n-1));
			count++;
		}
		return count;
	}
	static int minValue(int a,int b) {
		int setBits = countSetBits(b);
		int ans=0;
		for(int i=31;i>=0;i--) {
			int mask=(1<<i);
			if ((mask & a) > 0 && setBits>0) {
				ans=ans | mask;
				setBits--;
			}
		}
		int i=0;
		while (setBits>0) {
			int mask = (1<< i);
			if((mask & ans) ==0 ) {
				ans=ans | mask;
				setBits--;
			}
			i++;
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter A ");
		int a=s.nextInt();
		System.out.println("Enter B ");
		int	b=s.nextInt();
		System.out.println("Answer is : "+minValue(a,b));
	}

}
