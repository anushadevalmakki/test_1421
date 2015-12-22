package Queue;

public class QueueClient {

	public static void main(String[] args) {
		System.out.println("****Stacl Implementation****");
		ArrayQueue arrayQueue=new ArrayQueue(2);
		arrayQueue.enquee(1);
		arrayQueue.display();
		arrayQueue.enquee(13);
		arrayQueue.display();
		arrayQueue.enquee(16);
		arrayQueue.display();
		arrayQueue.dequee();
		arrayQueue.display();
		arrayQueue.dequee();
		arrayQueue.display();
		arrayQueue.dequee();
	
	}
	

}
