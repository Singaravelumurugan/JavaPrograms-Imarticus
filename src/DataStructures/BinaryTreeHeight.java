package DataStructures;

public class BinaryTreeHeight {

		public static class Node{
				int data;
			  Node left, right;
			  public Node (int data) {
				  this.data=data;
				  this.left=null;
				  this.right=null;
			  }
			}
		//Represent the root of Binary tree
		public Node root;
		public 	BinaryTreeHeight() {
			root=null;
		}
	// findHeight() with determine the maximum height of the Binary tree
			 public int findHeight (Node temp){

				//check the whether is empty
				 if(root == null) {
					 System.out.println("Tree is empty ");
					 return 0;
				 }else {
					 int leftheight=0,rightheight=0;
					 
					if(temp.left!=null)
						 leftheight=findHeight(temp.left);
					if (temp.right!=null)
						 rightheight=findHeight(temp.right);
					int max = (leftheight>rightheight)? leftheight:rightheight;
					//calculate the total height of the tree
					return (max+1);
				 	}
			}


		public static void main(String[] args) {
			BinaryTreeHeight tree = new BinaryTreeHeight();
			tree.root= new Node(1);
			tree.root.left= new Node(2);
			tree.root.right= new Node(3);
			tree.root.left.left= new Node(4);
			tree.root.left.right= new Node(5);
			
			tree.root.right.right= new Node(6);
			tree.root.left.left.left= new Node(7);
			tree.root.left.left.right= new Node(8);
			tree.root.left.left.left.left= new Node(9);
			tree.root.right.right.left= new Node(10);
			tree.root.right.right.left.left= new Node(12);
			tree.root.right.right.left.right= new Node(13);


			
			//Display the maximum  height of the Binary tree
			System.out.println("Maximum height of given Binary Tree : "+tree.findHeight(tree.root));
		}

	}
