package binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.*;

import javax.swing.RootPaneContainer;

public class BinaryTreeUse {


	public static void printTree(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data);
		printTree (root. left);
		printTree(root.right);
	}

	public static BinaryTreeNode<Integer> takeTreeInput() {
		System.out.println("Enter root data");
		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();
		if (rootData == -1) {
			return null;
		}

		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer>  leftChild = takeTreeInput();
		BinaryTreeNode<Integer>  rightChild = takeTreeInput();
		root.left=leftChild;
		root.right=rightChild;
		return root;
	}

	public static  int numLeaf(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return 1;
		}
		return numLeaf(root.left)+numLeaf(root.right);
	}

	public static void printTreeDetailed (BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.print (root.data + ":");
		if (root. left != null) {
			System.out.print("L" + root. left.data +", ");
		}
		if (root.right != null) {
			System.out.print("R" + root.right.data);
		}
		System.out.println();
		printTreeDetailed (root. left);
		printTreeDetailed (root.right);
	}


	public static int largest (BinaryTreeNode<Integer> root) {
		if (root == null) {
			return -1;
		}
		int largestLeft = largest (root. left);
		int largestRight = largest (root.right);
		return Math.max (root.data, Math.max (largestLeft, largestRight));
	}


	public static int numNodes (BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int leftNodeCount = numNodes (root. left);
		int rightNodeCount =numNodes (root.right);
		return 1+ leftNodeCount + rightNodeCount;
	}


	public static void printAtDepthK(BinaryTreeNode<Integer>root, int k) {
		if (root ==null) {
			return;
		}
		if (k==0) {
			System.out.println(root.data);
			return;
		}
		printAtDepthK(root.left, k-1);
		printAtDepthK(root.right, k-1);

	}


	public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
		//Your code goes here
		replaceNode(root, 0);
		// printInorder(root);

	}


	static void replaceNode(BinaryTreeNode<Integer> node, int level)
	{
		// Base Case
		if (node == null)
			return;

		// Replace data with current depth
		node.data = level;

		replaceNode(node.left, level+1);
		replaceNode(node.right, level+1);
	}

	// A utility function to print in order
	// traversal of a Binary Tree
	static void printInorder(BinaryTreeNode<Integer> node)
	{
		if (node == null)
			return;
		printInorder(node.left);
		System.out.print(node.data + " ");
		printInorder(node.right);
	}


	public static boolean isNodePresent(BinaryTreeNode<Integer> node, int key) {
		if (node == null)
			return false;

		if (node.data == key)
			return true;

		// then recur on left subtree /
		boolean res1 = isNodePresent(node.left, key);

		// node found, no need to look further
		if(res1) return true;

		// node is not found in left,
		// so recur on right subtree /
		boolean res2 = isNodePresent(node.right, key);

		return res2;
	}


	public static int maxDepth(BinaryTreeNode<Integer> node){
		if (node == null)
			return -1;
		else
		{
			/* compute the depth of each subtree */
			int lDepth = maxDepth(node.left);
			int rDepth = maxDepth(node.right);

			/* use the larger one */
			if (lDepth > rDepth)
				return (lDepth + 1);
			else
				return (rDepth + 1);
		}
	}


	public static BinaryTreeNode<Integer> removeLeaf(BinaryTreeNode<Integer> root){
		if (root == null) {
			return null;
		}
		if(root.left==null && root.right==null) {
			return null;
		}
		root.left = removeLeaf(root.left);
		root.right = (root.right);
		return root;
	}


	public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
		// Your code goes here
		if (root == null){
			return ;
		}
		mirrorBinaryTree(root.left);
		mirrorBinaryTree(root.right);
		BinaryTreeNode<Integer> templeft = root.left;
		root.left=root.right;
		root.right= templeft;
	}


	public static int height(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int leftheight= height(root.left);
		int rightHeight= height(root.right);
		return 1+Math.max(leftheight,rightHeight);
	}


	public static boolean isBAlenced(BinaryTreeNode<Integer> root) {
		if (root==null) {
			return true;
		}
		int leftHeight = height(root.left);
		int rightHeight=height(root.right);
		if(Math.abs(leftHeight-rightHeight)>1) {
			return false;
		}
		boolean isleftBalenced=isBAlenced(root.left);
		boolean isrightBalenced =isBAlenced(root.right);
		return isleftBalenced && isrightBalenced;
	}


	public static BalencedTreeReturn isBalencedBetter(BinaryTreeNode<Integer> root) {
		if (root == null){
			int height=0;
			boolean isBal=true;
			BalencedTreeReturn ans=new BalencedTreeReturn();
			ans.height=height;
			ans.isBalenced=isBal;
			return ans;
		}
		BalencedTreeReturn leftOutput=isBalencedBetter(root.left);
		BalencedTreeReturn rightOutput=isBalencedBetter(root.right);
		boolean isBal=true ;
		int height = 1+ Math.max(leftOutput.height, rightOutput.height);

		if(Math.abs(leftOutput.height-rightOutput.height)>1) {
			isBal=false;
		}
		if (!leftOutput.isBalenced|| !rightOutput.isBalenced) {
			isBal = false;
		}
		BalencedTreeReturn ans = new BalencedTreeReturn();
		ans.height=height;
		ans.isBalenced=isBal;
		return ans;
	}




	public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
		// base case if tree is empty
		if (root == null)
			return 0;

		// get the height of left and right sub-trees
		int lheight = height12(root.left);
		int rheight = height12(root.right);

		// get the diameter of left and right sub-trees
		int ldiameter = diameterOfBinaryTree(root.left);
		int rdiameter = diameterOfBinaryTree(root.right);

		/* Return max of following three
          1) Diameter of left subtree
          2) Diameter of right subtree
          3) Height of left subtree + height of right subtree + 1
		 */
		return Math.max(lheight + rheight + 1,
				Math.max(ldiameter, rdiameter));
	}

	// A wrapper over diameter(Node root)
	// int diameter() { return diameterOfBinaryTree(root); }

	// The function Compute the "height" of a tree. Height
	// is the number of nodes along the longest path from the
	// root node down to the farthest leaf node.
	public static int height12(BinaryTreeNode node)
	{
		// base case tree is empty
		if (node == null)
			return 0;

		// If tree is not empty then height = 1 + max of
		//  left height and right heights
		return (1
				+ Math.max(height12(node.left),
						height12(node.right)));
	}



	public static BinaryTreeNode<Integer> takeInputLvelWise(){
		Scanner s= new Scanner(System.in);
		System.out.println("enter root");
		int rootData= s.nextInt();
		if(rootData==-1) {
			return null;
		}
		BinaryTreeNode<Integer> root= new BinaryTreeNode<>(rootData);
		Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<BinaryTreeNode<Integer>>();
		pendingChildren.add(root);
		while(!pendingChildren.isEmpty()) {
			BinaryTreeNode<Integer> front = pendingChildren.poll();
			System.out.println("enter the left the child of "+front.data);
			int left=s.nextInt();
			if(left!=-1) {
				BinaryTreeNode<Integer> leftChild =new BinaryTreeNode<Integer>(left);
				front.left=leftChild;
				pendingChildren.add(leftChild);
			}

			System.out.println("enter the right the child of "+front.data);
			int right=s.nextInt();
			if(right!=-1) {
				BinaryTreeNode<Integer> rightChild =new BinaryTreeNode<Integer>(right);
				front.right=rightChild;
				pendingChildren.add(rightChild);
			}
		}
		return root;

	}



	public static void printLevelWise(BinaryTreeNode<Integer>root) {
		Queue<BinaryTreeNode<Integer>> pendingNodes= new LinkedList<>();
		pendingNodes.add(root);
		while(!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> frontNode = pendingNodes.poll();
			if(frontNode==null) {
				System.out.println();

				if(!pendingNodes.isEmpty()) {
					pendingNodes.add(null);
				}
			}else {
				System.out.println(frontNode.data+":L:");
				if(frontNode.left!=null) {
					pendingNodes.add(frontNode.left);
					System.out.print(frontNode.left.data+",R:");
				}else {
					System.out.print(-1+",R:");
				}
				if(frontNode.right!=null) {
					pendingNodes.add(frontNode.right);
					System.out.println(frontNode.right.data);
				}else {
					System.out.println(-1);
				}
			}
		}
	}






	public static void printNodesWithoutSibling(BinaryTreeNode<Integer> node) {
		//Your code goes here
		// base case
		if(node == null) {
			return;
		}
		if(node.left==null&& node.right!=null) {
			System.out.print(node.right.data+" ");
		}
		if(node.left!=null&& node.right==null) {
			System.out.print(node.left.data+" ");
		}
		printNodesWithoutSibling (node.left);
		printNodesWithoutSibling (node.right);
	}




	public static BinaryTreeNode<Integer> removeLeafNode(BinaryTreeNode<Integer> root){
		if(root==null) {
			return null;
		}
		if(root.left==null&& root.right==null) {
			return null;
		}
		root.left=removeLeafNode(root.left);
		root.right= removeLeafNode(root.right);
		return root;
	}



	public static BinaryTreeNode<Integer> buildTreePreOrderInOrder(int[] preOrder, int[] inOrder) {
		return helper(0, 0, inOrder.length - 1, preOrder, inOrder);
	}
	private static BinaryTreeNode<Integer> helper(int preStart, int inStart, int inEnd, int[] preOrder, int[] inOrder) {
		//Boundary Conditions.
		if(preStart > preOrder.length-1) {
			return null;
		}
		if(inStart > inEnd) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(preOrder[preStart]);
		int inIndex = 0;
		for(int i=inStart; i<= inEnd; i++) {
			if(root.data == inOrder[i]) {
				inIndex = i;
			}
		}
		root.left = helper(preStart+1, inStart, inIndex-1, preOrder, inOrder);
		root.right = helper(preStart + inIndex-inStart +1, inIndex+1, inEnd, preOrder,inOrder);
		return root;
	}


	public static BinaryTreeNode<Integer>buildTreeFromPreInHelper(int[]pre,int []in,int siPre,int eiPre,int siIn,int eiIn){
		if(siPre > eiPre) {
			return null;
		}
		int rootData=pre[siPre];
		BinaryTreeNode<Integer>root=new BinaryTreeNode<Integer>(rootData);
		int rootIndex=-1;
		for(int i=siIn;i<=eiIn;i++){
			if(in[i]==rootData){
				rootIndex=1;
				break;
			}
		}
		//Iam assuming that root actually is present in inorder
		int siPreLeft=siPre+1;
		int siInLeft=siIn;
		int eiInLeft=rootIndex-1;
		int siInRight=rootIndex+1;
		int eiPreRight=eiPre;
		int eiInRight=eiIn;

		int leftSubtreeLength=eiInLeft-siInLeft+1;
		int eiPreLeft = siPreLeft+leftSubtreeLength-1;
		int siPreRight=eiPreLeft+1;
		BinaryTreeNode<Integer>left=buildTreeFromPreInHelper(pre,in,siPreLeft,eiPreLeft,siInLeft,eiInLeft);
		BinaryTreeNode<Integer>right=buildTreeFromPreInHelper(pre,in,siPreRight,eiPreRight,siInRight,eiInRight);
		root.left =left;
		root.right=right;
		return root;
	}


	public static BinaryTreeNode<Integer> buildTreePostorderInorder(int[] postorder , int[] inorder) {
		return builtTreeNew(postorder, 0,postorder.length-1, inorder, 0, inorder.length-1);
		// upVote if you like
		// psi-preOrder starting index; pei- preOrder ending index
		// isi-inOrder starting index ; iei-inOrder ending index
	}
	public static BinaryTreeNode<Integer> builtTreeNew(int [] postorder, int psi, int pei, int [] inorder, int isi, int iei)
	{
		if(psi>pei)
		{
			return null;
		}
		int data =postorder[pei];
		int idx = isi;
		while(inorder[idx]!=data){
			idx++;
		}
		// now finding the total remaining elements
		int trel = idx - isi;
		BinaryTreeNode<Integer> node = new BinaryTreeNode<Integer>(data); 
		//dry run to get the logic for the equation
		node.right= builtTreeNew(postorder, psi+trel,pei-1, inorder, idx+1, iei);
		node.left= builtTreeNew(postorder, psi,psi+trel-1, inorder, isi, idx-1);     
		return node; 
	}




	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if (root==null)
			return;

		BinaryTreeNode<Integer> duplicateNode = new BinaryTreeNode<Integer>(root.data);
		//duplicateNode.data=root.data;
		BinaryTreeNode<Integer> temp=root.left;
		root.left=duplicateNode;
		duplicateNode.left=temp;
		insertDuplicateNode(root.left.left);
		insertDuplicateNode(root.right);
	}



	public static Pair<Integer,Integer>getMinAndMax(BinaryTreeNode<Integer>root){
		if(root == null){
			return new Pair<>(Integer.MAX_VALUE,Integer.MIN_VALUE);
		}
		Pair<Integer,Integer>leftPair=getMinAndMax(root.left);
		Pair<Integer,Integer>rightPair=getMinAndMax(root.right);
		int minimum=Math.min(root.data,Math.min(leftPair.minimum,rightPair.minimum));
		int maximum=Math.max(root.data,Math.max(leftPair.maximum,rightPair.maximum));
		return new Pair<>(minimum,maximum);
	}



	public static void printLevelOrderTraversal(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if (root==null)
			return;

		Queue<BinaryTreeNode<Integer>> nodesToPrint = new LinkedList<BinaryTreeNode<Integer>>();
		nodesToPrint.add(root);
		nodesToPrint.add(null);
		while(!nodesToPrint.isEmpty())
		{
			BinaryTreeNode<Integer> front=nodesToPrint.poll();
			if (front==null)
			{
				if (nodesToPrint.isEmpty())
					break;
				else
				{
					System.out.println();
					nodesToPrint.add(null);
				}

			}
			else
			{
				System.out.print(front.data+" ");
				if (front.left!=null)
					nodesToPrint.add(front.left);
				if (front.right!=null)
					nodesToPrint.add(front.right);
			}
		}
	}




	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		//Your code goes here
		String arr="";
		rootToLeafPathsSumToK(root,k,arr);
	}

	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k,String arr)
	{
		if (root==null)
		{
			return;
		}

		int rootData=root.data;
		//System.out.println("Root data: "+rootData);
		//System.out.println("k: "+k);
		//System.out.println("Old Arraylist: "+arr);
		arr=arr+rootData+" ";
		if(k==rootData && root.left==null && root.right==null)
		{
			//System.out.print("Path found: ");
			//for (int i=0;i<arr.length();i++)
			//System.out.print(arr.charAt(i)+" ");
			//System.out.println();
			System.out.println(arr);
			return;
		}
		//System.out.println();

		rootToLeafPathsSumToK(root.left,k-rootData,arr);
		rootToLeafPathsSumToK(root.right,k-rootData,arr);
	}





	public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
		if (root==null){
			return false;
		}
		int rootData=root.data;
		if (k<rootData){
			return searchInBST(root.left,k);
		}
		else if(k>rootData){
			return searchInBST(root.right,k);
		}
		else{
			return true;
		}
	}




	public static void printBetweenK1K2(BinaryTreeNode<Integer>root,int k1,int k2){
		if(root==null){
			return;
		}
		if(root.data<1){
			printBetweenK1K2(root.right,k1,k2);
		}else if(root.data>k2){
			printBetweenK1K2(root.left,k1,k2);
		}else
			System.out.println(root.data);
		printBetweenK1K2(root.left,k1,k2);
		printBetweenK1K2(root.right,k1,k2);
	}

	//above solution give some sort of sequencing problems     
	private static ArrayList<Integer> arr = new ArrayList<Integer>();

	public static void elementsInRangeK1K2(BinaryTreeNode<Integer> root,int k1,int k2)
	{
		elementsInRangeK1K2Helper(root,k1,k2);
		Collections.sort(arr);
		for (int i:arr)
			System.out.print(i+" ");
	}
	public static void elementsInRangeK1K2Helper(BinaryTreeNode<Integer> root,int k1,int k2){

		//Base case - if root=null
		if (root==null)
			return;

		int rootData=root.data;
		if (rootData<k1)
		{
			elementsInRangeK1K2Helper(root.right,k1,k2);
		}
		else if (rootData>k2)
		{
			elementsInRangeK1K2Helper(root.left,k1,k2);
		}
		else
		{
			//System.out.print(rootData+" ");
			arr.add(rootData);
			elementsInRangeK1K2Helper(root.right,k1,k2);
			elementsInRangeK1K2Helper(root.left,k1,k2);
		}

	}




	public static BinaryTreeNode<Integer> SortedArrayToBSTHelper(int[] arr, int si, int ei){
		if (si>ei)
			return null;

		int mid=(si+ei)/2;
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(arr[mid]);

		root.left=SortedArrayToBSTHelper(arr,si,mid-1);
		root.right=SortedArrayToBSTHelper(arr,mid+1,ei);
		return root;

	}



	public static int maximum(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return -1;
		}
		int maximumLeft = maximum (root. left);
		int maximumRight = maximum (root.right);
		return Math.max (root.data, Math.max (maximumLeft, maximumRight));
	}
	public static int minimum(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return Integer.MAX_VALUE;
		}int leftMin =  minimum(root.left);
		int rightMin= minimum(root.right);
		return Math.min(root.data , Math.min(leftMin, rightMin));
	}

	public static boolean	isBST(BinaryTreeNode<Integer>root) {
		if(root == null){
			return true;
		}
		int leftMax =maximum(root.left);
		if(leftMax>=root.data){
			return false;
		}
		int rightMin =minimum(root.right);
		if(rightMin<root.data) {
			return false;
		}

		boolean isLeftBST=isBST(root.left);
		boolean	isRightBST=isBST(root.right);
		return isLeftBST && isRightBST;
	}



	public static IsBSTReturn isBST1(BinaryTreeNode<Integer> root) {
		if(root==null) {
			IsBSTReturn ans = new IsBSTReturn(Integer.MAX_VALUE, Integer.MIN_VALUE, true);
			return ans;
		}
		IsBSTReturn leftans=isBST1(root.left);
		IsBSTReturn rightans=isBST1(root.right);

		int min=Math.min(root.data,Math.min(leftans.min,rightans.min));
		int max=Math.max(root.data,Math.max(leftans.max,rightans.max));
		boolean isBST=true;
		if(leftans.max>=root.data) {
			isBST= false;
		}
		if(rightans.min<root.data){
			isBST=false;
		}
		if(leftans.isBST){
			isBST=false;
		}
		if(!rightans.isBST){
			isBST=false;
		}
		IsBSTReturn ans = new IsBSTReturn(min , max, isBST);
		return ans;
	}

	public static boolean isBST2(BinaryTreeNode<Integer>root,int minRange,int maxRange) {
		if(root==null){
			return true;
		}
		if(root.data<minRange || root.data>maxRange) {
			return false;
		}
		boolean isLeftWithinRange=isBST2(root.left,minRange,root.data-1);
		boolean isRightWithinRange =isBST2(root.right,root.data,maxRange);
		return isLeftWithinRange && isRightWithinRange;

	}





	//	public static LinkedList<Integer> constructLinkedList(BinaryTreeNode<Integer>root){
	//		return constructLinkedListHelper(root).head;
	//	}
	//	private static PairOfNodeElem constructLinkedListHelper(BinaryTreeNode<Integer>root){
	//		if(root == null){
	//			PairOfNodeElem pair=new PairOfNodeElem();
	//			return pair;
	//		}
	//		LinkedList<Integer>newNode= new LinkedList<Integer>();
	//		newNode=root.data;
	//		PairOfNodeElem leftList=constructLinkedListHelper(root.left);
	//		PairOfNodeElem rightList=constructLinkedListHelper(root.right);
	//		PairOfNodeElem pair=new PairOfNodeElem();
	//		if(leftList.tail!=null){
	//			leftList.tail.next=newNode;
	//		}
	//		newNode.next=rightList.head;
	//		if(leftList.head!=null){
	//			pair.head=leftList.head;
	//		}else{
	//			pair.head=newNode;
	//		}
	//		if(rightList.tail!=null){
	//			pair.tail=rightList.tail;
	//		}else{
	//			pair.tail=newNode;
	//		}
	//		return pair;
	//	}





	public static int getLCA(BinaryTreeNode<Integer> root, int n1, int n2) {
		if (root == null) 
			return -1; 

		// If both n1 and n2 are smaller than root, then LCA lies in left 
		if (root.data > n1 && root.data > n2) 
			return getLCA(root.left, n1, n2); 

		// If both n1 and n2 are greater than root, then LCA lies in right 
		if (root.data < n1 && root.data < n2)  
			return getLCA(root.right, n1, n2); 

		return root.data; 


	}




	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
		// Write your code here
		replaceWithLargerNodesSum(root,0);
	}

	public static int replaceWithLargerNodesSum(BinaryTreeNode<Integer> root, int sum)
	{
		//Base Case
		if(root == null)
			return sum;

		//Recursive Case
		sum = replaceWithLargerNodesSum(root.right,sum);
		sum += root.data;
		root.data = sum;
		return replaceWithLargerNodesSum(root.left,sum);
	}










	//in general tree
	public static ArrayList<Integer>nodeToRootPath(BinaryTreeNode<Integer>root,int x){
		if(root==null){
			return null;
		}
		if(root.data ==x){
			ArrayList<Integer>output=new ArrayList<Integer>();
			output.add(root.data);
			return output;
		}
		ArrayList<Integer>leftOutput=nodeToRootPath(root.left,x);
		if(leftOutput!=null){
			leftOutput.add(root.data);
			return leftOutput;
		}
		ArrayList<Integer>rightOutput=nodeToRootPath(root.right,x);
		if(rightOutput!=null){
			rightOutput.add(root.data);
			return rightOutput;
		}
		return null;

	}

	//in BST
	public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
		if (root==null) {
			return null;
		}
		ArrayList<Integer> output;
		if (root.data==data){
			output= new ArrayList<Integer>();
			output.add(root.data);
			return output;
		}
		if (data<root.data){
			output = getPath(root.left,data);
			if (output != null){
				output.add(root.data);
			}
			return output;
		}
		if (data>root.data){
			output = getPath(root.right,data);
			if (output != null){
				output.add(root.data);
			}
			return output;
		}
		return null;
	}







	// you have to return the arraylist made of linkedlist each element of arraylist should contained the 
	// Reference of heaad of linked list which should contained the whole leval of that tree at that level

	private static ArrayList<LinkedListNode<Integer>> arr1 = new ArrayList<LinkedListNode<Integer>>();
	public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
		if (root==null)
			return null;
		Queue<BinaryTreeNode<Integer>> nodesToPrint = new LinkedList<BinaryTreeNode<Integer>>();
		nodesToPrint.add(root);
		nodesToPrint.add(null);
		LinkedListNode<Integer> head = null,tail=null;
		//arr.add(head);
		while(!nodesToPrint.isEmpty()){
			BinaryTreeNode<Integer> front=nodesToPrint.poll();
			if (front==null){
				if (nodesToPrint.isEmpty()) {
					break;
				}else{
					//System.out.println();
					nodesToPrint.add(null);
					tail.next=null;
					tail=tail.next;
					head=null;
				}
			}else{
				if (head==null){
					head = new LinkedListNode<Integer>(front.data);
					tail=head;
					arr1.add(head);
				}else{
					tail.next=new LinkedListNode<Integer>(front.data);
					tail=tail.next;
				}
				//System.out.print(front.data+" ");
				if (front.left!=null)
					nodesToPrint.add(front.left);
				if (front.right!=null)
					nodesToPrint.add(front.right);
			}
		}
		return arr1;
	}








	public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
		if (root==null) {
			return 0;
		}if (isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE)) {
			return findHeight(root);
		}else{
			return Math.max(largestBSTSubtree(root.left),largestBSTSubtree(root.right));
		}
	}  
	private static int findHeight(BinaryTreeNode<Integer> root){
		if (root==null) {
			return 0;
		}if (root.left==null && root.right==null) {
			return 1;
		}return Math.max(findHeight(root.left),findHeight(root.right))+1;
	}
	private static boolean isBST(BinaryTreeNode<Integer> root, int min, int max){
		if(root == null){
			return true;
		}if(root.data < min || root.data > max) {
			return false;
		}else {
			return isBST(root.left,min,root.data -1) && isBST(root.right,root.data +1,max);
		}
	}



	
	
	
	
	
	
	public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
		// Write your code here
        if (root==null) {
            return;
        }else{
            ArrayList<Integer> arr = convertToArray(root);
        	Collections.sort(arr);
            //for (int i=0;i<arr.size();i++)
            //{
            //    System.out.print (arr.get(i)+" ");
            //}
            //System.out.println();
        	printPairSum(arr,s);
        }
     }
	//using bellow  function we convert the BT into the Array
	// and then we find the pairs by adding and comparing this is to lower the time complexity 
    private static ArrayList<Integer> convertToArray(BinaryTreeNode<Integer> root){
        if (root==null){
            ArrayList<Integer> arr = new ArrayList<Integer>();
            return arr;
        }
        ArrayList<Integer> currArr = new ArrayList<Integer>();
        ArrayList<Integer> leftArr = convertToArray(root.left);
        if (!leftArr.isEmpty()){
            currArr.addAll(leftArr);
        }
        currArr.add(root.data);
        ArrayList<Integer> rightArr = convertToArray(root.right);
        if (!rightArr.isEmpty()){
            currArr.addAll(rightArr);
        }
        return currArr;
    }
    private static void printPairSum(ArrayList<Integer> arr, int s){
        int i=0,j=arr.size()-1;
        while(i<j){
            int val1=arr.get(i);
            int val2=arr.get(j);
            if (val1+val2>s){
                j=j-1;
            }
            else if(val1+val2<s){
                i=i+1;
            }else{
                System.out.println(val1+" "+val2);
                i=i+1;
                j=j-1;
            }   
        }
    }
	
	
	




	public static void main(String[] args) {
		//		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
		//		BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
		//		BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);
		//		root.left = rootLeft;
		//		root.right = rootRight;
		//		BinaryTreeNode<Integer>twoRight = new BinaryTreeNode<Integer>(4);
		//		BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<Integer>(5);
		//		rootLeft.right = twoRight;
		//		rootRight. left = threeLeft;
		//		 printTreeDetailed(root);
		//		System.out.println("print at depth k");

		BinaryTreeNode<Integer> root = takeInputLvelWise();

		printNodesWithoutSibling(root);


		//		printAtDepthK(root, 1);
		//		BinaryTreeNode<Integer>newRoot=removeLeaf(root);
		printTreeDetailed(root);
		//		System.out.println("is Balanced"+ isBAlenced(root)); 

	}

}
