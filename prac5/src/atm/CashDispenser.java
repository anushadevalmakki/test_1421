package atm;

public class CashDispenser {
	int cashOnAtm;
	public CashDispenser(int balance) {
		this.cashOnAtm=balance;
	}

	public boolean supplyCash(int amount)
	 { 
		 if(cashOnAtm>amount)
			 return true;  
		 else
			 return false;
	 }
	public void setInitialCash(int initialCash)
    {
		cashOnAtm=cashOnAtm-initialCash;
		this.cashOnAtm=initialCash;
    }
}
