package Variable;

public class Student_Constructor {
	int stud_id;
	String stud_name;                   //instance variable
	String College;
	public Student_Constructor() {      //default constructor
		stud_id=102;
		stud_name="Sathish";
		College="ABC Engineering College";
		System.out.println(stud_id);
		System.out.println(stud_name);
		System.out.println(College);
	}
	public Student_Constructor(int id,String name,String Col) {
		//parameterized constructor
		System.out.println(id);
		System.out.println(name);
		System.out.println(Col);
	}

	public static void main(String[] args) {
		Student_Constructor sc= new Student_Constructor();
		Student_Constructor sc1= new Student_Constructor(102,"Kavan","MERIT");
	}

}
