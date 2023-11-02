package DataStructures;

public class SinglyLinkedList_1 {
		public class Node{
			
			int data;
			Node next;
			
			public Node(int data) { //Constructor
				this.data=data;
				next=null;
			}
			
		}
		public Node head=null;
		public Node tail=null;
		
		public void insertAtBeginning(int data) {
			Node newNode=new Node(data);
			newNode.next=head;
			head=newNode;
		}
		
		public void addNode(int data) {
			Node newNode= new Node(data);
			
			if(head==null) {
				head=newNode;
				tail=newNode;
			}
			else {
				tail.next=newNode;
				tail=newNode;
			}
		}	
		
		public void inbetween(int pos, int data) {
			Node newNode= new Node(data);
			Node temp = head;
			for(int i=0;i<pos-1;i++) {  // Konjam correction pannanum
				temp.next=newNode;
				
			}
			temp.next=newNode.next;
			temp.next=newNode;
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
		}
		
		public void display() {
			Node current=head;
			if(head==null) {
				System.out.println("List is empty");
				return;
			}
			else {
				System.out.println("Nodes of SinglyLinkedList : ");
				while(current!=null) {
					System.out.print(current.data+" ");
					current=current.next;
				}
			}
			System.out.println();
			System.out.println("Node Completed");

		}

		public static void main(String[] args) {

			SinglyLinkedList_1 sl=new SinglyLinkedList_1();
			
			sl.addNode(1);
			sl.addNode(2);
			sl.insertAtBeginning(10);
			sl.insertAtEnd(20);
			sl.addNode(3);
			sl.addNode(4);
			sl.insertAtEnd(5);
		//	sl.inbetween(3,8);
			sl.display();
			
		}

	}
