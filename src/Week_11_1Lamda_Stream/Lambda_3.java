package Week_11_1Lamda_Stream;

import java.util.ArrayList;
import java.util.Arrays;


public class Lambda_3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList= new ArrayList<>(Arrays.asList(1,2,3,4));
		
		//Print all the elements
		//arrayList.forEach(s->System.out.println(s));
		
		arrayList.forEach((n)->{System.out.println(n);});

		
		//Print only even numbers
		//arrayList.forEach(n->{if(n%2==0)System.out.println(n);});
	}

}
