package Week_11_Recap;
//Local classes are classes that we create inside a method

class LocalClassConcept{
	
	void method() {
		
		class Local{
			int a=9;
			void method1() {
				System.out.println("method1 inside of local class");
			}
		}
		
		//System.out.println(new Local().a);
		Local local= new Local();
		local.method1();
	}
	
	
}


public class LocalClass {

	public static void main(String[] args) {
		LocalClassConcept obj= new LocalClassConcept();
		
		
		obj.method();
		
		

	}

}
