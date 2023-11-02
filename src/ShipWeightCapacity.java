import java.util.Scanner;

public class ShipWeightCapacity {
		// Skilenza question
		public static int shipWithinDays(int []arr,int min,int n ,int p ) {
			int count =0,weight=0;
			check:
				for(int i=0;i<n;i++) {
				weight+=arr[i];
				if(weight>min) {
					weight=0;
					i--;
					++count;
					continue check;
				}
				if(count==p) {
					if(--i==n-1) 
						return min;
					else {
						min++;
						i=-1;
						count=0;
						weight=0;
						continue check;
					}
				}
				}
	      return min;
	        	
		}
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int T = scanner.nextInt(); 
	        for (int t = 0; t < T; t++) {
	        	  int n = scanner.nextInt(); 
	        	  int sum=0;
	              int p = scanner.nextInt(); 
	              int[] weights = new int[n];
	              	
	              for (int i = 0; i < n; i++) {
	                  weights[i] = scanner.nextInt();
	                  sum+=weights[i];
	              }
	     
				int min=sum/p;
	              int result = shipWithinDays(weights, min,n,p);
	              System.out.print(result);/* 1
	              257
	              87
	              369
	              163
	              388
	              193
	              164
	              149
	              137
	              365
	              245
	              135*/




	        }
              scanner.close();
	}
}

