package Class_Objects;

import java.util.Scanner;

public class Peterson_Number {

	public static void main(String[] args) {
		    int num,sum=0,fact,rem;			//145
			Scanner s = new Scanner (System.in);
			 System.out.print("Enter the number:");
			 num =s.nextInt();
			 
			 for (int temp=num;
					 temp>0; temp=temp/10){
					fact=1; rem=temp%10;
					
			for(int i=1;i<= rem; i++) {
				fact=fact*i;
			}
			sum=sum+fact;
					 }
			 if (sum==num) {
					System.out.println("Peterson Number:");
				}else
				{
					System.out.println ("Not Peterson Number:");
				}s.close();


	}

}
