package Week_6;
//this example demonstrates constructor concept
public class CellPhone {
	//fields
	String brand;
	int price;
	
	//constructor: it is a special block which instantiate the objects.
	//constructor consist of access modifiers and class name 
	//accessModifiers Classname (Parametr list){}
	// if we don't create a constructor , java creates a default one with no parameter 
	public CellPhone(String a, int b) {
		brand=a;
		price=b;
		
	}
	public CellPhone() {
		

	}
	
	
	
	public static void main(String[] args) {
		
CellPhone object1 = new CellPhone("Apple", 1000);

System.out.println(object1.brand +"\n"+object1.price);

CellPhone object2 = new CellPhone();

System.out.println(object2.brand +"\n"+object2.price);
	
	}

}
