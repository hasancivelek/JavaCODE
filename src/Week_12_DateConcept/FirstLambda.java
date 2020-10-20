package Week_12_DateConcept;

public class FirstLambda {}

@FunctionalInterface
interface FirstFunctionalInterface {

	String abstractMethod(int a,String b);
	
	boolean equals(Object a);
}
//@FunctionalInterface
//interface Comparator<T>{
//	
//	
//	int compare(T o1 ,T o2);
//	
//	boolean equals(Object a);//not regarded as abstract method so does not break the rule
//}
class MyClass implements FirstFunctionalInterface{

	@Override
	public String abstractMethod(int a,String b) {
		System.out.println("Hello");
		return "";
		
		}
	public static void main(String[] args) {
	//1.way
	MyClass obj= new MyClass();
	obj.abstractMethod(3,"Hey");
	
	//2.way Anonymous
	
	FirstFunctionalInterface obj1=new FirstFunctionalInterface() {
		
		@Override
		public String abstractMethod(int a,String b) {
			System.out.println("Hello Again");
return "";
			
		}
	};

	obj1.abstractMethod(3,"Hey 1");
	
	//3.way with lambda//type inference
	
	FirstFunctionalInterface interfaceLambda=(a,b)-> {
		if(a==0) {
		System.out.println("Hello from Lambda ");}
		else {
			System.out.println("Somthing else");}
		return "Returning String";};
	interfaceLambda.abstractMethod(4,"Hey 2");
	
	/*
	 * no parameters
	 * ()->42;
	 * ()->"String";
	 * ()->{return " something else";};
	 * ()->{System.gc();};
	 */
	
	}
}
