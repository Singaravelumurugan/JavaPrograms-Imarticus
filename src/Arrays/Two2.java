package Arrays;

public class Two2 {

	public static void main(String[] args) {
		int r=3,c=3;
		int a[] []= {{1,2,3},{4,5,6},{7,8,9}};
		int b[] []= {{10,20,30},{40,50,60},{70,80,90}};
		System.out.println("Matrix Subtracion");
		for (int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				
				System.out.print(a[i][j]-b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Matrix Multification");
		for (int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				
				System.out.print(a[i][j]*b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Matrix Divison");
		for (int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				
				System.out.print(a[i][j]/b[i][j]+" ");
			}
			System.out.println();
		}
	}

}
