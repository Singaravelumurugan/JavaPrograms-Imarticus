package Recursion;

public class MixedSeries {
	static int n1=1,n2=0,primenum=2,n3,flag=0;
	static void fibo(int n) {
		System.out.print(n3+" ");
		n1=n2;
		n2=n3;
	}
	static int prime(int num) {
		for(int j=2;j<num;j++) {
			if(num%j==0) {
				num++;
				prime(num);
			}
		}
		return num;
	}

	public static void main(String[] args) {
	for (int i=1;i<=13;i++) {
		if(i%2!=0) {
			n3=n1+n2;
			fibo(n3);
		}
		else {
			primenum=prime(primenum);
			System.out.print(primenum+" ");
			primenum++;
		}
	}

	}

}
