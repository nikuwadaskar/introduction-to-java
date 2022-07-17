package binaryTree;

public class BSTuse {

	public static void main (String [] args) {
		BSTclass b = new BSTclass();
		b.insert(5);
		b.insert(2);
		b.insert(7);
		b.insert(1);
		b.insert(3);
		b.insert(6);
		b.insert(8);
		
		b.printTree();
		System.out.println(b.isPResent(5));
		b.deleteData(5);
		System.out.println(b.isPResent(5));
		b.printTree();
		b.deleteData(2);
		System.out.println(b.isPResent(2));
		System.out.println(b.size());
		
	}
	
}
