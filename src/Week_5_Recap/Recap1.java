package Week_5_Recap;

public class Recap1 {
	
	public static int method1(int a) {
		
		System.out.println("this method staring to work");
		System.out.println("we are adding 10 into our parameter");
		a=a+10;
		System.out.println("we are returning a");
		
		return a;
		
	}

	public static void main(String[] args) {
		
int number= method1(10)+10;
System.out.println(number);

	}

}
