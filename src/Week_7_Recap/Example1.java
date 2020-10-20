package Week_7_Recap;

import java.util.Scanner;

class Account {

	String name;
	int balance;

	public Account(String name, int balance) {
		this.name = name;// this keyword acts like reference to the class object
		this.balance = balance;

	}
}

class CreateAccount extends Account {
// inherited --->String name;
	public CreateAccount(String name, int balance) {
		super(name, balance);// This super keyword invokes Account constructor

	}

	void insert(String n) {// take input user and assign it to name
		name = n;

	}

	void withDraw(int amount) {
		balance -= amount;
	}

	void deposit(int amount) {
		balance += amount;
	}

}

public class Example1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is customer' s name : ");
		String customerNmae = scanner.next();

		System.out.println("What is customer' s balance :");
		int customerBalance = scanner.nextInt();

		CreateAccount account = new CreateAccount(customerNmae, customerBalance);

	}

}
