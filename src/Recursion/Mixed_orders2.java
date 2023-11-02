package Recursion;

public class Mixed_orders2 {

	static int addnum=0;
	static void even(int n) {
		System.out.print(n+" ");
		//n1=n2;
		
	}
	static void fact1(int num) { //fact(0)
		int fact=1;
		if(num==0)
			fact=1;
		else {
		 for(int j =num; j>0;j--) {
			 fact=fact*j;	
		 }
		}			System.out.print(fact+" ");
		
	}

	public static void main(String[] args) {
	for (int i=0;i<12;i++) {
		if(i%2==0) {
			
			even(i);
		}
		else {
			fact1(addnum); //fact1(0)
			addnum++; //addnum=1
		}
	}

	}

}
