package Variable;

public class Static_Variable {
	public static int stud_id=10;
	String name="Rahul";

	public static void main(String[] args) {
		 Static_Variable sv=new Static_Variable();
		 System.out.println( Static_Variable.stud_id); //Static variable - dont have a object
		 System.out.println(sv.name);

	}

}
