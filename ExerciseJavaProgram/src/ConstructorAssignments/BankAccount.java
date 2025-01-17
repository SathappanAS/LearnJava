package ConstructorAssignments;
/*
Create a Java class named "BankAccount" with the following instance variables:
		accountNumber (String)
		balance (double)
Create a constructor for the BankAccount class that takes in the accountNumber and balance as parameters and initializes the instance variables.
Create a method in the BankAccount class named "deposit" that takes in a double value as a parameter and adds it to the balance instance variable.
Create a method in the BankAccount class named "withdraw" that takes in a double value as a parameter and subtracts it from the balance instance variable.

Create a main method that creates an instance of the BankAccount class using the constructor and performs 
multiple deposits and withdrawals using the deposit and withdraw methods. Print out the updated balance after each transaction.*/
public class BankAccount {
	
	String accountNumber;
	double balance;
	
	public BankAccount(String accountNumber,double balance) {
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	public double deposit(double valuedeposit) {
		valuedeposit= this.balance + valuedeposit;
		return valuedeposit;
	}

	public double withdraw(double valueWithdraw) {
		valueWithdraw=this.balance-valueWithdraw;
		return valueWithdraw;
	}
	
	public static void main(String[] args) {
		BankAccount p1= new BankAccount("7898",99.9);
		System.out.println(p1.deposit(100.0));
		System.out.println(p1.withdraw(.9));
		
		double sum=0;
		for(double i=1;i<=10;i++) {
			sum=sum + 20.10;
			p1.deposit(sum);
			//System.out.println(p1.deposit(sum));
		}
		System.out.println("Balance of the account " + p1.deposit(sum));
		
		
		double sub=0;
		for(double i=1;i<=10;i++) {
			sub=sub + 5.01;
			p1.deposit(sub);
			//System.out.println(p1.deposit(sum));
		}
		System.out.println("Balance of the account " + p1.withdraw(sub));
	}
}