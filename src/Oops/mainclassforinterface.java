package Oops;

interface Base1{
	public void fun1();
}
interface Base2{
	public void fun2();
}
class InterImple implements Base1,Base2{       //two base methods interface la ore idathula use pannikka mudiyum
											  //
	@Override
	public void fun2() {
		System.out.println("fun2");
		
	}

	@Override
	public void fun1() {
		System.out.println("fun1");
	}
	
}
public class mainclassforinterface {

	public static void main(String[] args) {
	InterImple obj=new InterImple();
	obj.fun1();
	obj.fun2();

	}

}
