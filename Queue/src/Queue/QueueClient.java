package Queue;

public class QueueClient {

	public static void main(String[] args) {
		System.out.println("****Stacl Implementation using arrays****");
		//ArrayQueue arrayQueue=new ArrayQueue();
		ArrayListQueue arrayQueue=new ArrayListQueue();
		arrayQueue.enquee(1);
		arrayQueue.display();
		arrayQueue.enquee(13);
		arrayQueue.display();
		arrayQueue.enquee(16);
		System.out.println("\nsize of elements--> \t:"+arrayQueue.noOFelements());
		arrayQueue.display();
		arrayQueue.dequee();
		arrayQueue.display();
		arrayQueue.dequee();
		arrayQueue.display();
		arrayQueue.dequee();
		arrayQueue.display();
	//	ArrayQueue arrayList=new ArrayListQueue();
		
	}
	

}
