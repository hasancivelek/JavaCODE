package Week_6_1;

public class ObjectConcept {
String string;

public ObjectConcept(String astring) {
	string=astring;

}
String getString() {
	return string;
}
	
	
	public static void main(String[] args) {
		
ObjectConcept reference;

String name;

reference=new ObjectConcept("Java");

System.out.println(reference.getString());

//Anonymous object
//why we need anonymous object: if you want to use the object only one time , we can create this

System.out.println(new ObjectConcept("Object concept field").getString());
	
	}

}
