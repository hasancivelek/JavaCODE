package Week_5_Recap;

import java.util.Scanner;

public class Recap2 {

	static boolean isEven(int a) {
		if (a % 2 == 0) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("put a number");

		int a = scanner.nextInt();

		if (isEven(a) == true) {
			System.out.println("your parameter is even");
		} 
		else {
			System.out.println("your parameter is odd");
		}
	}

}
