package Oops;

class parents{
	void show() {
		System.out.println("we are parents");
	}
}
class sons extends parents{
	void disp() {
		System.out.println("i am son class");
	}
}
class daughter extends parents{
	void disp() {
		System.out.println("i am daughter class");

	}
}
public class hie {

	public static void main(String[] args) {
		sons s=new sons();
		daughter d=new daughter();
		s.show();
		d.show();
		s.disp();
		d.disp();
	}

}
