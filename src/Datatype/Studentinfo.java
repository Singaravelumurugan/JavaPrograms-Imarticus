package Datatype;
import java.util.Scanner;
public class Studentinfo {

	public static void main(String[] args ){
				int studentid,mark1,mark2;
				float total,average;
		
				Scanner s = new Scanner(System.in);
				System.out.print("Enter the Student Id:");
				studentid = s.nextInt();
				System.out.print("Enter the mark1:");
				mark1 = s.nextInt();
				System.out.print("Enter the mark2:");
				mark2 = s.nextInt();
				total=mark1+mark2;
				System.out.println("Total marks:"+total);
				average=total/2;
				System.out.println("Average marks:"+average);
				
		
				
			}

		


	}
