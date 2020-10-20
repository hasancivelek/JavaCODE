package Week_8;

public class EmployeeTset {

	static void getEmployeeInfo(Employee reference) {
		
		System.out.println(reference.getName());
		System.out.println(reference.getSSN());
		System.out.println(reference.getSalary());
		System.out.println(reference.CompanyName);
		
		
	}
	
	public static void main(String[] args) {
		
Employee object = new Employee();
Employee object1 = new Employee();

object.setName("Hasan");
object.setSalary(6000);
object.setSSN(350000000);

object1.setName("Zuhal");
object1.setSalary(7000);
object1.setSSN(340000000);

getEmployeeInfo(object);
System.out.println("*********");
getEmployeeInfo(object1);



	}

}
