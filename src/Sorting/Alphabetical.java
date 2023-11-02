package Sorting;
import java.util.Scanner;
public class Alphabetical {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 System.out.print("Enter number of names you want to enter:");
		 int n = s.nextInt();
		 String names[] = new String[n];
		 Scanner s1 = new Scanner(System.in);
		 System.out.println("Enter all the names:");
		    for(int i=0;i<n;i++){
		     names[i] = s1.nextLine();
		 }
		     for(int i=0;i<n;i++){
		      for(int j=i+1;j<n;j++){
		   if (names[i].compareTo(names[j])>0){
		    String temp = names[i];
		    names[i] = names[j];
		    names[j] = temp;
		 }
		 }
		 }
		 System.out.print("Names in Sorted Order:");
		     for (int i=0;i<n;i++){
		 System.out.print(names[i] + ",");
		 }
		 
		 }
		}