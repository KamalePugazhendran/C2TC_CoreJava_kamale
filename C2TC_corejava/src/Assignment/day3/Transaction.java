package Assignment.day3;

 class Transaction {

	    public static final double transactionFee = 2.0;

	    public final void performTransaction(Account account, String type, double amount) {
	        switch (type.toLowerCase()) {
	            case "deposit":
	                account.deposit(amount - transactionFee);
	                break;
	            case "withdraw":
	                account.withdraw(amount + transactionFee);
	                break;
	            default:
	                System.out.println("Invalid transaction type");
	        }
	    }
	}
	
