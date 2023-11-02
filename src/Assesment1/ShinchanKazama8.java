package Assesment1;

public class ShinchanKazama8 {
	
	 int value,result;
	 void Method( int a,int b,int s) {
		value=a-b;
		System.out.println("Value : "+value);
		result=value/s;
		System.out.println("Result is "+result);
	}
	 
 
	public static void main(String[] args) {
		ShinchanKazama8 s=new ShinchanKazama8();
		s.Method(5,2,3);
		s.Method(9,1,2);
		

	}

}
