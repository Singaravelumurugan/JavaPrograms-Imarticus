package DataStructures;

 class Node2{
	int item, height;
	Node2 left,right;
	Node2 (int d){
		item=d;
		height=1;
	}
}

public class AVLTree {
	Node2 root;
	int height(Node2 N) {
		if (N==null)
			return 0;
		return N.height;
	}
	int max(int a, int b) {
		return (a>b)?a:b;
	}
	Node2 rightRotate(Node2 y) {
		Node2 x=y.left;
		Node2 T2=x.right;
		x.right=y;
		y.left=T2;
		y.height=max(height(y.left),height(y.right))+1;
		x.height=max(height(x.left),height(x.right))+1;
     return x;
	}
	
	Node2 leftRotate(Node2 x) {
		Node2 y=x.right;
		Node2 T2=y.left;
		y.left=x;
		x.right=T2;
		x.height=max(height(x.left),height(x.right))+1;
		y.height=max(height(y.left),height(y.right))+1;
        return y;
	}
	
	//Get balance factor of a Node2
	int getBalanceFactor(Node2 N) {
		if(N==null) 
			return 0;
			return height(N.left)-height(N.right);
		}
	Node2 insertNode2(Node2 Node2, int item) {
		//Find the position and insert Node2
		if (Node2==null)
			return (new Node2(item));
		if(item<Node2.item)
			Node2.left=insertNode2(Node2.left,item);
		else if (item > Node2.item)
			Node2.right=insertNode2(Node2.right,item);
		else 
			return Node2;
		
		//Update the Balance Factor of Each Node2
		//And, Balance tree
		
		Node2.height=1+max(height(Node2.left),height(Node2.right));
		int balanceFactor= getBalanceFactor(Node2);
		if(balanceFactor > 1) {
			if (item< Node2.left.item) {
				return rightRotate(Node2);
			}
			else if (item>Node2.left.item) {
				Node2.left=leftRotate(Node2.left);
				return rightRotate(Node2);
			}
		}
		if(balanceFactor < -1) {
			if (item > Node2.right.item) {
				return leftRotate(Node2);
			}
			else if (item<Node2.right.item) {
				Node2.right=rightRotate(Node2.right);
				return leftRotate(Node2);
			}
		}
		return Node2;
	}
	Node2 Node2WithMinValue(Node2 Node2) {
		Node2 current =Node2;
		while(current.left!=null)
			current = current.left;
		return current;
	}
	// Delete Node2
	Node2 deleteNode2(Node2 root, int item) {
		//Find the Node2 to be deleted and remove it
		if (root== null)
			return root;
		if(item< root.item)
			root.left=deleteNode2(root.left,item);
		else if (item > root.item)
			root.right=deleteNode2(root.right,item);
		else {
			if ((root.left==null || root.right==null)) {
				Node2 temp =null;
				if (temp== root.left)
					temp= root.right;
				else
					temp= root.left;
				if(temp==null) {
					temp= root;
					root= null;
				} else
					root =temp;
			} else {
				Node2 temp= Node2WithMinValue(root.right);
				root.item=temp.item;
				root.right = deleteNode2(root.right,temp.item);
			}
		}
		if (root == null)
			return root;
		//Update the Balance Factor of each Node2 and balance the tree
		root.height = max(height(root.left),height(root.right))+1;
		int balanceFactor = getBalanceFactor(root);
		if (balanceFactor > 1) {
			if (getBalanceFactor(root.left)>=0) {
				return rightRotate(root);
			}else {
				root.left = leftRotate(root.left);
					return rightRotate(root);
			}
		}
		if(balanceFactor < -1) {
			if (getBalanceFactor(root.right)<=0) {
				return leftRotate(root);
			}else {
				root.right = rightRotate(root.right);
				return leftRotate(root);	
			}
		} 
		return root;
	}
	void preOrder (Node2 Node2) {
		if (Node2 != null) {
			System.out.print(Node2.item+" ");
			preOrder(Node2.left);
			preOrder(Node2.right);
		}
	}

	//Print the tree
	private void printTree(Node2 currPtr,String indent, boolean last) {
		if(currPtr != null) {
			System.out.print(indent);
			if(last) {
				System.out.print("R----");
				indent += " ";
			} else {
				System.out.print("L----");
				indent +="| ";
			}
			System.out.println(currPtr.item);
			printTree(currPtr.left, indent , false);
			printTree(currPtr.right, indent , true);
		}
	}
	public static void main(String[] args) {
		//Driver code
		AVLTree tree= new AVLTree();
		tree.root = tree.insertNode2(tree.root,33);
		tree.root = tree.insertNode2(tree.root,13);
		tree.root = tree.insertNode2(tree.root,53);
		tree.root = tree.insertNode2(tree.root,9);
		tree.root = tree.insertNode2(tree.root,21);
		tree.root = tree.insertNode2(tree.root,61);
		tree.root = tree.insertNode2(tree.root,8);
		tree.root = tree.insertNode2(tree.root,11);
		tree.printTree(tree.root," ", true);
		tree.root= tree.deleteNode2(tree.root, 13);
		System.out.println("After Deletion: ");
		tree.printTree(tree.root," ", true);		
	}

}
