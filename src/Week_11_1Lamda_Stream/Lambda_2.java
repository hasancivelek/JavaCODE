package Week_11_1Lamda_Stream;



public class Lambda_2 {
//Create a Func. interface , double squareRoot(double a),
	//Implement  it with lambda expression , print the result in console
	//Sample input:81 , output:9
	
	interface SquareRoot{
		double squareRoot(double a);
	}
	
	
	public static void main(String[] args) {
		
SquareRoot ref= (n)->(Math.sqrt(n));

System.out.println(ref.squareRoot(9));



SquareRoot ref1 = (n)->{double result = Math.sqrt(n); 

return result;
};
System.out.println(ref1.squareRoot(25));


System.out.println(squareRootLambda(256));
}
	
//Lambda expression as parameter

	private static double squareRootLambda(int x) {
	
		SquareRoot ref= (n)->(Math.sqrt(n));
	
	return ref.squareRoot(x);
}
 

	}


