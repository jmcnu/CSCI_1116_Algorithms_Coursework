package chapter24_5;

public class Exercise24_5 {

	public static void main(String[] args) {
		 GenericQueue<String> queue = new GenericQueue<>();
		 
		 queue.enqueue("John"); 
		 System.out.println("(7) " + queue);
		 
		 queue.enqueue("Rakelle"); 
		 System.out.println("(8) " + queue);
		 
		 queue.enqueue("Sam"); 
		 queue.enqueue("Jan"); 
		 System.out.println("(9) " + queue);
		 
		 System.out.println("(10) " + queue.dequeue());
		 System.out.println("(11) " + queue.dequeue());
		 System.out.println("(12) " + queue);
	}

}
