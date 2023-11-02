package Datatype;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number of students:");
			int n = sc.nextInt();
			int[] id = new int[n];
			String[] name = new String[n];
			int[] marks = new int[n];
			int total = 0;
			double avg;
			for (int i = 0; i < n; i++) {
			    System.out.println("Enter the student id:");
			    id[i] = sc.nextInt();
			    System.out.println("Enter the student name:");
			    name[i] = sc.next();
			    System.out.println("Enter the student marks:");
			    marks[i] = sc.nextInt();
			    total += marks[i];
			}
			avg = total / n;
			System.out.println("Student ID\tStudent Name\tMarks");
			for (int i = 0; i < n; i++) {
			    System.out.println(id[i] + "\t\t" + name[i] + "\t\t" + marks[i]);
			}
			System.out.println("Total Marks: " + total);
			System.out.println("Average Marks: " + avg);
		}
    }
}