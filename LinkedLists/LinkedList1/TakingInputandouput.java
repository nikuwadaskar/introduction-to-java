package LinkedList1;

public class TakingInputandouput {

	public static Node<Integer> insert(Node<Integer> head, int data, int pos){
		Node<Integer> nOdeinsert= new Node <>(data);
		int count=0;

		if (pos==0) {
			head = nOdeinsert.next;
			nOdeinsert.next=head;
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

}

