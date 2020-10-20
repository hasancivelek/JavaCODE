package Week_11_Recap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LambdaWithMap {

	public static void main(String[] args) {
		
Map<String, Integer> map= new HashMap<String, Integer>();

map.put("ZM", 248);
map.put("NFX", 543);
map.put("SPOT", 500);
map.put("TESLA", 1500);

map.forEach( (k,v) -> System.out.println( k +",Market Price "+ v));



List<Integer> list = Arrays.asList(4,25,9,16);

list.forEach(n->System.out.println(n));

double sum =list.stream().mapToDouble(x-> Math.sqrt(x)).sum();
System.out.println(sum);

	}

}
