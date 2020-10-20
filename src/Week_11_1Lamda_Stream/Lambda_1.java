package Week_11_1Lamda_Stream;


@FunctionalInterface
interface IFuncInterface{
	void abstractFunctional(String x);
	
	default void normalMethod(){
		System.out.println("Hey");
	}
}
//Create a functional interface , have abstract void method name is square(int a).
//Complete the implementation with lambda expression . call the method afterwise

@FunctionalInterface
interface ISquare{
	void square(int x);
}
public class Lambda_1 {

	public static void main(String[] args) {
		
IFuncInterface ref =(String a)->System.out.println(a);

ref.abstractFunctional("Message");

ISquare ref1 =( a)->System.out.println(a*a); //ISquare ref1 =( a)->{System.out.println(a*a);};

ref1.square(3);

	}

}
