package DataStructures;

public class PerfectBinaryTree {
	static class Node{
		int key;
		Node left,right;
	}
	static int depth(Node node) {
		int d=0;
		while (node != null) {
			d++;
			node = node.left;
		}
		return d;
		
	}
	static boolean is_perfect(Node root,int d, int level) {
		// Check if the tree is empty
		if (root== null)
			return true;
		//if for children
		if (root.left== null && root.right==null)
			return (d==level+1);
		if (root.left== null || root.right==null)
			return false;
		return is_perfect (root.left,d,level+1) && is_perfect (root.right,d,level+1);
	}
	static boolean is_perfect(Node root) {
		int d=depth(root);
		return is_perfect(root,d,0);
	}
	//Create new node
	static Node newNode (int k) {
		Node node = new Node();
		node.key =k;
		node.right = null;
		node.left= null;
		return node;
	}

	public static void main(String[] args) {
		Node root = null;
		root =newNode(1);
		root.left=newNode(2);
		root.right=newNode(3);
		root.left.left=newNode(4);
		root.left.right=newNode(5);
		root.right.left=newNode(6);
		root.right.right=newNode(7);


		

		if (is_perfect(root)== true)
			System.out.println("The tree is a perfect binary tree");
		else
			System.out.println("The tree is not a perfect binary tree");


	}

}
