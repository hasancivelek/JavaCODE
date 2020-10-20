package Week_5;

public class MethodConcept3 {
	
	
	String method (int i) {
		if(i==1) {
			return "First";
		}
		else if(i==2) {
			return"Second";
		}
		else {
			return "Not first or second";
		}
	}

	
	
	public static void main(String[] args) {
		
MethodConcept3 object = new MethodConcept3();
System.out.println(object.method(5));


//how to call method anonymous object

System.out.println(new MethodConcept3().method(2));

	}

}
