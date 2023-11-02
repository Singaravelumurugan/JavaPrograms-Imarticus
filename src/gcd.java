
public class gcd {

		    static int gcd(int n, int m){
		        int result = Math.min(n,m);
		        while (result > 0) {
		            if (n % result == 0 && m % result == 0) {
		                break;
		            }
		            result--;
		        }
		        return result;
		    }
		    public static void main(String[] args) {
		    	int n=10, m=5;
		    	System.out.print("Gcd of "+ n +" and "+ m +" is: "+gcd(n,m));
		    }
}
