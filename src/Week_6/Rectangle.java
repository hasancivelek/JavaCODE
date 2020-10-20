package Week_6;

public class Rectangle {

	//attributes
	int lenght;
	int width;
	
	//int area;
	//int perimeter;
	//method
	
	void calculateArea() {
		System.out.println("Area of the rectangle : " + lenght*width);
	}
	
	void calculatePerimeter() {
		System.out.println("Area of the perimeter :" + (2*(lenght+width)));
	}
	
	public static void main(String[] args) {
		
Rectangle object1 = new Rectangle();
object1.lenght=5;
object1.width=10;
object1.calculateArea();
object1.calculatePerimeter();

	}

}
