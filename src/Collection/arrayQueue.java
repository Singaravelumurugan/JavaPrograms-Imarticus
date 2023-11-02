package Collection;
import java.util.Scanner;
import java.util.NoSuchElementException;

public class arrayQueue {
	protected int Queue[];
	protected int front,rear,size,len;
	// Constructor
	public arrayQueue(int n) {
		size=n;
		len=0;
		Queue= new int[size];
		front =-1;
		rear= -1;
	}
	//Check Queue is Empty
	public boolean isEmpty() {
		return front==-1;
	}
	//Check Queue is Full
	public boolean isFull() {
		return front==0 && rear==size-1;
	}
	//get the size of array
	public int getsize() {
		return len;
	}
	//Function to check the front element
	public int peek() {
		if(isEmpty())
			throw new NoSuchElementException("underflow Exceptin");
		return Queue[front];
	}
	//insert the element to Queue
	public void insert(int i) {
		if(rear==-1) {
			front=0;
			rear=0;
			Queue[rear]=i;
		}
		else if(rear+1 >= size)
			throw new IndexOutOfBoundsException("Overflow Exception");
		else if(rear+1<size)
			Queue[++rear]=i;
		len++;
	}
	// remove the front element
	public int remove() {
		if(isEmpty())
			throw new NoSuchElementException("Underflow Exception");
		else {
			len--;
			int ele=Queue[front];
			if(front==rear) {
				front=-1;
				rear=-1;
			}
			else 
				front++;
			return ele;
				
		}
	}
	//Display the status of the Queue
	public void display() {
		System.out.print("\nQueue = ");
		if(len==0) {
			System.out.print("Empty\n ");
			return ;
		}
		for(int i=front;i<=rear;i++)
			System.out.print(Queue[i]+" ");
		System.out.println();
	}
		// Class implementation
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Array Queue Test\n");
		System.out.println("Enter the size of Integer Queue");
		int n= s.nextInt();
		//Creating object of the class arrayQueue
		arrayQueue q = new arrayQueue(n);
		char ch;
		do {
			System.out.println("\nQueue Operations ");
			System.out.println("1. insert");
			System.out.println("2. remove ");
			System.out.println("3. peek");
			System.out.println("4. check empty");
			System.out.println("5. check full ");
			System.out.println("6.size");
			int choice =s.nextInt();
			switch(choice) {
			case 1:
			System.out.println("Enter integer element to insert ");
			try {
				q.insert(s.nextInt());
			}
			catch(Exception e) {
				System.out.println("Error : "+e.getMessage());
			}
			break;
			case 2:
				try {
					System.out.println("Removed Elment = "+q.remove());
				}
				catch(Exception e) {
					System.out.println("Error : "+e.getMessage());
				}
				break;
			case 3:
				try {
					System.out.println("Peek Element = "+q.peek());
				}
				catch(Exception e) {
					System.out.println("Error : "+e.getMessage());
				}
				break;
			case 4:
				System.out.println("Empty Status "+q.isEmpty());
				break;
			case 5:
				System.out.println("Full Status "+q.isFull());
				break;
			case 6:
				System.out.println("Size = "+q.getsize());
				break;
				default: System.out.println("Wrong Entry \n ");
				break;
			}
			q.display();
			System.out.println("\nDo you want to continue (Type y or n) \n");
			ch=s.next().charAt(0);
		} while(ch=='Y' || ch=='y');
		s.close();
	}

}
