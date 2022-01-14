
class bankAccount {

	//making the master copy or the cookie cutter
	//global variables - will be filled in at the start of the program
	private String name;
	private double balance;
	private double interest;
	
	//constructor
	
	//overloaded constructor
	public bankAccount(String name, double balance) {
		this.name = name;
		this.balance = balance;
		this.interest = .09;
	}
	//getters or accessor methods
	public String getName() {
		return name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getInterest() {
		return interest;
	}
	
	public String toString() {
		return "Name: " + getName() + " and Balance: " + getBalance();
	}
	//setters or mutators
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amt) {
		this.balance += amt;
		System.out.println("Your new balance is " + getBalance());
	}
	
	public void withdraw(double amt) {
		if (this.balance >= amt) {
			this.balance -= amt;
			System.out.println("Your new balance is " + getBalance());
		}else {
			System.out.println("Insuffucient Funds");
			this.balance -= 25;
		}
	}
}

class CBA extends bankAccount {
	public String business;
	public CBA(String name, double balance, String business) {
		super (name, balance);
		this.business = business;
	}
	
}


