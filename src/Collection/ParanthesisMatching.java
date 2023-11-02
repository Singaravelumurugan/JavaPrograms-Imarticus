package Collection;
import java.util.Scanner;
import java.util.Stack;
public class ParanthesisMatching {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		//Creating Stack
		Stack<Integer> stk= new Stack<Integer>();
		System.out.println("Paranthesis Matching Test\n");
		//Accepting expression
		System.out.println("Enter the Expression ");
		String exp= s.next();
		int len = exp.length();
		System.out.println("\n Matches and Mismatches:\n");
		for(int i=0;i<len;i++) {
			char ch= exp.charAt(i);
			if(ch=='(')
				stk.push(i);
			else if(ch==')') {
				try {
				int p = stk.pop()+1;
				System.out.println("')' at index "+(i+1)+" matched with"+"'(' at index "+p);
				}
				catch(Exception e) {
					System.out.println("')' at index "+(i+1)+" Unmatched");
				}
			}
		}
			while(!stk.isEmpty())
				System.out.println("')' at index "+(stk.pop()+1)+" Unmatched ");

	}

}
