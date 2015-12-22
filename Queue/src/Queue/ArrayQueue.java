package Queue;
public class ArrayQueue {
	int size;
	int head,tail;
	int queue[];
	public ArrayQueue() {
		this.size=7;
		this.head=this.tail=-1;
		this.queue=new int[size];
	}
	public void enquee(int value) {
		if(IsFull())
			System.out.println("\nThe queue is full");
		else
		{
			if(head==-1)
			{
				this.head=head+1;
				this.tail=tail+1;
				
			}else
			{
				this.tail=tail+1;
			}
			this.queue[tail]=value;
		}
	}
	private boolean IsFull() {
		if(tail==(size-1))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public void display() {
		int i;
		if(IsEmpty())
			System.out.println("\nThe queue is empty");
		else
		{
			System.out.print("\nThe queue are\t:");
			for(i=head;i<=tail;i++)
			System.out.print("  "+queue[i]);
			System.out.println("");
		}
		
	}
	public void dequee() {
		if(IsEmpty())
			System.out.println("\nThe queue is empty");
		else
		{
			
			System.out.println("Dequee element is\t" +queue[head]);
			this.head=head+1;
		}
		
	}
	private boolean IsEmpty() {
		if(head==size)
		{
			return true;
		}	
		else
			return false;
	}
	  public int noOFelements(){
		  return (tail-head);
	  }

}
