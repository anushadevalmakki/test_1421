package Car1421;

public class Car {
	private SubSystemBrakes  brakes;
	private SubSystemSteeringSystem steeringSystem;
	public Car(){
		brakes=new SubSystemBrakes();
		steeringSystem=new SubSystemSteeringSystem();
	}
	
	public int getPrice() {
		int total= brakes.getTotalPrice()+steeringSystem.getTotalPrice();
		return total;
		
		
	}
	

}
