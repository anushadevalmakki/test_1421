package atmImplementation;

public class CardScanner {
	int atmpin;
	public boolean insertCard(ATMCard myATM) {	
		atmpin=myATM.getPin();
		return true;
	}
	
	public boolean checkPin( int checkpin) {
		if(atmpin==checkpin){
			return true;
		}
		return false;
	}
}
