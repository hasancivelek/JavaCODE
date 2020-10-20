package Week_7_1;

class Student{
	int  number;
	String name, course;
	float tuition ;
	
	public Student(int number, String name, float tuition) {
		//super();
		this.number = number;//this keyword is acts as reference to the object
		this.name = name;
		this.tuition = tuition;
		//System.out.println("Number: "+number +"\n"+"Name: "+name+"\n"+"Tuition: "+ tuition);
	}
	
	public Student(int number, String name, float tuition ,String course) {
		//we can use this() in order to invoke constructor in the same class
		this(number, name, tuition);//we are reusing 3 parameters constructor
		this.course=course;

		System.out.println("Number: "+number +"\n"+"Name: "+name+"\n"+"Tuition: "+ tuition +"\n"+"Course: "+course);
}


}

public class ThisKeywordConcept1 {

	public static void main(String[] args) {
		
//Student student = new Student(4298, "hasan", 35000);

Student student1 = new Student(4298, "hasan", 35000,"ESL");

	}

}
