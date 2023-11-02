package Oops;

public class Overloading_constructer {
	int id;
	String name;
	int age;
	//creating two argument constructor
	 Overloading_constructer (int i,String n){
		 id=i;
		 name=n;
	 }
	 
	 Overloading_constructer (int i,String n,int l){
		 id=i;
		 name=n;
		 age=l;
	 }
	 void display() {
		 System.out.println(id+" "+name+" "+age);
	 }

	public static void main(String[] args) {
		 Overloading_constructer s1=new  Overloading_constructer(111,"Karan");
		 Overloading_constructer s2=new  Overloading_constructer(111,"Kathir",23);
		 s1.display();
		 s2.display();


	}

}
