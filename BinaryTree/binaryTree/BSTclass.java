package binaryTree;

public class BSTclass {
	private BinaryTreeNode<Integer> root;
	private int size;


	private static boolean isPresentHelper(BinaryTreeNode<Integer> node, int x) {
		if (node==null) {
			return false;
		}
		if(node.data==x) {
			return true;
		}
		if(x<node.data) {
			return isPresentHelper(node.left,x);
		}else {
			return isPresentHelper(node.right, x);

		}
	}


	public boolean isPResent(int x) {
		return isPresentHelper(root, x);
	}

	
	public void remove(int data) {
		//Implement the remove() function
		BSTdeleteReturn output = deleteDataHelaper(root,data);
		root=output.root;
		if (output.deleted)
		{
			size--;
		}
		//return output.deleted;
    }
	
	


	private static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer>node, int x){
		if(node==null) {
			BinaryTreeNode<Integer> newRoot= new BinaryTreeNode<Integer>(x);
			return newRoot;
		}
		if(x>=node.data) {
			node.right=insertHelper(node.right, x);
		}else {
			node.left=insertHelper(node.left, x);
		}
		return node;
	}
	public void insert(int x) {
		root=insertHelper(root, x);
		size++;
	}




	public boolean deleteData(int x) {
		BSTdeleteReturn output= deleteDataHelaper(root, x);
		root=output.root;
		if(output.deleted) {
			size--;
		}
		return output.deleted;
	}

	public static BSTdeleteReturn deleteDataHelaper (BinaryTreeNode<Integer>root , int x) {
		if(root==null) {
			return new BSTdeleteReturn(null, false);
		}
		if(root.data<x) {
			BSTdeleteReturn outputRight= deleteDataHelaper(root.right, x);
			root.right=outputRight.root;
			outputRight.root=root;
			return outputRight;
		}
		if(root.data>x) {
			BSTdeleteReturn outputLeft= deleteDataHelaper(root.left, x);
			root.right=outputLeft.root;
			outputLeft.root=root;
			return outputLeft;
		}
		
		//0 child
		if(root.left==null&& root.right==null) {
			return  new BSTdeleteReturn(null, true);
		}//only left child
		if(root.left!=null&&root.right==null) {
			return  new BSTdeleteReturn(root.left, true);
		}//only right child
		if(root.left==null&&root.right!=null) {
			return  new BSTdeleteReturn(root.right, true);
		}//both children are present 
		int rightMax=minimum(root.right);
		root.data=rightMax;
		BSTdeleteReturn outputRight = deleteDataHelaper(root.right, rightMax);
		root.right=outputRight.root;
		return new BSTdeleteReturn(root, true);
		
	}

	public static int minimum(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return Integer.MAX_VALUE;
		}int leftMin =  minimum(root.left);
		int rightMin= minimum(root.right);
		return Math.min(root.data , Math.min(leftMin, rightMin));
	}


	public int size() {
		return size;
	}

	public static void  printTreeHelper(BinaryTreeNode<Integer> node) {
		if (node == null) {
			return;
		}
		System.out.print (node.data + ":");
		if (node.left != null) {
			System.out.print("L" + node.left.data +", ");
		}
		if (node.right != null) {
			System.out.print("R" + node.right.data);
		}
		System.out.println();
		printTreeHelper (node. left);
		printTreeHelper (node.right);
	}

	public void printTree() {
		printTreeHelper(root);

	}

}

class BSTdeleteReturn{
	BinaryTreeNode<Integer> root;
	boolean deleted;
	public BSTdeleteReturn(BinaryTreeNode<Integer>root, boolean deleted) {
		// TODO Auto-generated constructor stub
		this.root=root;
		this.deleted=deleted;
	}

}
