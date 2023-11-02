package Oops;

class person{
	public void role(){
		System.out.println("Son/Daughter");
	}
}
public class Overriding extends person {
	public void role() {
		super.role();
		System.out.println("Student");
	}
	public static void main(String[] args) {
		Overriding or= new Overriding();
		or.role();
	}

}
