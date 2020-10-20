package Week_12_interviewQuestion;

public class PalindromeNumber {

	public static void main(String[] args) {
		
//number whose reverse and itselves are same
		// 121, 1234321, 333
		
		String number="121";
		String reversed="";
		
		for(int i = number.length()-1; i>=0; i--) {
			reversed += number.charAt(i);
		}
		if(number.equals(reversed)) {
			System.out.println(number+ " is Polindrome");
		}
		else {
			System.out.println(number+ " is not Polindrome");
		}
		
//		int number=131;
//		int r=0;
//		int sum=0;
//		int t;
//		
//		t=number;
//		
//		while(number>0) {
//			
//			r=number%10;//gets the last digit
//			sum=(sum*10)+r;
//			number=number/10;
//		}
//		if(t==sum) {
//			System.out.println("This is Palindrome");
//		}
//		else {
//			System.out.println("This is not Palindrome");
//		}
	}

}
