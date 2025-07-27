package Assignment.Assignment3;

public class Main {
	
	    public static void main(String[] args) {
	        Bank bank1 = new Bank();
	        Bank bank2 = new Bank();

	        SavingsAccount savings = new SavingsAccount("SAV123");
	        CheckingAccount checking = new CheckingAccount("CHK456");

	        Transaction transaction = new Transaction();

	        transaction.performTransaction(savings, "deposit", 100);
	        transaction.performTransaction(checking, "deposit", 200);
	        transaction.performTransaction(savings, "withdraw", 50);

	        savings.displayAccountInfo();
	        checking.displayAccountInfo();

	        System.out.println("Total Bank Accounts: " + Bank.getTotalAccounts());
	    }
	}
	




