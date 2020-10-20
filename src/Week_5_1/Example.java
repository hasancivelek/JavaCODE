package Week_5_1;

//question: can we overload the main method
//Answer: yes
public class Example {
//create a method which finds the biggest number among two given numbers

	public static void main(String[] args) {

		System.out.println(findTheMax(4, 6));

		countTheLetter("I love Java language", 'a');

	}

	static int findTheMax(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

//countTheLetter("hasan",'a')--->2
	static void countTheLetter(String string, char ch) {
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println(count);
	}
}
