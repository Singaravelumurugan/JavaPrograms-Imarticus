package DataStructures;
	   class  Nodes{
			int data;
		  Nodes left, right;
		  public Nodes (int d) {
			   data=d;
			  this.left=null;
			  this.right=null;
		  }
	   }
	//Calculate height
	class Height {
		int height =0;
	}
	
	class BTHeightBalance {
		Nodes root;
		public BTHeightBalance() {
			root = null;
		}
		boolean checkHeightBalance(Nodes root,Height height) {
			if (root==null) {
				height.height=0;
				return true;
			}
			Height leftHeight = new Height(),rightHeight=new Height();
			boolean l = checkHeightBalance(root.left,leftHeight);
			boolean r = checkHeightBalance(root.right,rightHeight);
			int leftHeight1 = leftHeight.height,rightHeight1=rightHeight.height;
			height.height=(leftHeight1>rightHeight1 ? leftHeight1 : rightHeight1)+1;
			if ((leftHeight1 - rightHeight1>=2) || (rightHeight1 - leftHeight1>=2))
				return false;
			else 
				return l&&r;
			
		}
	

	public static void main(String[] args) {
		Height height = new Height();
		BTHeightBalance tree = new BTHeightBalance();
		tree.root = new Nodes(1);
		tree.root.left= new Nodes(2);
		tree.root.right= new Nodes(3);
		tree.root.left.left= new Nodes(4);
		tree.root.left.right= new Nodes(5);
		if (tree.checkHeightBalance(tree.root,height))
			System.out.println("The tree is balanced");
		else {
			System.out.println("The tree is not balanced");
		}

	}
	}

