package Oops;

	class Counter3 {
	int count=0;//Normal Datatype
	
	Counter3(){
		count++;
		System.out.println(count);
	}
}
	
	class Counter2{		//using static variable Datatype...
		static int count=0;

		Counter2(){
			count++;
			System.out.println(count);
	}
	public static void main(String[] args) {
		Counter2 c1=new Counter2();
		Counter2 c2=new Counter2();
		Counter2 c3=new Counter2();
		
		Counter3 c4=new Counter3();
		Counter3 c5=new Counter3();
		Counter3 c6=new Counter3();

	}
	}

