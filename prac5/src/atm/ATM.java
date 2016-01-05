package atm;

public class ATM {
	int balance;
	private CashDispenser cashDispenser;
	private CardScanner cardScanner;
	private Display display;
	private Keyboard keyboard;
	private ReceiptPrinter receiptPrinter;
	public ATM(int balance) {
		this.balance=balance;
		this.cashDispenser=new CashDispenser(balance);
		this.cardScanner=new CardScanner();
		this.display=new Display();
		this.keyboard=new Keyboard();
		this.receiptPrinter=new ReceiptPrinter();
	}
	public CardScanner getCardScanner() {
		return cardScanner;
	}
	public Display getDisplay() {
		return display;
	}
	public Keyboard getKeyboard() {
		return keyboard;
	}
	public void coondb(BankAccount myBankAccount, ATMCard myATM) {
		if(myATM.getCardno()==myBankAccount.getAtmCardno()){
			display.succes();
			display.option();
			display.withdrawMessage();
			int amount=keyboard.getAmount();
			display.showmoney(amount);
			if(cashDispenser.supplyCash(amount))
			{
				Boolean k=myBankAccount.withdrwal(amount);
				if(k){
					 cashDispenser.setInitialCash(amount);
					 receiptPrinter.generateCash();
					 receiptPrinter.balance(myBankAccount.getBalance());
					display.eject();
				}
			}
			else
				display.atmBalanceLow();
		}
		else
		{
			display.diffBank();
			display.reject();
		}
	}
}
