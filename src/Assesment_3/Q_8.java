package Assesment_3;
import java.util.Scanner;
public class Q_8 {

	public static void main(String[] args) {
		int r=4,c=4;
		   Scanner s = new Scanner(System.in);
		    int[][]matrix= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		    System.out.println("sum");
		    for (int i = 0; i < r; i++) {
		      int sumrow = 0;
		      int sumcolumn = 0;
		      for (int j = 0; j < c; j++) {
		        sumrow += matrix[i][j];
		        sumcolumn += matrix[j][i];
		      }
		
		      System.out.println( sumrow);
		      System.out.println(sumcolumn);
		    }
		    System.out.println("Product");
		    for (int i = 0; i < c; i++) {
		      int productrow = 1;
		      int productcolumn = 1;
		      for (int j = 0; j < r; j++) {
		    	  productrow *= matrix[i][j];
		        productcolumn *= matrix[j][i];
		      }
		
		      System.out.println( productrow);
		      System.out.println(productcolumn);
		    }
		  }
		}

