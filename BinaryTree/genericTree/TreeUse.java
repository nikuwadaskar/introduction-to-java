package genericTree;
import Queues.QueueUsingLL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;
public class TreeUse {




	public static void printTree(TreeNode<Integer> root) {
		if (root==null) {return ;}//this is not a base case this is special case 
		System.out.print(root.data+" ");
		for (int i=0; i<root.children.size();i++) {//the base case is handled here 
			TreeNode<Integer>child=root.children.get(i);
			printTree(child);
		}
	}




	public static void printTreeDetailed(TreeNode<Integer> root) {
		if (root==null) {return ;}
		System.out.print(root.data+": ");
		for (int i = 0; i < root.children.size(); i++) {
			System.out.print(root.children.get(i).data+ " ");
		}
		System.out.println();
		for (int i = 0; i < root.children.size();i++) {
			TreeNode<Integer>child=root.children.get(i);
			printTreeDetailed(child);
		}
	}




	public static int numberofNodes(TreeNode<Integer> root){
		int count =1;
		for (int i = 0; i < root.children.size(); i++) {
			int childCount=numberofNodes(root.children.get(i));
			count += childCount;

		}return count;
	}




	public static int sumOfAlINode(TreeNode<Integer> root){
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		int total = 0;
		for (int i = 0; i < root.children.size(); ++i) {
			total+=sumOfAlINode(root.children.get(i));
		} return root.data+total;
	}




	/*	public static TreeNode<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		//i still cant be able to complete this shitt programme 
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new LinkedList<>();
		System.out.println("Enter root data ");
		int rootData = s.nextInt();
		if(rootData==-1) {
			return null;
		}
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		while (!pendingNodes.isEmpty()) {
			TreeNode<Integer> front = pendingNodes.dequeue();
			System.out.println("enter the no of the children for : "+ front.data);
			int numChild= s.nextInt();
			for (int i = 0; i<numChild;i++) {
				System.out.println("enter the "+ i+ "th child of data for :"+ front.data);
				int childData=s.nextInt();
				TreeNode<Integer>childNode = new TreeNode<Integer>(childData);
				front.children.add(childNode);
				pendingNodes.enqueue(childNode);
			}

		}return root
	}*/





	public static void printLevelWise(TreeNode<Integer> root){
		Queue<TreeNode<Integer>> queue = new LinkedList<>();
		//added 1st level here 
		queue.add(root);
		queue.add(null);

		while(!queue.isEmpty())
		{
			TreeNode<Integer> frontNode = queue.remove();
			if(frontNode == null){
				if(queue.isEmpty()){
					break;
				}
				System.out.println();
				queue.add(null);
			}else{
				System.out.print(frontNode.data+" ");
				for(int i=0;i<frontNode.children.size();i++){
					queue.add(frontNode.children.get(i));
				}
			}
		}
	}




	public static int numNodeGreater(TreeNode<Integer> root,int x){
		if(root==null) {
			return 0;
		}
		int nodesGreater = 0;
		for(int i=0;i<root.children.size();i++) {
			nodesGreater+=numNodeGreater(root.children.get(i), x);

		}
		if(root.data > x) {
			return nodesGreater + 1;
		}
		return nodesGreater;
	}






	public static int getHeight(TreeNode<Integer> root){

		if(root==null) {
			return 0;
		}
		int maxHeight = 0;
		for(int i=0;i<root.children.size();i++) {
			int max = getHeight(root.children.get(i));
			if(maxHeight< max ) {
				maxHeight = max;
			}
		}
		return maxHeight + 1;
	}






	public static int countLeafNodes(TreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		if(root.children.size()==0) {
			return 1;
		}
		int sum=0;
		for(int i=0;i<root.children.size();i++) {
			sum+=countLeafNodes(root.children.get(i));
		}
		return sum;
	}








	public static void replaceWithDepthValue(TreeNode<Integer> root ) {
		if(root==null) {
			return ;
		}	replaceWithDepthValue(root,0);

	}
	public static void replaceWithDepthValue(TreeNode<Integer> root, int depth){
		root.data=depth;
		for(TreeNode<Integer>child:root.children){
			replaceWithDepthValue(child,depth+1);
		}
	}






	public static void printPostOrder(TreeNode<Integer> root){
		if(root==null) {
			return ;
		}
		for(int i=0;i<root.children.size();i++) {
			printPostOrder(root.children.get(i));
		}
		System.out.print(root.data+" ");	
	}









	public static boolean checkIfContainsX(TreeNode<Integer> root, int x){
		// Write your code here
		if(root==null)
			return false;	
		Queue<TreeNode<Integer>> queue = new LinkedList<>();
		//added 1st level here 
		queue.add(root);
		queue.add(null);

		// if(x<root.data)
		//     ans++;
		while(!queue.isEmpty()){
			TreeNode<Integer> frontNode = queue.remove();
			if(frontNode == null){
				if(queue.isEmpty()){
					break;
				}  
				queue.add(null);
			}else{
				if(frontNode.data==x)
					return true;
				//System.out.print(frontNode.data+" ");
				for(int i=0;i<frontNode.children.size();i++){
					queue.add(frontNode.children.get(i));
				}
			}   
		}   
		return false;
	}
	public static boolean checkIfContainsXbetter(TreeNode<Integer> root, int x){
		if(root==null) {
			return false;
		}
		if(root.data==x) {
			return true;
		}
		for(TreeNode<Integer> child : root.children) {
			if(checkIfContainsXbetter(child, x)) {
				return true ;
			}
		} return false;
	}








	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		TreeNode<Integer> ans = root;
		int sum = root.data;
		for (int i = 0; i < root.children.size(); i++) {
			sum = sum + root.children.get(i).data;
		}
		for (int i = 0; i < root.children.size(); i++) {
			TreeNode<Integer> childMax = maxSumNode(root.children.get(i));
			int smallSum = childMax.data;
			for (int j = 0; j < childMax.children.size(); j++) {
				smallSum = smallSum + childMax.children.get(j).data;
			}
			if (sum <= smallSum) {
				ans = childMax;
				sum = smallSum;
			}
		}
		return ans;
	}

	
	






	public static int countLeafNodes1(TreeNode<Integer> root){
		int leaf = 0;
		if (root == null ){
			return 0;
		}if (root.children.size() == 0){
			return 1;
		}
		for (TreeNode<Integer> child : root.children) {
			leaf += countLeafNodes(child);
		}
		return leaf;
	}	
	public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){
		// we have written count leaf function twice 
		int a=countLeafNodes(root1),b=countLeafNodes1(root2);
		return a==b;
	}







	static TreeNode<Integer> res =null; //one way of doing this 
	static void nextLargerElementUtil(TreeNode<Integer> root, int x) { 
		if (root == null){
			return;
		}
		// if root is less than res but  
		// greater than x, update res 
		if (root.data > x)  {
			if (res==null || root.data<res.data){
				res = root; 
			}
		}// Number of children of root 
		int numChildren = root.children.size(); 
		// Recur calling for every child 
		for (int i = 0; i < numChildren; i++){
			nextLargerElementUtil(root.children.get(i),x); 
		}
	}
	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
		// resultant node 
		//TreeNode<Integer> res = new TreeNode<>(Integer.MIN_VALUE); 
		// calling helper function 
		nextLargerElementUtil(root,n); 
		//System.out.println(res);
		return res; 



	}
	//now better way of doing it 
	public static TreeNode<Integer> findNextLargerNodebetter(TreeNode<Integer> root, int n){
		if (root==null) {
			return null;
		}
		TreeNode<Integer> nextLargerNode=null;
		if(root.data>n) {
			nextLargerNode=root;    		
		}
		for(TreeNode<Integer>child:root.children) {
			TreeNode<Integer> nextLargerInChild=findNextLargerNodebetter(child, n);
			if(nextLargerInChild!=null) {
				if(nextLargerNode==null|| nextLargerNode.data>nextLargerInChild.data) {
					nextLargerNode=nextLargerInChild;
				}
			}

		}
		return nextLargerNode;
	}









//ye kuch samjha nahi muze jay shree raam 
	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){
		if(root.children.size() == 0){
			return null;
		}
		Queue<TreeNode<Integer>> queue = new LinkedList<>();
		TreeNode<Integer> fl=root,sl=null;
		int data = 0;
		queue.add(root);
		//queue.add(null);
		while(!queue.isEmpty()){
			TreeNode<Integer> frontNode = queue.poll();
			//             if(frontNode == null){
			//                 if(queue.isEmpty()){
			//                     break;
			//                 }

			//                 queue.add(null);
			//             }
			//             else{
			for(int i=0;i<frontNode.children.size();i++){
				queue.add(frontNode.children.get(i));
			}
			if(frontNode.data >  data){
				if(frontNode.data > fl.data){
					sl = fl;
					data = fl.data;
					fl = frontNode;
				}
				else if (frontNode.data < fl.data){
					sl = frontNode;
					data = sl.data;
				}
			}
			// if(fl.data<frontNode.data)
			// {    
			//     sl=fl;
			//  fl=frontNode;
			// }
			// else if(sl.data<frontNode.data){
			//     sl=frontNode;
			// }
		}
		return sl;
	}






	public static void main(String[] args) {

		TreeNode<Integer> root = new TreeNode<Integer>(4);
		TreeNode<Integer> root1 = new TreeNode<Integer>(2);
		TreeNode<Integer> root2 = new TreeNode<Integer>(3);
		TreeNode<Integer> root3 = new TreeNode<Integer>(1);
		TreeNode<Integer> root4 = new TreeNode<Integer>(5);
		TreeNode<Integer> root5 = new TreeNode<Integer>(6);

		root.children.add(root1);
		root.children.add(root2);
		root.children.add(root3);

		root2.children.add(root4);
		root2.children.add(root5);
		//		printTree(root);
		replaceWithDepthValue(root);
		printTreeDetailed(root);


	}

}
