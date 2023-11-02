package Works;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Union_InterSection {
	static void disp(int[] arrayOne,int[] arrayTwo) {
		Set<Integer> obj = new HashSet<>();
		int i,j;
		for(i=0;i<arrayOne.length;i++) { // 1 2 3 4 5 
			obj.add(arrayOne[i]);
		}
		for(j=0;j<arrayTwo.length;j++) { // 5 3 6 7 9 
			obj.add(arrayTwo[j]);
		}
		System.out.println("The union of both the arrays is ");
		for(Integer I:obj) {
			System.out.print(I+" ");	
		}
		System.out.println();
		obj.clear();
		System.out.println("The intersection of both the arrays is ");
		for(i=0;i<arrayOne.length;i++) {
			obj.add(arrayOne[i]);
		}
		for(j=0;j<arrayTwo.length;j++) {
			if(obj.contains(arrayTwo[j]))
			System.out.print(arrayTwo[j]+" ");
		}

	}
	
	public static void main(String[] args) {
		int m,n;
		Scanner  br = new Scanner (System.in);
		System.out.println("Enter the size of Two Arrays  ");
		n=br.nextInt();
		m=br.nextInt();
		int[]arrayOne= new int[n];
		int[]arrayTwo= new int[m];
		System.out.println("Enter the first array elements  ");
		int i;
		for(i=0;i<arrayOne.length;i++) {
			arrayOne[i]=br.nextInt();
		}
		System.out.println("Enter the second array elements  ");
		for(i=0;i<arrayTwo.length;i++) {
			arrayTwo[i]=br.nextInt();
		}
		disp(arrayOne,arrayTwo);
		br.close();

	}

}
