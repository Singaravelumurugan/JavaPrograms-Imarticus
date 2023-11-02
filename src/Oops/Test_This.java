package Oops;

class Subject{
	int rollno;
	String name;
	float fee;
	Subject(int rollno, String name,float fee){       //Student replace to Subject because student name already used in other class
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+fee);
	}
}

public class Test_This {

	public static void main(String[] args) {
		Subject s1= new Subject(111,"Ankit ",5000f);
		Subject s2= new Subject(112,"Kathir ",6000f);
		s1.display();
		s2.display();
	}

}
