package DataStructures;

public class CircularLinkedList_2 {
	int flag=0;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
			
		}
		
	}
	public Node head=null;
	public Node tail=null;
	public void addNode(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
			tail.next=head;
		}
		else {
			tail.next=newNode;
			tail=newNode;
			tail.next=head;
		}
	}
	public void insertBetween(int data,int item) {
		Node newNode = new Node(data);
		Node current=head;
		if(head==null) {
			head=newNode;
			tail=newNode;
			tail.next=head;
			return;
		}
		else {	
		do {
			if(current.data==item) {
				if(current==tail) {
					tail.next=newNode;
					tail=newNode;
					tail.next=head;
					current=newNode;
				}
				else {		
				newNode.next=current.next;
				current.next=newNode;
				current=newNode;
				}
			}		
			current=current.next;
		}while(current!=head);
	}
	}
	public void deleteNode(int data) {
		Node newNode=new Node(data);
		Node current = head;
		if(head==null) {
			System.out.println("List is Empty");
			return;
		}
		do {
			if(current==head && current.data==data) {
				newNode=head.next;
				tail.next=newNode;
				head=newNode;
				
			}
			else if(current.next.data==data) {
				newNode=current.next;
				current.next=newNode.next;
				flag=1;
			}
			current=current.next;		
			
		}while(current!=head);
		if(flag==0) {
			System.out.println("Element not present");
		}
	}
	public void display() {
		Node current=head;
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		else {
			System.out.println("Circular Linked List: ");
			do {
				System.out.println(" "+current.data);
				current=current.next;
			}while(current!=head);
		}
	}
	public static void main(String ar[]) {
		CircularLinkedList_2 cl = new CircularLinkedList_2();
		cl.display();
		cl.insertBetween(100, 10);
		cl.addNode(10);
		cl.addNode(20);
		cl.addNode(30);
		cl.insertBetween(300, 30);
		cl.addNode(40);
		cl.addNode(50);
		cl.insertBetween(400, 50);
		cl.insertBetween(200, 20);
		cl.deleteNode(100);
		cl.deleteNode(40);
		cl.display();
		
	}

}