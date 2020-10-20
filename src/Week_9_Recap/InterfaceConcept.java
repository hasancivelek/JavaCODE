
package Week_9_Recap;

abstract class Abstrcat1{
	int a= 9;
	abstract void method();//we need to use abstract keyword to create abstract method
}

interface IIphone {
	// list the thing that any phone must have
	int RAM=16;
	void closeButton();

	void takeScreenShot();

}

class iphone implements IIphone {

	@Override
	public void closeButton() {
		System.out.println("Press the clise button for 3 second");

	}

	@Override
	public void takeScreenShot() {
		System.out.println("Click on the button on the screen and choose screen shot");

	}

}

class Samsung implements IIphone {

	@Override
	public void closeButton() {

		System.out.println("Press the clise button for 3 second");
	}

	@Override
	public void takeScreenShot() {

		System.out.println("Click on the volume and colse buuton at the same time");

	}

}

public class InterfaceConcept {

	public static void main(String[] args) {
		
IIphone iphone= new iphone();

iphone.takeScreenShot();
System.out.println(iphone.RAM);

iphone=new Samsung();

iphone.takeScreenShot();
System.out.println(iphone.RAM);

	}

}
