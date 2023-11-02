package Arrays;

public class Trace {

	public static void main(String[] args) {
		int r=3,c=3;
		int a[] []= {{2,3,4},{7,8,9},{5,6,8}};
		int b[] []= {{3,3,3},{3,4,6},{8,4,7}};
		System.out.println("A Matrix ");
		
		for (int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("B Matrix ");
		for (int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Matrix Addition");
		for (int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				
				System.out.print(a[i][j]+b[i][j]+" ");
			}
			System.out.println();
		}


	}

}
