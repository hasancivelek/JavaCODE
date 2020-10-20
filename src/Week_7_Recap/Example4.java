package Week_7_Recap;
class Class2{
	int a=11;
	void method () {
		System.out.println("method in Class2");
	}
}
public class Example4 extends Class2{
	
	int a=5;
	void method () {
		System.out.println("method in Example4");
		System.out.println(this.a+"\n "+super.a);
	}
	void method2() {
		this.method();
		super.method();
	}

	public static void main(String[] args) {
		
new Example4().method();
new Example4().method2();

	}

}
