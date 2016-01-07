package Car1421;

import car.BodySystem;
import car.Brakes;
import car.SteeringSystem;

public class SubSystemSteeringSystem {

	private BrakePadsFront brakePadsFront;
	
	SubSystemSteeringSystem(){
		brakePadsFront=new BrakePadsFront();
	}
	public int getTotalPrice(){
		int total = brakePadsFront.getPrice();
		return total;
	}
}
