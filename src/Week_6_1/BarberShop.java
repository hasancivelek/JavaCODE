package Week_6_1;

public class BarberShop {

	static int customer;
	String customerName;
	
	public BarberShop() {
	customer++;

}
	public BarberShop(String a) {
		
		customerName=a;
 customer++;
	}
		
	
	
	
	public static void main(String[] args) {
		
BarberShop customer1 = new BarberShop();
BarberShop customer2 = new BarberShop();
BarberShop customer3 = new BarberShop();
BarberShop customer4 = new BarberShop("Bob");

System.out.println(customer);

	}

}
//create a class which finds how many customer this barber shop