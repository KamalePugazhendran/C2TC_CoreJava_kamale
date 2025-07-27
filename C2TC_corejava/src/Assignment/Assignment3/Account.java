package Assignment.Assignment3;

abstract class Account {
	    protected String accountNumber;
	    protected double balance;

	    public Account(String accountNumber) {
	        this.accountNumber = accountNumber;
	        this.balance = 0;
	    }

	    public abstract void deposit(double amount);
	    public abstract void withdraw(double amount);
	    public abstract double getBalance();

	    // Concrete method
	    public void displayAccountInfo() {
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Balance: " + balance);
	    }
	}

	class SavingsAccount extends Account {
	    public SavingsAccount(String accountNumber) {
	        super(accountNumber);
	    }

	    @Override
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	        }
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	        }
	    }

	    @Override
	    public double getBalance() {
	        return balance;
	    }
	}

	class CheckingAccount extends Account {
	    public CheckingAccount(String accountNumber) {
	        super(accountNumber);
	    }

	    @Override
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	        }
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	        }
	    }

	    @Override
	    public double getBalance() {
	        return balance;
	    }
	}

