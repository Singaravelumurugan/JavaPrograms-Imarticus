package Oops;

class Base{
	int emp_id;
	String emp_name;
	void getinfo(int id,String name) {
		emp_id=id;
		emp_name=name;
	}
	void putinfo() {
		System.out.println("Employee Id:"+emp_id);
		System.out.println("Employee name:"+emp_name);
	}
}
class Derived extends Base{
	String designation;
	int salary;
	void getinfo1(String desig,int sal) {
		getinfo(101,"Malar");
		designation=desig;
		salary=sal;
	}

	void putinfo1() {
		 putinfo();
		 System.out.println("Designation:"+designation);
		 System.out.println("Salary:"+salary);
	}
public class Inheritance {

	public static void main(String[] args) {
		Derived d =new Derived();
		d.getinfo1("HR",20000);
		d.putinfo1();
		

	}
}
}


