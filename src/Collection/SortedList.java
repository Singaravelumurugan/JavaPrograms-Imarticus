package Collection;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
    class SortedListe {
	private ArrayList<Integer>list;
	
	public SortedListe() {
		list= new ArrayList<Integer>();
	}
	//Check list is Empty
	public boolean isEmpty() {
		return list.size()==0 || list== null;
	}
	//Function to clear list
	public void clear() {
		list= new ArrayList<Integer>(); // Create a new  ArrayList space because this function is clear all elements
	}
	//get size of list
	public int size() {
		return list.size();
	}
	//add elements
	public void add(int ele) {
		int pos=list.size();
		list.add(ele);
		while(pos> 0 && ele<list.get(pos-1)) {
			list.set(pos,  list.get(pos-1));
			pos--;
		}
		list.set(pos, ele);
	}
	// remove element in index
	public void remove(int ind) {
		list.remove(ind);
	}
	// Function to perform binary search tree
	public int binarySearch(int ele) {
		return Collections.binarySearch(list,ele);
	}
	// Check if element is present
	public boolean contains(int ele) {
		return binarySearch(ele) >= 0;
	}
	//Function to String
	public String toString() {
		return list.toString();
	}	
	}
    public class SortedList {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Creating object of class SortedListe
		SortedListe list = new SortedListe();
		System.out.println("Sorted List Test\n");
		char ch;
		
		//perform list operations
		do {
			System.out.println("\nSorted List Operations ");
			System.out.println("1. insert");
			System.out.println("2. remove ");
			System.out.println("3. binary search");
			System.out.println("4. contains");
			System.out.println("5. check empty");
			System.out.println("6. get size ");
			System.out.println("7.clear");
			int choice =scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter integer element to add ");
				list.add(scan.nextInt());
				break;
			case 2:
				System.out.println("Enter index ");
				list.remove(scan.nextInt());
				break;
			case 3:
				System.out.println("Enter integer element to search ");
				System.out.println("Binary Search result :"+list.binarySearch(scan.nextInt()));
				break;
			case 4:
				System.out.println("Enter integer element ");
				System.out.println("Contains result :"+list.contains(scan.nextInt()));
				break;
			case 5:
				System.out.println("Empty Status = "+list.isEmpty());
				break;
			case 6:
				System.out.println("Size = " +list.size()+"\n");
				break;
			case 7:
				System.out.println("Sorted List is cleared ");
				list.clear();
				break;
				default :System.out.println("Wrong Entry \n ");
				break;
			}
			//Display List
		  System.out.println(list);
			System.out.println("\nDo you want to continue (Type y or n) \n");
			ch=scan.next().charAt(0);
		} while(ch=='Y' || ch=='y');
		scan.close();
	}
}
