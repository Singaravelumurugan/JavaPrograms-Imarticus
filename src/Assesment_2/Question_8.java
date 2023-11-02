package Assesment_2;
class Shape {
		double pi=3.142;
	    void Area(float a)
	    {
	        float A = a * a;
	        System.out.println("The Area of the Square is " + A);
	    }
	    void Area(double r)
	    {
	        double A = pi * r * r;
	        System.out.println("The Area of the Circle is " + A);
	    }
	    void Area(double a, double b)
	    {
	        double A = a * b;
	        System.out.println("The Area of the Rectangle is " + A);
	    }
	}
	public class Question_8 {
	    public static void main(String[] args)
	    {
	        Shape s = new Shape();
	       s.Area(5);
	       s.Area(5);
	       s.Area(16,16);
	}

}
