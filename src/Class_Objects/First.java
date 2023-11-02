package Class_Objects;

public class First {
		int num1=10, num2=20, result;   //States or attributes or data
		void add() {					// Behaviour or function or action
			result=num1+num2;
			System.out.println(result);
		}
		void sub() {
			result=num1-num2;
			System.out.println(result);	
		}
		void mult() {
			result=num1*num2;
			System.out.println(result);
		}
		void div() {
			result=num1/num2;
			System.out.println(result);
		}
		void mod() {
			result=num1%num2;
			System.out.println(result);
		}
	
	public static void main(String[] args) {
		Data d = new Data ();
		d.display();
		First f = new First();
		f.add();
		f.sub();
		f.mult();
		f.div();
		f.mod();
		
	}

}
