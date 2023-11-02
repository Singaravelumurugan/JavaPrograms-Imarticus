package DataStructures;
import java.util.Scanner;
class Node9{
	protected int data;
	protected Node9 next,prev;
	public Node9() {
		next=null;
		prev=null;
		data=0;
	}
	public Node9(int d,Node9 n,Node9 p) {
		data=d;
		next=n;
		prev=p;
	}
	public void setLinkNext(Node9 n) {
		next=n;
	}

public void setLinkPrev(Node9 p) {
	prev=p;
}
public Node9 getLinkNext()
{
	return next;
}
public Node9 getLinkPrev() {
	return prev;
}
public void setData(int d) {
	data=d;
}
public int getData()
{
	return data;
	}

}
class LinkedList{
	protected Node9 start;
	public int size;
	public String isEmpty;
	public LinkedList() {
		start=null;
		size=0;
	}
	public boolean isEmpty() {
		return start==null;
		
	}
	public int getSize() {
		return size;
	}
	public void insert(int val) {
		Node9  nptr=new Node9(val,null,null);
		Node9 tmp,ptr;
		boolean ins=false;
		if(start==null)
			start=nptr;
		else if(val<=start.getData()) {
			nptr.setLinkNext(start);
			start.setLinkPrev(nptr);
			start=nptr;
		}
		else
		{
			tmp=start;
			ptr=start.getLinkNext();
			while(ptr!=null) {
				if(val>=tmp.getData()&&val<=ptr.getData()) {
					tmp.setLinkNext(nptr);
					nptr.setLinkPrev(tmp);
					nptr.setLinkPrev(ptr);
					ptr.setLinkPrev(nptr);
					ins=true;
					break;
				}
				else {
					tmp=ptr;
					ptr=ptr.getLinkNext();
				}
			}
			if(!ins) {
				tmp.setLinkNext(nptr);
				nptr.setLinkPrev(tmp);
			}	
			}
			size++;
		}
		public void deleteAtPos(int pos) {
			if(pos==1) {
				if(size==1) {
					start=null;
					size=0;
					return;
				}
				start=start.getLinkNext();
				start.setLinkPrev(null);
				size--;
				return;
		}
			if(pos==size) {
				Node9 ptr=start;
				for(int i=1;i<size-1;i++)
					ptr=ptr.getLinkNext();
				ptr.setLinkNext(null);
				size--;
				return;			
				}
			Node9 ptr=start.getLinkNext();
			for(int i=2;i<=size;i++) {
				if(i==pos) {
					Node9 p=ptr.getLinkPrev();
					Node9 n=ptr.getLinkPrev();
					p.setLinkNext(n);
					n.setLinkNext(p);
					size--;
					return;
				}
				ptr=ptr.getLinkNext();
			}
		}
		public void display() {
			System.out.print("Doubly Linked List = ");
			if(size==0)
			{
				System.out.print("empty\n");
				return;
			}
			if(start.getLinkNext()==null) {
				System.out.println(start.getData());
				return;
			}
			Node9 ptr=start;
			System.out.print(start.getData()+"<->");
			ptr=start.getLinkNext();
			while(ptr.getLinkNext()!=null) {
				System.out.print(ptr.getData()+"<->");
				ptr=ptr.getLinkNext();
			}
			System.out.print(ptr.getData()+"\n");
				
		}
	}
public class SortedDoublyLinkedList {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		LinkedList list=new LinkedList();
		System.out.println("Sosted Doubly Linked List Test\n");
		char ch;
		do {
			System.out.println("\nsorted Doubly Linked List Operation\n");
			System.out.println("1.insert");
			System.out.println("2.delet at position");
			System.out.println("3.check empty");
			System.out.println("4.get Size");
			int choice =s.nextInt();
			switch(choice) {
			case 1:
			System.out.println("Enter integer element to insert");
			list.insert(s.nextInt());
			break;
			case 2:
				System.out.println("enter position");
				int p=s.nextInt();
				if(p<1||p>list.getSize())
				System.out.println("Invalid Position\n");
				else
					list.deleteAtPos(p);
				break;
			case 3:
				System.out.println("Empty status= "+list.isEmpty+"\n");
				break;
			case 4:
				System.out.println("size= "+list.getSize()+"\n");
				break;
	default:
		System.out.println("Wrong Entry \n");
		break;
			}
			list.display();
			System.out.println("\nDo you want to continue (Type Y or N)\n");
			ch=s.next().charAt(0);
			}while(ch=='y'||ch=='Y');
		}
	}