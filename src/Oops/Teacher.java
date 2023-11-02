package Oops;

		class  English_Teacher  {
		 float pf=1500; float house_rent_allowance=2000; float basic_salary=25000;
		}
		class Teacher extends  English_Teacher  {
			int id=2320; String name = "Kumar";float bonus=4000;
		

	public static void main(String[] args) {
		Teacher t=new Teacher();
		System.out.println("E.Teacher pf is "+t.pf);
		System.out.println("E.Teacher house rent allowance is "+t.house_rent_allowance);
		System.out.println("E.Teachers basic salary is "+t.basic_salary);
		System.out.println("Teacher id is "+t.id);
		System.out.println("Teacher name is "+t.name);
		System.out.println("Teacher bonus is "+t.bonus);
		

	
	}
	}
