package Week_11_1Lamda_Stream;
//This example demonstrates what kind of functionality does my lambda expression have
//Functional interface: interface which has only abstract method.

interface FunctionalInterfac{
	
	String message();
}
// first way 
class Acllas implements FunctionalInterfac {

	@Override
	public String message() {
		
		return "Hello AClass";
	}
	
}
public class LamdaConcept1 {

	public static void main(String[] args) {
	
		//second way	
FunctionalInterfac obj = new FunctionalInterfac() {
	
	@Override
	public String message() {
		
		return "Hello From Anonymous Class";
	}
};

System.out.println(obj.message());

FunctionalInterfac obj1 = new Acllas();

System.out.println(obj1.message());

// third way Lambda expression
//FIName         refName parameterlist Impementetion
//  ^                ^   ^             ^
FunctionalInterfac obj2 =()->("Hello Lambda");

System.out.println(obj2.message());


	}

}
