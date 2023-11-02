package Oops;
	class person24{
		void show1() {
			System.out.println("Person class");		//Multilevel inheritance Example
		}
	}
	class student001 extends person24{
		void show2() {
			System.out.println("Student class");
		}
	}
	class Engineering_student extends student001{
		void show3() {
			System.out.println("Engineering class");
		}
	}
public class Person2 {

	public static void main(String[] args) {
	Engineering_student e=new Engineering_student();
	e.show1();
	e.show2();
	e.show3();

	}
}
