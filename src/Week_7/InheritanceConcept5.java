package Week_7;

class Book{
	String title="Angles and Demons";
	String author="Dan Brown";
	int price=15;
	
}
class PaperBackBook extends Book{
	int pages=300;
	void read() {
		System.out.println("You are reading the book , it has "+pages +" pages");
		System.out.println("You are reading the book , title: "+ title);
		System.out.println("You are reading the book , author: "+author);
	}
}

class AudioBook extends Book{
	int lenght=10;
	void play() {
		System.out.println("You are listeing AudioBook , it wiil last " + lenght + " hours");
	}
	
}

class EBook extends Book{
	int size=20;
	void download() {
		System.out.println("You are downloading EBook version , size is " +size +"MB");
	}
}


public class InheritanceConcept5 {

	public static void main(String[] args) {
		
AudioBook audioBook=new AudioBook();
audioBook.play();


PaperBackBook paperBackBook=new PaperBackBook();
paperBackBook.read();

	}

}
