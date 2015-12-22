package Queue;
import java.util.ArrayList;
public class ArrayListQueue {
	 private ArrayList queue = new ArrayList();
	 int rear=-1;
	 
	 
	 public ArrayListQueue() {
			this.rear=-1;
		}
	 public void enquee(int value) {
       queue.add(value);
       this.rear=this.rear+1;
    }
	  public void dequee() {
		 System.out.println("\nDequee element is\t:"+queue.get(0));
        queue.remove(0);
     }
	  public void display() {
        System.out.println(queue);
     }
	  public int noOFelements(){
		  return queue.size();
	  }
}
