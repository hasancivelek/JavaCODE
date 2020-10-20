package Week_9;

interface Imoveable{
	int AVG_SPEED=60;//public, static and final by default 
	void moveForward();
	void moveBacward();
}

class Vehicle implements Imoveable{
//overriden methods have to be public
	@Override
	public void moveForward() {
	System.out.println("Vehicle moved forward");	
		
	}

	@Override
	public void moveBacward() {
		System.out.println("Vehicle moved backward");
		
	}
	
}

class Animal implements Imoveable{

	@Override
	public void moveForward() {
		System.out.println("Animal moved forward");
		
	}

	@Override
	public void moveBacward() {
		System.out.println("Animal moved backward");
		
	}
	
}

public class InterfaceConcept2 {

	public static void main(String[] args) {
//upcasting		
Imoveable vehicle1 = new Vehicle();
System.out.println(Imoveable.AVG_SPEED); // System.out.println(vehicle1.AVG_SPEED);
vehicle1.moveForward();
vehicle1.moveBacward();

vehicle1=new Animal();
vehicle1.moveBacward();
vehicle1.moveForward();



	}

}
