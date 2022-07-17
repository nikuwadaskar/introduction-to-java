package PriorityQueues1;

public class PriorityQueuesException extends Exception {

	 public static void main(String[] args) throws PriorityQueuesException {
		
	
	Priority_Queues<String> p = new Priority_Queues<>();
	p.insert("abc", 23);
	p.insert("aerbc", 3);
	p.insert("aerbc", 12);
	p.insert("adsbc", 32);
	p.insert("acvxbc", 6);
	p.insert("aewbc", 16);
	
	while(!p.isEmpty()) {
		System.out.println(p.getMin());
		p.removeMin();
	}
	
	}
	
}
