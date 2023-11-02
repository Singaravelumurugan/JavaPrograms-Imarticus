package Oops;
	class about{
		void show1() {
			System.out.println("Welcome to the Sai Ram Rocks");
		}
	}
	class product extends about{      //Multilevel inheritance
		void show2() {
			System.out.println("Rose milk");	
		}	
		}
	class contact_us extends product{
		public void show3() {
			System.out.println("kathir@gmail.com");
		}
	}

public class Web_Application {

	public static void main(String[] args) {
		contact_us p=new contact_us();
		p.show1();
		p.show2();
		p.show3();
	}

}
