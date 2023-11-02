package Datatype;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		int rollno,age;
		long contact;
		String name;
		char gender;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Roll No:");
		rollno = s.nextInt();
		System.out.print("Enter the Name:");
		name=s.next();
		System.out.print("Enter the Contact:");
		contact = s.nextLong();
		System.out.print("Enter the Gender:");
		gender = s.next().charAt(0);
		System.out.print("Enter the Age:");
		age=s.nextInt();
		
		System.out.println("Student information:");
		System.out.println("Roll No:"+rollno);
		System.out.println("Name:"+name);
		System.out.println("Contact:"+contact);
		System.out.println("Gender:"+gender);
		System.out.println("Age:"+age);
		
	}

}
