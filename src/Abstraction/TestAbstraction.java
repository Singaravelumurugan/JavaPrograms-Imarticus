package Abstraction;
	abstract class shape{
	abstract void draw();
	}
	class Rectangle extends shape{			//abstract key word use pannanum. method kulla derive panna kudathu.
		void draw() {System.out.println("drawing rectangle");}
	}										//declaration mattum pothum. ithula oru method (draw) but using two classes.like (Rectangle) and (Circle).
	class circle extends shape{
		void draw() {System.out.println("drawing circle");}
	}
public class TestAbstraction {

	public static void main(String[] args) {
		shape s=new circle();
		shape s1=new Rectangle();
		s.draw();
		s1.draw();

	}

}
