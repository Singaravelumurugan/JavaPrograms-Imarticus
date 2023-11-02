package Assesment_4;

public class Q_5 {
	class Node{
		int data;
		Node next;
		Node (int data) {
			this.data=data;
			this.next=null;
			
		}
	}
	 Node head=null;
	 Node tail=null;
	
	public void insertAtBegining (int data) {
		Node newnode=new Node(data);
		newnode.next=head;
		head=newnode;
	
	}
	public void addNode(int data) {
		Node newnode= new Node (data);
		if (head==null) {
			head=newnode;
			tail=newnode;
		}else {
			tail.next=newnode;
			tail=newnode;
		}
	}
	public void insertAtEnding(int data) {
		Node newnode= new Node (data);
		if (head==null) {
			head=newnode;
			tail=newnode;
			return;
		}
		tail.next=newnode;
		tail=newnode;
		
	}
	void display() {
		Node count= head;
		if(head==null) {
			System.out.println("List is empty");
			return;
		}else {
			while(count!=null) {
				System.out.println(count.data);
				count=count.next;
		}
			System.out.println("Node is completed");
		}
	}

	public static void main(String[] args) {
		Q_5 list= new Q_5();
		list.display();
		list.addNode(10);
		list.addNode(20);
		list.insertAtEnding(100);
		list.addNode(30);
		list.addNode(40);
		list.insertAtBegining(1000);
		list.insertAtBegining(2000);
		list.display();
	}

}
