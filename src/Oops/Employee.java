package Oops;

		class Programmer{
		float salary=40000;
	}
	class Employee extends Programmer {
	int bonus=1000;
	
	public static void main(String[] args) {
		Employee p=new Employee();
		System.out.println("Programmer salary is "+p.salary);
		System.out.println("Employee bonus is "+p.bonus);

	}
	}

