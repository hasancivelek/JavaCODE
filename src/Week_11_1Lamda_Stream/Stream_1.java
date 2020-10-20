package Week_11_1Lamda_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream_1 {

	public static void main(String[] args) {
		
List<Integer> number = new ArrayList<Integer>(Arrays.asList(2,3,4,5));

//create square list, and store squares of these number list

//    list           target  stream    changing     converts stream to list
List<Integer> square= number.stream().map(x-> x*x).collect(Collectors.toList());

	//square.forEach(s->System.out.print(s));
	System.out.println(square);
	//mapToInt
	
	int sum = number.stream().mapToInt(x->x*x).sum();
	System.out.println(sum);
	
	//Create a list of string
	
	List<String> stringlist= new ArrayList<>(Arrays.asList("Java","Selenium","Cucumber","Civelek","C++"));
	
	//filter
	System.out.println(stringlist.stream().filter(s->s.startsWith("C")).collect(Collectors.toList()));
	
	List<String> newList= stringlist.stream().filter(s->s.startsWith("C")).collect(Collectors.toList());
	
	System.out.println(newList);
	
	//sort()
	
	List<Integer> numbers= new ArrayList<>(Arrays.asList(100,200,39,42,51));
	
	//sort numbers
	List<Integer> show= number.stream().sorted().collect(Collectors.toList());
	
	System.out.println(show);
	
	//sort stringlist
	List<String> stringListNew= stringlist.stream().sorted().collect(Collectors.toList());
	System.out.println(stringListNew);
	
	//Create a list ,store 1,,2,3,4,
	//filter only even numbers and store them inside another list
	//print out list
	
	List<Integer> myList = new ArrayList<>(Arrays.asList(1,33,4,55,65,54,8,10));
	
	List<Integer> myList1 = myList.stream().filter(s-> s%2==0).collect(Collectors.toList());
	myList1.forEach(a->System.out.println(a));

	
	}

}
