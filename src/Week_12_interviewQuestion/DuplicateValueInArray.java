package Week_12_interviewQuestion;

public class DuplicateValueInArray {

	public static void main(String[] args) {
		

//		int arr[]= {1,2,2,3,4,5,6,6};
//for (int i = 0; i < arr.length; i++) {
//	for (int j = i+1; j < arr.length; j++) {
//		if(arr[i]==arr[j]) {
//			System.out.println(arr[i]);
//		}
//	}
	
	String arr1[]= {"hasan","nihal","ihsan","meral","zuhal","hasan"};
for (int i = 0; i < arr1.length; i++) {
	for (int j = i+1; j < arr1.length; j++) {
		
		if(arr1[i].equals(arr1[j])) {
			
			System.out.println(arr1[i]);
	
}

	}
}
}}