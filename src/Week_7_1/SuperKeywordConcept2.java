package Week_7_1;
//Final Keywords;
//final variable = we can not update the variable
//final method= we can not override method
//final class=we can not extend to this class
//constructor can not be final
class SuperClass{
	int num= 4298;
}

class ChildClass extends SuperClass{
	int num=4300;
	
	void printNumber() {
		//
		System.out.println(num);//4300
		System.out.println(super.num);//4298
		System.out.println(new SuperClass().num);//4298
		System.out.println(this.num);//4300
		System.out.println(new ChildClass().num);//4300
	}
}

public class SuperKeywordConcept2 {

	public static void main(String[] args) {
		
		new ChildClass().printNumber();


	}

}
