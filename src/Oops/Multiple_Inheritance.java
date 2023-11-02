package Oops;

	interface moveable{
		public void run();
	}
	//base interface 2
	interface speakable{	//many Base class one derived class its called multiple inheritance. Not multilevel inheritance.
		public void speak();
	}
	
	interface Ability extends moveable,speakable{
		public void show();
	}
	class person07 implements Ability{
		@Override
		public void run()
		{
			System.out.println("I can run !!");
		}
		@Override
		public void speak() {
			System.out.println("I can speak !!");
		}
		@Override
	public void show() {
		System.out.println("I am a person, i can speak and run!!");
	}
	}

public class Multiple_Inheritance {

	public static void main(String[] args) {
		person07 obj=new person07();
		obj.run();
		obj.speak();
		obj.show();

	}
}

