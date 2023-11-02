package DataStructures;

public class Intersection_Nodes {
	public static class Node{
		int data;
		Node next;
	}
	public static Node push(Node head, int data) {  //addfront
		// Create a new linked list node from a heap
		Node node= new Node();
		node.data=data;
		node.next=head;
		return  node;
	}
	
	// function two find the intersection of two linked list
	private static Node intersectionPoint(Node list1,Node list2) {
		Node firstTemp=list1;
		while(firstTemp!=null) {
			Node temp=list2;
			while(temp!=null) {
				//if both linked list point to the same Node
				if(firstTemp== temp) {
					return firstTemp;
				}
				temp=temp.next;
			}
			firstTemp=firstTemp.next;
		}
		//if there no intersection node
		return null;
	}

	public static void main(String[] args) {
		// construct the first linked list (1->2->3->4->5->null)
		Node first= null;
		for(int i=7;i>=0;i--){
			first =push (first,i);
		}
		Node second =null;
		for(int i=3;i>0;i--) {
			second =push (second,i);
		}
		// link tail of the second list to the fourth node of the first list
			second.next.next.next=first.next.next.next;
			Node addr =intersectionPoint(first,second);
			if(addr!= null) {
				System.out.println("The intersection point is "+ addr.data);
			}else {
				System.out.println("The list do not intersect ");

			}
	}

}
