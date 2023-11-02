package Oops;

class Person1 {
	String name;
	int age;
	void getPerinfo(String str,int ag) {
		name=str;
		age=ag;
	}
	void putPerinfo() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
	
}
class NewStudent extends Person1{
	int total;
	char grade;
	void getStudinfo(String n,int ag,int tot,char gr) {
		getPerinfo(n,ag);
		total=tot;
		grade=gr;
	}
	void putStudinfo() {
		putPerinfo();
		System.out.println("Total:"+total);
		System.out.println("Grade:"+grade);
	}
}
public class single_inheritance {

	public static void main(String[] args) {
		NewStudent s=new NewStudent();
		s.getStudinfo("Honey",22,98,'A');
		s.putStudinfo();
		
	}

}
