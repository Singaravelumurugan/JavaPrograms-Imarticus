package Oops;
class Rectangle{
	int length;
	int width;
	void insert(int l, int w) {
		length=l;
		width=w;
	}
	void calculateArea() {
		System.out.println(length*width);
	}
}
public class Test_Rectangle {

	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle();
		r1.insert(11,15);
		r2.insert(3,15);
		r1.calculateArea();
		r2.calculateArea();


	}

}
