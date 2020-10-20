package Week_11_Recap;

@FunctionalInterface
interface LambdaExample {
	
	void calculatePowe(int base, int power);
	}

public class LambdaExpression {

	public static void main(String[] args) {
		//Create a lambda expression for this method
		
		//LambdaExample example=(a,b)->{System.out.println(Math.pow(a, b));};
		
		LambdaExample example=(a,b)->{
			
			int power =(int)Math.pow(a, b);
			
			System.out.println(power);};

		
		
		
		example.calculatePowe(2, 4);
	}

}
