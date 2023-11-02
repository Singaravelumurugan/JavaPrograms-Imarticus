package DataStructures;

public class SortedCircularLinkedList {
	public class Node {
		int data;
		Node next;
		public Node(int data) { 
			this.data = data;
		}
	}
	public Node head = null;
	public Node tail = null;

	public void add(int data)	{
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
			newNode.next = head;
		}
		else {
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
	}
	public void Sort_List(){
		Node current = head;
		Node temp = null;

		int value;
		if (head == null) {
			System.out.println("Your list is empty");
		}
		else {
			while (current.next != head) {
				temp = current.next;
				while (temp != head) {
					if (current.data > temp.data) {
						value = current.data;
						current.data = temp.data;
						temp.data = value;
					}
					temp = temp.next;
				}
				current = current.next;
			}
		}
	}
	public void PrintList()
	{
		Node current = head;
		if (head == null) {
			System.out.println("Your list is empty");
		}
		else {
			do {
				System.out.print(" " + current.data);
				current = current.next;
			} while (current != head);
			System.out.println();
		}
	}
	public static void main(String[] args){

		SortedCircularLinkedList cl = new SortedCircularLinkedList();
		cl.add(10);
		cl.add(6);
		cl.add(3);
		cl.add(8);
		cl.add(4);

		System.out.print("Original List -->	 ");
		cl.PrintList();
		cl.Sort_List();
		System.out.print("List after Sorting--> ");
		cl.PrintList();
	}
}
