package DataStructures;


	class Node1{
		int data;
		Node1 leftChild;
		Node1 rightChild;
		
		Node1 (int item){
			data = item;
			leftChild=rightChild=null;
			
		}
	}
	

	public class FullBinaryTree{
		Node1 root;
		boolean isFullBinaryTree(Node1 node) {
			if (node == null)
				return true;
			if (node.leftChild == null && node.rightChild==null)
				return true;
			if (node.leftChild != null && node.rightChild !=null)
				return (isFullBinaryTree(node.leftChild)&&isFullBinaryTree(node.rightChild));
				return false;

		}
	
	public static void main(String[] args) {
		FullBinaryTree tree = new FullBinaryTree();
		tree.root= new Node1 (1);
		tree.root.leftChild=new Node1(2);
		tree.root.rightChild=new Node1(3);
		tree.root.leftChild.leftChild=new Node1(4);
		tree.root.leftChild.rightChild=new Node1(5);
		tree.root.leftChild.rightChild.leftChild=new Node1(6);
		tree.root.leftChild.rightChild.rightChild=new Node1(7);

		if (tree.isFullBinaryTree(tree.root))
		System.out.println("This is a full binary tree");
		else 
			System.out.println("This is not a full binary tree");
	}
	
}
