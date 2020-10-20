package Week_12_DateConcept;

@FunctionalInterface
interface FirstFuctionalInterface1{
	
	String FirstabstractMethod1(int a ,String b);
	//boolean equals(Object a);
}
@FunctionalInterface
interface Summable{
	//10+200
	int sum(int a, int b);
}

//check whether the length of the string equals to zero or not

interface Predicate <T>{//first built - functional interface
	boolean test(String s);
}




public class FirstLambda1 {

	public static void main(String[] args) {
		
		
FirstFunctionalInterface obj=(x,y)->{
	if(x==0) {
		System.out.println("Hello");
	}
	else {
		System.out.println("Hello Again");
	}
	return "Returning Lambda"; };



System.out.println(obj.abstractMethod(1, "Hello Lambda "));

//System.out.println(obj.equals(3));


Summable obj3=(a,b)-> a+b; System.out.println(obj3.sum(10, 200)); obj3.sum(10, 200); 

obj3.sum(2, 3);


Predicate<String> checkLength=b->b.length()==0;

Predicate<String> checkStart=str->str.startsWith("A");

Predicate<String> contain=b->b.contains("a");



	}

}
