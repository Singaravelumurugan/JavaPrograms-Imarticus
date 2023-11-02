package Oops;
	class person25{
		void show1() {
			System.out.println("I am a Person");
			
		}
	}										//one Base class many derived class its called hierarchical inheritance
	class teacher extends person25{
		 void show2() {
			System.out.println("I am a Teacher who is person");
		}
	}
	class student extends person25{
		void show3() {
			System.out.println("I am a Student who is person");
		}

		
		}
	class doctor extends person25{
		void show4() {
			System.out.println("I am a doctor who is a Person");
		}
	}
public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		teacher t=new teacher();
		student s=new student();
		doctor d=new doctor();
		t.show1();
		t.show2();
		s.show3();
		d.show4();
	}
}
