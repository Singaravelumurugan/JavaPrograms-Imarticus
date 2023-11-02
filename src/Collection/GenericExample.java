package Collection;

public class GenericExample {
	
	public static <E> void printArray(E[] elements) {
		for(E element : elements) {
			System.out.print(element);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer [] intArray= {10,20,30,40,50};
		Character [] charArray= {'J','A','V','A','T','R','A','I','N','I','N','G'};
		System.out.println("Printing Integer Array: ");
		printArray(intArray);
		System.out.println("Printing Character Array : ");
		printArray(charArray);
	}

}
