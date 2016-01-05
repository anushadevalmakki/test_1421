package QueueImplementation;
/*java program for queue implementation*/
public class QueueClient{
	public static void main(String[] args) {
		System.out.println("****Queue Implementation****");
		InterfaceQueue arrayQueue=new  ArrayListQueue();
		//InterfaceQueue arrayQueue=new  ArrayQueue();
		
		arrayQueue.enquee(1);
		arrayQueue.display();
		arrayQueue.enquee(13);
		arrayQueue.display();
		arrayQueue.enquee(16);
		System.out.println("\nsize-->\t"+arrayQueue.noOFelements());
		arrayQueue.display();
		arrayQueue.dequee();
		arrayQueue.display();
		arrayQueue.dequee();
		arrayQueue.display();
		arrayQueue.dequee();
		arrayQueue.display();
		
		
	}
}
/*
 * OUTPUT
 ****Queue Implementation****
[1]
[1, 13]

size-->	3
[1, 13, 16]

Dequee element is	:1
[13, 16]

Dequee element is	:13
[16]

Dequee element is	:16
[]
 

*/
