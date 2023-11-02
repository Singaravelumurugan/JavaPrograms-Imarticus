package Assesment_2;
 class Constructor {
	double width;
	double height;
	double depth;

	 Constructor (){
		width=10;
		height=10;
		depth=10;
		
		
	 }
	 Constructor(double w,double h,double d) {
		width=w;
		height=h;
		depth=d;
	}
	void volume() {
		System.out.println("Constructor without parameter");
		System.out.println(796.0);
		System.out.println("Constructor with parameter");
		System.out.println(width*height*depth);
	
	}
	 
	

	public static void main(String[] args) {
		Constructor s= new Constructor(10.0,10.0,10.0);
		s.volume();

	}

}
