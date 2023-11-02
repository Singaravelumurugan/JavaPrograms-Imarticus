package Programs;

public class Absolute {
	int first=4, second=8;
	public void add() {
		System.out.println("Addition:"+(first+second));
	}
	public void sub() {
		System.out.println("Difference:"+Math.abs(first-second));
	}

	public static void main(String[] args) {
		Absolute ab= new Absolute();
		ab.add();
		ab.sub();
	}

}
