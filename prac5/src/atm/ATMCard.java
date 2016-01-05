package atm;

public class ATMCard {
	int atmNo,pin;
	public ATMCard(int atmNo, int pin) {
		this.atmNo=atmNo;
		this.pin=pin;
	}
	public int getPin()
    {
        return pin;
    }
	public int getCardno(){
		return atmNo;
	}

}
