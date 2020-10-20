package Week_11_Recap;
//Anonymous classes (for abstract class or interface)

interface Examle{
	int a = 9;
	void method();
	void method1();
}



public class AnonymousClass {

	public static void main(String[] args) {
		Examle examle = new Examle() {
			
			@Override
			public void method1() {
				
System.out.println("method 1");
			}
			
			@Override
			public void method() {
				System.out.println("method ");
				
			}
		};
examle.method1();
System.out.println(examle.a);

	}

}
