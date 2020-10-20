package Week_6;

// classes are templates or blueprints for the object
//objects are instances of their classes
public class Car {

	// attributes

	String brand;
	int price;

	void buy() {
		System.out.println("Total cost " + brand + " " + price);
	}

	public static void main(String[] args) {

		Car object1 = new Car();

		object1.brand = "Mercedes";
		object1.price = 30000;
		System.out.println(object1.brand + "\n" + object1.price);

		object1.buy();

	}

}
