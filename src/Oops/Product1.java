package Oops;

public class Product1 {
	int p_id;
	String p_name;
	float p_price;		//is-A relationship
	
	Product1 (int i,String n){
		p_id=i;
		p_name=n;
	}
	Product1 (int i,String n,float k){
		p_id=i;
		p_name=n;
		p_price=k;

	}
	void display() {
		System.out.println(p_id+" "+p_name+" "+p_price);
	}

	public static void main(String[] args) {
		Product1 p=new Product1(706,"Rose milk");
		Product1 p1=new Product1(806,"Badam milk",30);
		p.display();
		p1.display();
	}

}
