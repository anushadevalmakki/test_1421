package Queue;

public class QueueClient {

	public static void main(String[] args) {
		System.out.println("****Queue Implementation****");
		
		System.out.println("\n****using arrays****");
		ArrayListQueue arrayQueue=new  ArrayListQueue();
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
		arrayQueue.display();
		System.out.println("\n****using arraylist****");
		ArrayQueue arrayQueue1=new  ArrayQueue();
		arrayQueue1.enquee(1);
		arrayQueue1.display();
		arrayQueue1.enquee(13);
		arrayQueue1.display();
		arrayQueue1.enquee(16);
		arrayQueue1.display();
		arrayQueue1.dequee();
		arrayQueue1.display();
		arrayQueue1.dequee();
		arrayQueue1.display();
		arrayQueue1.dequee();
		arrayQueue1.display();
	//	ArrayQueue arrayList=new ArrayListQueue();
		
	}
	

}
