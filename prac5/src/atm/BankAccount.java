package atm;

public class BankAccount {
	int accountno,atmcardNo,balance;
	public BankAccount(int accountno, int cardNo, int balance) {
		this.accountno=accountno;
		this.atmcardNo=cardNo;
		this.balance=balance;
	}
	public int getaccountno(){
		return accountno;
	}
	public int getAtmCardno() {
		return atmcardNo;
	}
	public boolean withdrwal(int amount){
		if(balance>amount){
			this.balance=balance-amount;
			return true;
		}
		else
			return false;
	}
	public int getBalance()
    {
        return balance;
    }

}
