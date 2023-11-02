package Oops;
class Bank{
	int acc_id;
	String acc_name;
	float initial_balance;
	float amount1;
	float withdrawn;
	Bank(int id,String name,float bal) {
		acc_id=id;
		acc_name=name;
		initial_balance=bal;
	
	
	}
	void display() {
		System.out.println(acc_id +" "+acc_name+" "+initial_balance );
		System.out.println("Balance is: "+initial_balance);
	}
	void deposit(float amount) {
		amount1= amount;
		System.out.println(amount+" deposited");
		System.out.println("Balance is : "+ (amount+initial_balance));
	}
	void withdraw(float withdrawn) {
		
		System.out.println(withdrawn+" withdrawn");
		System.out.println("Balance is : "+((amount1+initial_balance-withdrawn)));
	}
}
public class Account {

	public static void main(String[] args) {
		Bank b=new Bank(832345,"Ankit",1000);
	
		b.display();
		b.deposit(40000);
		b.withdraw(15000);
		
		
	}

}
