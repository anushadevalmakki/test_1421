package atm;

public class ReceiptPrinter {
	public void generateCash() {
		System.out.println("Cash Recieved");
	}
	public void balance(int balance) {
		System.out.println("\n***********");
		System.out.println("\nRECEIPT");
		System.out.println("\nBALANCE :"+balance);
		System.out.println("\n***********");
		
	}

}
