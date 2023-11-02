package Works;
import java.util.Scanner;
import java.util.*;

public class Fibo_Prime {
	
	static int NthPrime(int n){
	int count = 0;	int max = 1000;
	for (int i=2;i<=max;i++){
	    int flag=0;
	    for (int j=2;j<=Math.sqrt(i); j++){
	        if (i%j==0){
	            flag = 1;
	            break;
	        }
	    }
	    if (flag == 0)
	        count++;
	 
	    if (count == n){
	        return i;     
	    }
	}
	    return 0;
	}

	static int NthFib(int n){
	int []f = new int[n + 2];
	 
	f[0] = 1;
	f[1] = 1;
	for (int i=2;i<=n;i++){
	    f[i] = f[i-1]+f[i-2];
	}
	return f[n];
	}
	static void findNthTerm(int n){
	if (n%2==0){
	    n = n/2;
	    n = NthPrime(n);
	    System.out.println(n);
	} else {
	    n = (n/2)+1;
	    n = NthFib(n-1);
	    System.out.println(n);
	}
	}
	    public static void main(String[] args)  {
	    	Scanner s = new Scanner(System.in);
		    System.out.println("Enter the Nth Term: ");
	    	int N=s.nextInt();
	    findNthTerm(N);
	    s.close();
	    }
}
	       