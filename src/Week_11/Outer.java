package Week_11;

public class Outer {
	private int data =30;
	void display() {
		class Local{
			void msg() {
				System.out.println("Data is : " +data);
			}
		}
		//Local Class finishes
		Local ilLocal= new Local();
		ilLocal.msg();
	}

	public static void main(String[] args) {
		new Outer().display();

	}

}
