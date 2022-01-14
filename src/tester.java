import java.util.Scanner;


public class tester {
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = kb.next();
		System.out.println("How much would you like to deposit?");
		double balance = kb.nextDouble();
		System.out.println("What is your Business name?");
		String business = kb.next();
		
	
		bankAccount acct2 = new bankAccount(name, balance);
		CBA acct3 = new CBA(name, balance, business);
		
		acct2.deposit(400);

		acct2.withdraw(600);
		
		

	}
}
