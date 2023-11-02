package Oops;

interface MyInterface{
	/* compiler will treat them as:
	 * public abstract void method1();
	 *  public abstract void method2();
	 */
	public void method1();
	public void method2();
}
class Demo2 implements MyInterface {
	public void method1() {
		System.out.println("implementatin of method1");
	}
	public void method2() {
		System.out.println("implementatin of method2");
	}
	
	

	public static void main(String[] args) {
		MyInterface obj=new Demo2();
		obj.method1();
		obj.method2();
	}

}
