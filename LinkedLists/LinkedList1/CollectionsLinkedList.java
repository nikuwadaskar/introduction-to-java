package LinkedList1;

import java.util.LinkedList;

public class CollectionsLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer>list = new LinkedList<>();//this will be doubly list

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(2, 120);
		list.addFirst(20);
		list.set(0, 60);
		list.indexOf(20);
		list.remove();//this will delete o th element
		System.out.println(list.indexOf(20));
		System.out.println(list.isEmpty());
		System.out.println(list.get(1));
		System.out.println(list.size());
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}

}
