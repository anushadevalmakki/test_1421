package Car1421;

public class SubSystemBrakes {
	
	private PowerSteeringPumps powerSteeringPumps;
	
	public SubSystemBrakes(){
		powerSteeringPumps=new PowerSteeringPumps();
	}
	public int getTotalPrice(){
		int total = powerSteeringPumps.getPrice();
		return total;
	}
	
}
