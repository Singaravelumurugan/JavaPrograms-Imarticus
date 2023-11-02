package DataStructures;

public class CircularLinkedList {
	int flag=0;

	class Node{
		int data;
		public Node next;
		public Node (int data) {
			this.data=data;
			this.next=null;
			}
	}
	// Declaring head and tail pointer as null
	public Node head=null;
	public Node tail=null;
	
	public void insertAtBeginning(int data) {
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
		
	}
	public void insertAtEnd(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
			return;
		}
		tail.next=newNode;
		tail=newNode;
		tail.next=head;
	}
	
	//This function will add the new Node at the end of the list
	public void add(int data) {
		Node newNode= new Node(data);
		//Check if the null list is empty
		if (head==null) {
			//if list is empty , both head and tail would point to new Node
			head=newNode;
			tail=newNode;
			newNode.next=head;
		}else {
			//tail will point to new node
			tail.next=newNode;
			//new node will become new tail
			tail=newNode;
			//since, it is circular linked list tail will point to head
			tail.next=head;
		}	
	}
	public void  insertBetween( int data, int item) {
		Node newNode= new Node(data);
		Node current =head;
		if(head==null) {
			head=newNode;
			tail=newNode;
			tail.next=head;
			return ;
		}
		else {
		do {
			if(current.data==item) {
				if(current==tail) {
				tail.next=newNode;
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
/*	public void deleteNode(int value) {
	//	Node newNode= new Node(data);
		Node current =head;
	    if (head == null) { // the list is empty
	        return;
	    }
	    do {
	        Node next = current.next;
	        if (next.data ==value ) {
	            if (tail == head) { // the list has only one single element
	                head = null;
	                tail = null;
	            } else {
	                current.next = next.next;
	                if (head == next) { //we're deleting the head
	                    head = head.next;
	                }
	                if (tail == next) { //we're deleting the tail
	                    tail = current;
	                }
	            }
	            break;
	        }
	        current = next;
	    } while (current != head);
	}*/
	public void deleteNode(int data) {
		Node newNode=new Node (data);
		Node current =head;
		if(head==null) {
		System.out.println("List is empty");
			return ;
		}
	
		do {
			if(current == head && current.data==data) {
				newNode=head.next;
				tail.next=newNode;
				head=newNode;
			}
		else if(current.next.data==data) {
				newNode=current.next;
				current.next=newNode.next;
				flag=1;
		
			}
			 current =current.next; 
		}
				while(current!=head);
				if(flag==0) {
					System.out.println("Element is not present");
				}
				
			}
	
	public void display() {
		Node current =head;
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		else {
			System.out.println("Nodes of the Circular linked list");
			do { 
				System.out.print(" "+current.data);
				current=current.next;
			}while(current !=head);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		CircularLinkedList c1=new CircularLinkedList();
		c1.add(1);
		c1.add(2);
		c1.add(3);
		c1.add(4);
		c1.insertAtBeginning(9);
		c1.insertAtEnd(8);
		c1.insertAtBeginning(5);
		c1.insertAtEnd(7);
		c1.deleteNode(5);
		c1.insertBetween(10,1);// like element (1) after (10) element print
		c1.deleteNode(5);
		//Display all the nodes present in the list
		c1.display();
		
	}

}
