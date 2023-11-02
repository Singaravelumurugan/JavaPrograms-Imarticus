package Datatype;
import java.util.Scanner;

public class Classstudent {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = s.nextInt();
        int[] id = new int[n];
        String[] name = new String[n];
        int mark1,mark2,mark3;
        int total = 0;
        double avg = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the student id:");
            id[i] = s.nextInt();
            System.out.println("Enter the student name:");
            name[i] = s.next();
            System.out.println("Enter the marks of three subjects:");
            mark1 = s.nextInt();
            mark2 = s.nextInt();
            mark3 = s.nextInt();
            total = mark1 + mark2 + mark3;
        
        avg = (double)total / 3;
       if(avg>90){
    	   System.out.print("Excellent:");
    	   }
       else if (avg>80) {
    	   System.out.print("VeryGood:");
       }
       if (avg>70) {
    	   System.out.print("Good:");
       }
       if (avg>60) {
    	   System.out.print("Work Hard:");
       }
       if (avg>50) {
    	   System.out.print("Poor:");
       }
        
        
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + avg);}
    }
}