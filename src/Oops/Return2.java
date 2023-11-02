package Oops;

public class Return2 {
	int result;
	void add (int num1,int num2) {
		result=num1+num2;
		System.out.println("Add : "+result);
	}
	int sub(int num1,int num2) {	//void use panna return use panna kudathu...
		result=num1-num2;			//datatypes use panna return use pannanum main method kulla....
		return result;
	}

	public static void main(String[] args) {

			Return2 r=new Return2();
			r.add(10,20);
			System.out.println("Sub : "+r.sub(100,50));


	}

}
