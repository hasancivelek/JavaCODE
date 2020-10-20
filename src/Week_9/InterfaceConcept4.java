package Week_9;
/*
 * when we want to leave some implementation of the class to subclass, we are using abstract classes .
 * 
 * when we want basic contract in a class for all the methods, we are using interface
 */

interface IWithMain{
	public static void main(String[] args) {
		System.out.println("Interface can have main");
	}
	
}


public class InterfaceConcept4 {

	public static void main(String[] args) {
		IWithMain.main(new String[1]);


	}

}
