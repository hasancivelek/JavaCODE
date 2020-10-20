package Week_5;

public class MethodConcept2 {

	public static void main(String[] args) {

		MethodConcept2 object = new MethodConcept2();
//Argument:value that we use to pass to methods
//argument data type needs to match with parameter data type

		object.printOut("Hasan");
//order of the arguments need to match with parameter data type
		object.addNumbers(5, 9, "String");

		object.areaOfTriangle(5, 3);

		int[] myArray = { 1, 2, 3, 4, 5 };
		object.printArray(myArray);

		String[] myStringArray = { "Java", "Selenium", "TestNG" };
		object.printArray(myStringArray);

	}

	// overloading
	void printArray(String array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");

		}

	}

	void printArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");

		}

	}

	void areaOfTriangle(int height, int base) {
		double area = height * base / 2d;
		System.out.println(area);
	}

	public void printOut(String print) {
		System.out.println(print);

	}

	public void addNumbers(int a, int b, String name) {
		System.out.println(a + b);
		System.out.println(name);
	}

}
