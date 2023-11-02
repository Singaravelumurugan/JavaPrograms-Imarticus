package DataStructures;

		class Node {
			int item;
			Node left,right;
			public Node (int key) {
				item=key;
				left= right= null;
			}
		}
			
public class BinaryTree {
	Node root;
	BinaryTree(){
		root = null;
	}
	void postorder (Node node) {
		if (node == null)
			return;
		// Traverse left
		postorder(node.left);
		// Traverse right
		postorder(node.right);
		// Traverse root
		System.out.print(node.item+"->");
		
	}
	void inorder(Node node) {
		if (node == null)
			return;
		inorder(node.left);
		System.out.print(node.item+"->");
		inorder(node.right);
	}
	void preorder(Node node) {
		if (node == null)
			return;
		System.out.print(node.item+"->");
		preorder(node.left);
		preorder(node.right);
	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree ();
		tree.root = new Node(1);
		tree.root.left= new Node(2);
		tree.root.right= new Node(3);
		tree.root.left.left= new Node(4);
		tree.root.left.right= new Node(5);
		tree.root.right.left=new Node (6);// 1,12,9,5,6
		
		System.out.println("Inorder traversal ");
		tree.inorder(tree.root);
		
		System.out.println("\nPreorder traversal ");
		tree.preorder(tree.root);

		System.out.println("\nPostorder traversal ");
		tree.postorder(tree.root);

	}

}
