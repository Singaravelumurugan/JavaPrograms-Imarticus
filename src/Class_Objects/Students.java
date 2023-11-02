package Class_Objects;

class Data {
	int StudId=101;
	String StudName="jasmine";
	void display() {
		System.out.println("Stud Id:"+StudId);
		System.out.println("Stud Name:"+StudName);
	}
}
public class Students {
	
	public static void main(String[] args) {
		Data d = new Data (); // students file oda command,inga result varuthu...
		d.display();
	}

}
