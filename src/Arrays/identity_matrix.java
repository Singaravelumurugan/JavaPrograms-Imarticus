package Arrays;

public class identity_matrix {

	public static void main(String[] args) {
		int r=3,c=3,flag=0;
		int a[][]= {{1,0,0},{0,1,0},{0,0,1}};
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if (a[i][j]!=1 && a[i][j]!=0) {
					flag=1;
				}
			}
		}
		if(flag==0) {
			System.out.println("Identity matrix  ");
		}
		else {
			System.out.println("Not an Identity matrix  ");
		}
		}	
	}
