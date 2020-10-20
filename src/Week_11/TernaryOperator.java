package Week_11;

public class TernaryOperator {

	public static void main(String[] args) {
		
		int a, b;
		a=10;
		b=(a==1)? 20 :30 ;
	//variable=(boolean)? value1 : value2	
		System.out.println("Value of b is: "+ b);
		
		b=(true || false) ? 40 : 57;
		
		System.out.println("Value of b is: "+ b);
	}

}
