package atmImplementation;

public class Display {
	public void enterPin(){
		System.out.println("Enter the pin no\t:\t****");
	}
	public void succes() {	
		System.out.println("\n****SUCCESFULL****");
	}
	public void diffBank() {
		System.out.println("\nATM card belongs to different bank");
	}
	public void option(){
		System.out.println("\n1.WITHDRAW\t2.INQUIRY");
	}
	public void withdrawMessage() {
			System.out.print("\nEnter the money\t:");	
	}
	public void showmoney(int amount2) {
		System.out.println(amount2);	
	}
	public void atmBalanceLow() {
		System.out.print("\nUnsufficient amount on ATM MACHINE");
	}
	public void reject() {
		System.out.println("\n****CARD REJECTED****");
	}
	public void eject() {
		System.out.println("\nCARD Ejected");	
	}

}
