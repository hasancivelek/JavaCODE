package Week_9;

interface Ivehicle{
	
	void hasWhels();
	void hasEngine();

}

interface IMotorcycle extends Ivehicle{
	void hasPedal();
	void hasHandleBars();
}

interface Icar extends Ivehicle{
	boolean hasAirBags();
	boolean hasSunRoof();
	boolean hasDoors();
}

class Toyata implements Icar{

	@Override
	public void hasWhels() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hasEngine() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hasAirBags() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasSunRoof() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasDoors() {
		// TODO Auto-generated method stub
		return false;
	}
	
}

class Kawasaki implements IMotorcycle {

	@Override
	public void hasWhels() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hasEngine() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hasPedal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hasHandleBars() {
		// TODO Auto-generated method stub
		
	}
	
}



public class InterfaceConcept3 {

	public static void main(String[] args) {
		


	}

}
