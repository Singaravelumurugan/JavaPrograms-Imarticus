package Oops;

public class Account2 {
	int acc_id;
	String acc_name;
	float amount;
	//creating parameterized constructor
	Account2 (int i,String n,float l){
		acc_id = i;
		acc_name=n;
		amount=l;
	}
	void display() {
		System.out.println(acc_id+" "+acc_name+" "+amount);
	}

	
		
	public static void main(String[] args) {
		Account2 s1=new Account2(111,"Karan",1000);
		s1.display();

	}

}
