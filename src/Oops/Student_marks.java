package Oops;

class Marks{
	int stud_id;
	String stud_name;
	void getinfo(int id,String name) {
		stud_id=id;
		stud_name=name;
	}
	void putinfo() {
		System.out.println("Student Id:"+stud_id);
		System.out.println("Student name:"+stud_name);
	}
}
class Student extends Marks{
	int mark1,mark2,mark3;
	int total,average;
	void getinfo1(int m1,int m2,int m3) {
		getinfo(101,"Malar");
		mark1=m1;
		mark2=m2;
		mark3=m3;
		total=mark1+mark2+mark3;
		average=total/3;
	}

	void putinfo1() {
		 putinfo();
		 System.out.println("Total:"+total);
		 System.out.println("Average:"+average);
	}
}
public class Student_marks {

	public static void main(String[] args) {
		Student s =new Student();
		s.getinfo1(95,96,97);
		s.putinfo1();

	}

}

