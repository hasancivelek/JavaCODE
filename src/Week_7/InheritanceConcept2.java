package Week_7;
//we are using inheritance concept to categorize the class
//Hierarchical inheritance
class Employee{
	String name;
	int salary;
	int sickDays;
	
}
class QAEngineer extends Employee{
	String certificates[];
}
class HouseWife extends Employee{
	int numberOfChildren;
}
class Teacher extends Employee{
	int studentNumbers;
}


public class InheritanceConcept2 {
	
	public static void main(String[]args) {
		HouseWife houseWife = new HouseWife();
		houseWife.name="Zuhal";
		houseWife.sickDays=0;
		houseWife.numberOfChildren=3;
		
		QAEngineer engineer = new QAEngineer();
		engineer.name="Hasan";
		engineer.salary=65000;
		engineer.sickDays=15;
		String[] QACerticates= {"Java","Python","Scrum"};
		engineer.certificates=QACerticates;
		
	}

}
