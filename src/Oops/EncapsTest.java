package Oops;
class EncapsulationDemo{
	private int ssn;
	private String empName;
	private int empAge;
	
	//Getter and Setter method
	public int getEmpSSN() {
		return ssn;
	}
	public String getEmpName() {
		return empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpName(String newValue) {
		empName=newValue;
		
	}
	public void setEmpSSN(int newValue) {
		ssn=newValue;
		
	}
	public void setEmpAge(int newValue) {
		ssn=newValue;
}

public class EncapsTest {

	public static void main(String[] args) {
		EncapsulationDemo obj=new EncapsulationDemo();
		obj.setEmpName("Mario");
		obj.setEmpAge(32);
		obj.setEmpSSN(112233);
		
	}
}
}
