package Recursion;

class Operation {
	int data=50;
	void change(int data) {
		this.data=data+100;   //changes will be the local variable only
	}							// use (this.) Keyword to get output 600

	public static void main(String[] args) {
	Operation op=new Operation();
	System.out.println("before change "+op.data);
	op.change(500);
	System.out.println("after change "+op.data);

	}

}
