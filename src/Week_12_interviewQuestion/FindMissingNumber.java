package Week_12_interviewQuestion;

public class FindMissingNumber {

	public static void main(String[] args) {
		
//int arr1[]= {2,3,4,6,7,8,23,25};
//for(int i=0; i<arr1.length-1; i++) {
//	if(arr1[i]!=arr1[i+1]-1) {
//		System.out.println("The missing number is "+(arr1[i]+1) );
//	}
//}

int arr[]= {2,3,4,6,7};

int sumExpected=0;
for (int i = arr[0]; i <= arr[arr.length-1]; i++) {
	sumExpected+=i;
}
System.out.println(sumExpected);

int sumActual=0;
for (int i = 0; i < arr.length; i++) {
	sumActual+=arr[i];
}
System.out.println("Missing number: "+(sumExpected-sumActual));
	}

}
