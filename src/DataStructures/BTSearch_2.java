package DataStructures;

public class BTSearch_2 {
	class Node2{
		int key;
		Node2 left,right;
		public Node2(int item) {
			key=item;
			left=right=null;
		}
	}
	Node2 root;
	BTSearch_2 (){
		root=null;
	}
	void  insert (int key) {
		root=insertkey(root,key);
	}
	Node2 insertkey (Node2 root, int key) {
		if (root == null) {
			root= new Node2(key);
			return root;
		}
		if(key<root.key)
			root.left= insertkey (root.left,key);
		else if (key>root.key)
			root.right = insertkey (root.right,key);
		return root;
	}
	void inorder() {
		inorderrec(root);
		
	}void inorderrec(Node2 root){
		if(root!=null) {
			inorderrec(root.left);
			System.out.print(root.key+" ");
			inorderrec(root.right);
		}
	}
	void preorder () {
		preorderrec (root);
	}
	void preorderrec (Node2 root) {
		if (root!= null) {
			System.out.print(root.key+" ");
			preorderrec(root.left);
			preorderrec(root.right);
		}
	}
   void postorder () {
	postorderrec (root);
   }
	void postorderrec (Node2 root) {
		if (root!= null) {
			postorderrec(root.left);
			postorderrec(root.right);
			System.out.print(root.key+" ");
	
		}
	}
	int minvalue(Node2 root) {
		int minv=root.key;
		while(root.left!=null) {
			minv=root.left.key;
			root=root.left;
		}
		return minv;
	}
	boolean search(int key) {
		return searchnode(root,key);
	}
	boolean searchnode(Node2 root,int search) {
		if(root==null)
			return false;
		else if(root.key==search)
			return true;
		else if(search<root.key)
			return  searchnode(root.left,search);
		else if(search>root.key)
			return searchnode(root.right,search);
		return false;
		
	}


	public static void main(String[] args) {
		BTSearch_2 tree = new BTSearch_2();
		tree.insert(56);
		tree.insert(23);
		tree.insert(80);
		tree.insert(12);
		tree.insert(234);
		tree.insert(546);
		tree.insert(6);
		tree.insert(32);
		 System.out.println("postorder traversal: ");
			tree.postorder();
		 System.out.println("\npreorder traversal: ");
		tree.preorder();
		 System.out.println("\ninorder traversal: ");
			tree.inorder();
			System.out.println();
			// tree.minvalue(null);
		     if(tree.search(6)) 
		    	 System.out.println("Element is present");
		     else
		    	 System.out.println("Element is not present");
		
		
	}

}
