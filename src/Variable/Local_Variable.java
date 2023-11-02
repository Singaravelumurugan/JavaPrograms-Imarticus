package Variable;

public class Local_Variable {
	int a;		//Global Variable
	public void display() {
		a=10;
		int b=50;        //Local Variable
		System.out.println(a);
		System.out.println(b);
	}
	public void display1() {
		//a=20
		System.out.println(a);
	}
	public static void main(String[] args) {
		Local_Variable lv= new Local_Variable();
		lv.display();
		lv.display1();
	}

}
