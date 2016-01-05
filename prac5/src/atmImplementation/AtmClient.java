package atmImplementation;
public class AtmClient {

	public static void main(String[] args) {
		BankAccount myBankAccount=new BankAccount(123,5678,1200);
		
		ATM atm=new ATM(2000);
		
		ATMCard myATM=new ATMCard(5678,1234);
		CardScanner cardScanner=atm.getCardScanner();
		Display display=atm.getDisplay();
		Keyboard keyboard=atm.getKeyboard();
		//customer inserts atm card into card reader
		if(cardScanner.insertCard(myATM)){	
				display.enterPin();
				if(cardScanner.checkPin(keyboard.getPin())){
					atm.coondb(myBankAccount,myATM);	
				}else
					display.reject();
			}	
		
	}
}
