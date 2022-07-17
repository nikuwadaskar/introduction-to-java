package LinkedList1;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;


class DoubleNote{
	Node<Integer> head;
	Node<Integer> tail;
   void	DoubleNode(){
		
	}
	void DoubleNode(Node<Integer> head,Node<Integer>tail){
		this.head=head;
		this.tail=tail;
	}
}

public class LinkedListuse {

	//	public static Node<Integer> createLinkedList() {
	//		Node<Integer> n1;// This is reference 
	//		n1= new Node <>(10);// this is node.
	//		Node<Integer> n2= new Node <>(20);
	//		Node<Integer> n3= new Node <>(30);
	//		Node<Integer> n4= new Node <>(40);
	//		n1.next=n2;
	//		//		System.out.println("n1"+n1+"data"+n1.data+"next"+n1.next);
	//		n2.next=n3;
	//		//		System.out.println("n2"+n2+"data"+n2.data+"next"+n2.next);
	//		n3.next=n4;
	//		//		System.out.println("n3"+n3+"data"+n3.data+"next"+n3.next);
	//		//		System.out.println("n4"+n4+"data"+n4.data+"next"+n4.next);
	//		return n1;
	//	}

	public static void print (Node <Integer> head ) {
		//		System.out.println("print"+head);
		Node<Integer>temp=head;

		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}System.out.println();
		temp =head;
		//		while(temp!=null) {
		//		System.out.println(temp.data);
		//		temp = temp.next;
		//		}System.out.println();
		//
		//
		//		System.out.println(head.data);
		//		System.out.println(head.next);
		//		System.out.println(head.next.data);
		//		System.out.println(head.next.next.data);
	}

	
	
	public static void Increment(Node<Integer>head) {
		Node<Integer>temp=head;
		int count=0;
		while(temp!=null) {
			temp.data++;
			count++;
			if (count ==3) {
				//       System.out.println(temp.data);
			}
			temp = temp.next;
		}//System.out.println(count);
	}

	
	
	public static Node<Integer> takingInput(){
		Scanner s = new Scanner (System.in);
		int data = s.nextInt();
		Node <Integer> head=null, tail =null;
		while (data!=-1) {
			Node<Integer> currentNode= new Node <Integer>(data);
			if (head ==null) {
				//make this bode  as head node.
				head= currentNode;
				tail = currentNode;
			}else {
				//Node <Integer> tail = head;
				//while (tail.next!=null) {
				//tail=tail.next;
				//}
				//now tail will refer to last node
				//connect current node after last node
				tail.next=currentNode;
				tail= currentNode;//tail = tail.next;
			}
			data=s.nextInt();
		}return head;
	}

	
	private static int length (Node<Integer> head) {
		int len=0;
		while (head!=null) {
			len++;
			head=head.next;
		}return len;
	}
	private static Node<Integer> reverseIteratively(Node<Integer>head){
		if (head==null) {
			return null;
		}
		Node<Integer> prev=null;
		Node<Integer>curr=head;
		Node<Integer>currnext=curr.next;

		while(curr!=null&&currnext!=null) {
			curr.next=prev;
			prev=curr;
			curr=currnext;
			currnext=currnext.next;
		}if(curr!=null) {
			curr.next=prev;
			prev=curr;
		}
		return prev;
	}



	private static Node<Integer> makeLLOfSize(int n  ){
		int nc=0;
		Node<Integer> head=null;
		Node<Integer> tail=null;

		while (nc<n) {
			Node<Integer> newNode=new Node<>(0);

			if (head==null) {
				head=newNode;
				tail=newNode;

			}else {
				tail.next=newNode;
				tail=newNode;
			}
			nc++;
		}
		return head;
	}


	private static Node<Integer>addfirst(Node<Integer>head){
		Node<Integer>newNode=new Node<>(0);
		if(head==null) {
			head=newNode;
		}else {
			newNode.next=head;
			head=newNode;
		}return head;
	}

	public static void multiply (Node<Integer>head1,Node<Integer>head2) {
		head1=reverseIteratively(head1);
		head2=reverseIteratively(head2);

		int len1=length(head1);
		int len2=length(head2);
		Node <Integer> first=head1;
		Node<Integer> second =head2;
		int carry=0;
		Node<Integer>res1=makeLLOfSize(len1+len2+1);

		while (second!=null) {
			Node<Integer> res2=makeLLOfSize(len1+len2+1);
			first =head1;
			Node <Integer> temp2=res2;
			Node <Integer> temp1=res1;
			carry=0;
			while (first !=null) {
				int ans =temp1.data+carry+second.data*first.data;
				temp2.data=ans%10;
				carry=ans/10;
				temp2=temp2.next;
				temp1=temp1.next;
				first=first.next;
			}
			if (carry!=0) {
				int ans =temp1.data+carry;
				temp2.data=ans;
			}
			res1=res2;
			head1=addfirst(head1);

			second=second.next;
		}
		res1=reverseIteratively(res1);

		printLL(res1);

	}

	private static void printLL(Node <Integer> head) {
		if (head==null) {
			return ;
		}
		//keep travesing untile first non-zero node is found
		while (head.data==0){
			head=head.next;
		}
		while(head!=null) {
			System.out.println(head.data+" ");
			head=head.next;
		}
		System.out.println();
	}
	
	public static Node <Integer> MoveToLast(Node <Integer> head , int n ){
		Node <Integer> temp = head ,prev = null, last =null;
		int len =1;
		while (temp.next!=null) {
			len++;
			temp=temp.next;
		}last =temp;
		temp =head;
		//intflag =0;
		for (int i=0; i<len ;i++) {
			if (temp.data==n) {
				//flag =0 ;
				if (prev ==null) {
					Node <Integer>temp2= new Node<Integer>(temp.data);
						head =head.next;
						last.next=temp2;
						prev=null;
						temp=head;
						
					}else { Node <Integer>temp2 = new Node <Integer>(temp.data);
					prev.next=temp.next;
					last.next=temp2;
					temp=temp.next;
				}
				last =last.next;
			}
			else {
				prev=temp;
				temp=temp.next;
			}
			
		}
		return head;
	}
	
	
	public static boolean isPalindrome(Node<Integer> head) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while (head != null) {
			arr.add(head.data);
			head = head.next;
		}

		if (arr.size() < 2) return true;

		int i=0;
		int j = arr.size()-1;

		while (true) {

			if (arr.get(i).equals(arr.get(j)) == false) return false;

			if (arr.size()%2 == 0 && j - i == 1) break;
			if (arr.size()%2 != 0 && j - i == 2) break;

			i++;
			j--;
		}
		return true;
	}


	
	public static int findNode(Node<Integer> head, int n) {
		Node<Integer>temp=head;
		int count=0;
		while(temp!=null) {

			count++;
			if (temp.data ==n) {
//				System.out.println(count);
				return count-1;
			}
			temp = temp.next;
		}return -1;//System.out.println(count);
	}	

	
	
	public static int findNodeRec(Node<Integer> head, int n) {
		int k=0;
    	if (head==null) {
    		return -1;
    	}
    	if ((head.data).equals(n)) {
    		return 0;
    	}
    	k = findNodeRec(head.next,n);
    	if (k==-1) {
    		return -1;
    	}
    	return k+1;
	}
	
	

	public static Node<Integer> removeDuplicates(Node<Integer> head)

	{
		if(head==null||head.next==null) {
			return head;
		}
		Node<Integer>temp=head,temp1=head.next;
		Node<Integer>finalhead=head;
		while(temp1!=null){
			if(temp.data.equals(temp1.data))
			{
				temp1=temp1.next; 
			}
			else{
				temp.next=temp1;
				temp=temp1;
			}
		}
		temp.next=null;
		return finalhead;
	}
	
	
	
	public static Node<Integer> appendLastNToFirst(Node<Integer> root, int n) {
		//ye sabse interesting function hai 
		Node<Integer> temp=root;
		if (n==0||root==null){
			return root;}
		int count=0;
		while(temp!=null ){
			temp=temp.next;
			count++;
		}
		int newcount=count-n;
		count=0;
		Node<Integer> temp1=root;
		while(count<newcount-1){
			temp1=temp1.next;
			count++;
		}
		Node<Integer> temp2=temp1.next;
		Node<Integer> temp3=temp1.next;
		while(temp2.next!=null){
			temp2=temp2.next;
		}
		temp2.next=root;
		temp1.next=null;
		return temp3;
	}

	
	public static void creatLL( ){
		Node<Integer>temp=null;
		int n =12345;
		while (n<=0) {
			temp.data=n%10;
			n=n/10;
			temp=temp.next;
			System.out.println(n);
		}
		print(temp);
	}
	 

	public static Node<Integer> func(Node<Integer> head,int n) {
		ArrayList<Integer> arr = new ArrayList<>();
		Node<Integer> head2=null;
		int j=0,count=0;
		while (head!=null) {
			arr.add(head.data);
			j++;
			head=head.next;
		}for(int i = 0;i<arr.size();i++) {
			if (arr.get(i).equals(n)) {
				arr.remove(i);
				count++;
			}
		}while (count<0) {
			arr.add(n);
		}while(arr.size()<0) {
			int k=0;
			head2.data=arr.remove(k);
			k++;
			head2=head2.next;
		}
		return head2;
	}
	
	
	public static Node<Integer>insertRecursive(Node<Integer> head, int data, int pos){
		if (head==null&&pos>0) {
			return head;
		}
		if (pos ==0) {
			Node<Integer> newNode = new Node <>(data);
			newNode.next=head;
			return newNode;
		}else {
			head.next=insertRecursive(head.next,data,pos-1);
			return head;
		}
	}


	
	public static Node<Integer> insert(Node<Integer> head, int pos, int data){

		
		Node<Integer> nOdeinsert= new Node <>(data);
		int count=0;
		if (pos==0) {
			nOdeinsert.next=head;
			return nOdeinsert;
		}else {
			Node<Integer>prev=head;
			while (count<pos-1&& prev!=null) {
				count ++;
				prev = prev.next;
			}if(prev!=null) {
				nOdeinsert.next=prev.next;
				prev.next=nOdeinsert;
			}
		}return(head);
	}
	
	
	
	public static Node<Integer> deleteNodeRecursive(Node<Integer> head, int data, int pos){
		if (head==null){
			return head;
		}
		if (pos ==0) {
			return head.next;
		}else {
			head.next=insertRecursive(head.next,data,pos-1);
			return head;
		}
	}
	
	
	
	public static Node<Integer> deleteNode(Node<Integer> head, int pos) {
		int count=0;
		Node<Integer>prev=head;
		if(head==null )
		{return head;}
		if (pos==0) {
			head = head.next;
			return head;
		}else {
			while (count<pos-1&& prev!=null) {
				count ++;
				prev = prev.next;
			}if(prev!=null) {
				prev.next=prev.next.next;
			}
		}return(head);
	} 
	
	
	
	public static void printReverse(Node<Integer> head) {
		if (head==null) {
			return;
		}printReverse(head.next);
		System.out.println(head.data);
	}
	
	
	
	public static Node<Integer> reverseLinkedListRecbest(Node<Integer> head) {
		if(head==null)
			return head;
		if(head.next==null)
			return head;
		
		Node<Integer> smallhead=reverseLinkedListRec(head.next);
		Node<Integer> tail=head.next;
		tail.next=head;
		head.next=null;
		return smallhead;

	}
	
	
	
	public static Node<Integer> reverseLinkedListRec(Node<Integer> head) {
		if (head==null||head.next==null) {
			return head;
		}Node<Integer> smallhead=reverseLinkedListRec(head.next);
		Node<Integer> tail=smallhead;
		while(tail.next!=null) {
			tail=tail.next;
		}
		tail.next=head;
		head.next=null;
		return smallhead;
	}

	
	
	
	public static DoubleNote reverseBetter(Node <Integer> head) {
		DoubleNote ans ;
		if (head==null||head.next == null) {
			ans = new DoubleNote();
			ans.head=head;
			ans.tail=head;
			return ans;
		}
		//this double node both head ans tail of reverse LL. 
		DoubleNote smallans= reverseBetter(head.next);
		smallans.tail.next=head;
		head.next=null;
		ans = new DoubleNote();
		ans.head= smallans.head;
		ans.tail=head;
		return ans;
	} 
	
	
	
	public static Node<Integer> mergeSort(Node<Integer> head) {
		if (head.next==null) {
			return head;
		}
		Node<Integer> midhead= midPoint(head);
		Node<Integer> part1Head=head;
		Node<Integer> paert2Head=midhead.next;
		Node<Integer>head1 =  mergeSort(part1Head),head2 =mergeSort(paert2Head);
		Node<Integer> Headf=head;
	return Headf= mergeTwoSortedLinkedLists(head1,head2);
	}
	
	
	
	public static Node<Integer> midPoint(Node<Integer> head) {
        if (head==null){
            return head;
        }
        Node<Integer> slow=head,fast=head;
	        while(fast.next!=null && fast.next.next!=null)
	        {
	            slow=slow.next;
	            fast=fast.next.next;
	        }
	       return slow;
	    }

	
	
	
	 public static Node<Integer> mergeTwoSortedLinkedLists(Node<Integer> head1, Node<Integer> head2) {
		 if(head1==null)
	            return head2;
	        if(head2==null)
	            return head1;
	        Node<Integer> temp=head1,temp2=head2,tail=null,head=null;
	        if(temp.data<=temp2.data){
	            head=temp;
	            tail=temp;
	            temp=temp.next;}
	        else {
	            head=temp2;
	            tail=temp2;
	            temp2=temp2.next;}
	        while(temp!=null &&temp2!=null){
	            if(temp.data<=temp2.data){
	                tail.next=temp;
	                tail=temp;
	                temp=temp.next;}
	            else{
	                tail.next=temp2;
	                tail=tail.next;
	                temp2=temp2.next;}
	        }
	        if(temp==null)
	            tail.next=temp2;
	        if(temp2==null)
	            tail.next=temp;
	        return head;
	        }

	 
	
	 
	 public static Node<Integer> evenAfterOdd(Node<Integer> head) {
		 Node <Integer> evenHead=null,evenTail=null,oddHead=null,oddTail=null;
		while (head!=null) {
			if (head.data%2==0) {
				if(evenHead==null&&evenTail==null) {
					evenHead=head;
					evenTail=head;
				}
				else{
					evenTail.next=head;
					evenTail=head;
					
				}
			}else {
				if (oddHead==null && oddTail==null){
					oddHead=head;
					oddTail=head;
					
				}else{
					oddTail.next=head;
					oddTail=head;
					
				}
				head=head.next;
			}
			
			}if(oddHead!=null) {
				oddTail.next=evenHead;
		}else {
			return evenHead;
		}if(evenHead!=null) {
			evenTail.next=null;
		}return oddHead;
		}
	 
	 
	 
	 public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {
		 if(head==null)
	            return head;
	        if(M==0)
	            return null;
	        if(N==0)
	            return head;
		 	Node <Integer> temp=head,temp1;
		 	int count =0;
		  while (temp!=null) {
			 
			 for(count =1;count <M &&temp!=null;count++) {
				 temp=temp.next;
			 }
			  if (temp==null) {
				  return head;
			  }
			  temp1=temp.next;
			  for(count =1;count<=N&& temp1!=null;count++) {
				  temp1=temp1.next;
			  }
			   temp.next=temp1;
			  temp=temp1;
		  }return head;
	 }
	
	 
	
	 public static Node<Integer> swapNodes(Node<Integer> head, int i, int j) {
		 if(head==null)
			 return head;
		 Node <Integer> temp=head,prev=null,curr1=null,curr2=null,prev1=null,prev2=null;
		 int pos=0;
		 while (temp!=null) {
			 if(pos==i) {
				 prev1=prev;
				 curr1=temp;
				 }
			 else if (pos==j) {
				 prev2=prev;
				 curr2=temp;
			 }
			 prev=temp;
			 temp=temp.next;
			 pos++;

		 }if (prev1!=null) {
			 prev1.next=curr2;
		 }else {
			 head=curr2;
		 }if(prev2!=null) {
			 prev2.next=curr1;
		 }
		 Node <Integer>temp1=curr2.next;
		 curr2.next=curr1.next;
		 curr1.next=temp1;
		 return head;

	 }

	 
	 public static Node<Integer> kReverse(Node<Integer> head, int k) {
		 if (k==0||k==1){
	            return head;
	        }if(head==null||head.next==null){return head;}
		 Node <Integer> temp=head,Nhead=null,tail=head,N2head=null,N3head=null;
		 int count =1;
		for (count =1;count<k&&temp!=null;count++) {
			temp=temp.next;
		}
		Nhead=temp.next;
		temp.next=null;
		N2head= reverseLinkedListRecbest(head);
		N3head= reverseLinkedListRecbest(Nhead);
		tail.next=N3head;
		return N2head;

	 
	 }
	 
	 
	 public static Node<Integer> reverse(Node<Integer> head){
		 Node<Integer> current = head;
		 Node<Integer> prev=null;
		 while (current !=null) {
			 Node<Integer> temp=current.next;
			 current.next=prev;
			 prev =current;
			 current =temp;
		 }return prev;
	 }

	 
	 public static Node<Integer> nextLargeNumber(Node<Integer>head){
		 
		 head= reverse(head);
		 int carry=1,num;
		 Node<Integer> ptr =head, prev=null;
		 while (ptr!=null) {
			 num=((ptr.data)+carry)%10;
			 carry=((ptr.data)+carry)/10;
			 ptr.data=num;
			 prev=ptr;
			 ptr=ptr.next;
		 }if (carry==1) {
			 Node<Integer>tail=new Node<Integer>(carry);
			 prev.next=tail;
		 }return reverse(head);
		 
	 }
	 
	 
	 
	 public static Node<Integer>getprev(Node <Integer> head){
		 Node<Integer>curr=head;
		 Node<Integer>prev=null;
		 Node<Integer> fwd=null;
		 while(curr!=null) {
			 fwd=curr.next;
			 curr.next=prev;
			 prev=curr;
			 curr=fwd;
		 }
		 return prev;
	 }
	 
	 public static Node <Integer> sort (Node <Integer> head){
		 if (head==null|| head.next==null) {
			 return head;
		 }
		 Node <Integer>ascendingListhead=null;
		 Node <Integer>ascendingListTail=null;
		 Node <Integer>descendingListhead=null;
		 Node <Integer>descendingListail=null;
		 Node <Integer>temp=head;
		 ascendingListhead=temp;
		 ascendingListTail=temp;
		 temp=temp.next;
		 descendingListhead=temp;
		 descendingListail=temp;
		 
		 temp=temp.next;
		 while (temp!=null) {
			 ascendingListTail.next=temp;
			 ascendingListTail=ascendingListTail.next;
			 
			 temp=temp.next;
			 
			 if (temp!=null) {
				 descendingListail.next=temp;
				 descendingListail=descendingListail.next;
						 
						 temp=temp.next;
			 }
			 
		 }
		 ascendingListTail.next=null;
		 descendingListail.next=null;
		 
		 descendingListhead=getprev(descendingListhead);
		 return mergTwoList(ascendingListhead,descendingListhead);
			
		 }
	 public static Node<Integer>mergTwoList(Node <Integer> head1, Node<Integer>head2){
		 Node<Integer> head=null,tail=null;
		 if (head1.data<head2.data) {
			 head=head1;
			 tail=head1;
			 head1=head1.next;
		 }else if (head2.data<head1.data) {
			 head=head2;
			 tail=head2;
			 head2=head2.next;
		 }else {
			 head=head1;
			 tail=head1;
			 head1=head1.next;

			 tail.next=head2;
			 tail=tail.next;
			 head2=head2.next;
		 }while (head1!=null&& head2!=null) {
			 if (head1.data<head2.data) {
				 tail.next=head1;
				 tail=tail.next;
				 head1=head1.next;
			 }else if (head2.data<head1.data) {
				 tail.next=head2;
				 tail=tail.next;
				 head2=head2.next;
			 }else {
				 tail.next=head1;
				 tail=tail.next;
				 head1=head1.next;

				 tail.next=head2;
				 tail=tail.next;
				 head2=head2.next;
			 }
		 }if (head1!=null) {
			 tail.next=head1;
		 }if(head2!=null) {
			 tail.next=head2;
		 }return head;
	 }



	 public static void changeLL(Node<Integer> head) {
		 int max=0;
		 Node<Integer>temp=head;
		 while (temp!=null) {
			 if (temp.data>max) {
				 max=temp.data;
			 }
			 temp=temp.next;
		 }
		 boolean done []=new boolean [max+1];
		 for(int i=0;i<=max;i++) {
			 done [i]=false;
		 }
		 temp=head;
		 while (temp!=null) {
			 if(done [temp.data]) {
				 temp.data=max+1;
				 max++;
			 }else {
				 done [temp.data]=true;
			 }
			 temp=temp.next;
		 }

	 }


	 
public static void main(String[] args) {
		//		Node <Integer> head = createLinkedList();
		//		System.out.println(head);

//		Node <Integer> head = takingInput();
//		print (kReverse(head,3));
////	System.out.println(findNodeRec(head,3));	
//		print(reverseLinkedListRecbest(head));
//	DoubleNote ans=	reverseBetter(head);
//	print (ans.head);
//		midPoint(head);

		//	print(removeDuplicates(head));

		//	Increment(head);

		//	print(head);


//		Node<Integer> n1= new Node <>(10);
		//		System.out.println(n1.data);
		//		System.out.println(n1.next);
		//		System.out.println(n1);
	}

}
