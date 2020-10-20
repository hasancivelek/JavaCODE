package Week_6_Recap;
//task;create a program which calculate how many transactions has been hold in the program
//this example demonstrates static concept and bank account example
public class BankAccount {

	String name;
	int balance;
	static int countTotalTransaction;

	public BankAccount(String name) {

		this.name = name;
		this.balance = 0;

	}

	public void withDraw(int amount) {
		if (balance > 0) {
			balance -= amount;
			countTotalTransaction++;

		}

	}

	public void deposit(int amount) {
		balance = balance + amount; // balance+=amount;
		countTotalTransaction++;
	}

//in order to see the balance , you need to pay 2 dollars	
	public void showBalance() {
		if (balance > 2) {
			balance -= 2;
			System.out.println("your balance is: " + balance);
			countTotalTransaction++;

		}
	}

	public static void main(String[] args) {

		BankAccount customer1 = new BankAccount("Hasan");

		customer1.deposit(500);
		customer1.withDraw(200);
		customer1.showBalance();
		
		BankAccount customer2 = new BankAccount("Ahmet");
		
		customer2.deposit(700);
		customer2.withDraw(200);
		customer2.showBalance();
		
		System.out.println(BankAccount.countTotalTransaction);
	}

}
