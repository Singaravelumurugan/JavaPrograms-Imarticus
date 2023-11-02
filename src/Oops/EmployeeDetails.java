package Oops;
	class Emp{
		int emp_id;
		String emp_name;
		int salary;
		int bonus;
		void insert1(int empid, String empname, int sal,int bon) {
			emp_id=empid;
			emp_name=empname;
			salary=sal;
			bonus=bon;
		}
		void getDetails() {
			System.out.println(emp_id);
			System.out.println(emp_name);
			System.out.println(salary+bonus);		
		}
	}

public class EmployeeDetails {

	public static void main(String[] args) {
		Emp e1=new Emp();
		e1.insert1(101, "kathir" , 10000, 5000);
		e1.getDetails();
	}
}
