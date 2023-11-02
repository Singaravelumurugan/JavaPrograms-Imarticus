package DataStructures;

public class DoublyLinkedList {
	class Node{
		int data;
		public Node prev;
		public Node next;
		public Node (int data) {
			this.data=data;
			}
	}
	       Node head=null;
	        Node tail=null; 
	public void addNode(int data) {
		Node temp= new Node(data);
		if (tail!=null) {
			tail.next=temp;
			temp.prev=tail;
		}
		tail=temp;
		if(head==null) {
			head = temp;
		}
		System.out.println("New node added: "+data);
		
	}
	public void addNodeFront(int data) {
		Node temp= new Node(data);
		if (head!=null) {
			head.prev=temp;
			temp.next=head;
		}
		head=temp;
		if(tail==null) {
			tail = temp;
		}
		System.out.println("New node added Front: "+data);
		
	}
	public int removeNodeFront() {
		Node temp=head;
		head=head.next;
		head.prev=null;
		System.out.println("deleted : "+temp.data);
		return temp.data;
	}
	public int removeNodeBack() {
		Node temp=tail;
		tail=tail.prev;
		tail.next=null;
		System.out.println("deleted: "+temp.data);
		return temp.data;
	}
	public void removeElement(int data) {
		Node temp=head;
		if(head.data==data) {
			head=head.next;
			head.prev=null;
			return;
		}
		int flag = 0;
		while(temp!=null) {
			if(temp.data==data && temp.next!=null) {
				temp.next.prev=temp.prev;
				temp.prev.next=temp.next;
				flag=1;
			}
			else if (temp.data==data) {
				temp.prev.next=null;
				tail=temp.prev;
			}
			temp=temp.next;
		}
		if(flag==0)
			System.out.println("Element is not present");
	}
	
	public void iterateForward() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public void iterateBackward() {
		Node temp=tail;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.prev;
		}
	}
	

	public static void main(String[] args) {
		DoublyLinkedList d1 = new DoublyLinkedList();
		d1.addNode(2);
		d1.addNode(4);
		d1.addNode(6);
		d1.addNode(8);
		d1.addNodeFront(100);
		d1.addNodeFront(15);
		d1.addNode(10);
		d1.removeElement(11);
		d1.removeNodeFront();
		System.out.println("Forward direction ");
		d1.iterateForward();
		System.out.println("Backward direction ");
		d1.iterateBackward();
	}
}
