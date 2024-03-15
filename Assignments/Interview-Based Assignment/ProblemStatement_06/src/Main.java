

import java.util.List;
import java.util.stream.Collectors;
public class Main {

	
	public static void main(String[] args) {
		List<Integer> list=  List.of(1,2,3,88,4,5,6,7,7,8,9,678,2);
		
	   List<Integer> list2 = list.stream().filter(l -> l%2 ==0).sorted((i1,i2)-> i1.compareTo(i2)).collect(Collectors.toList());
	  list2.forEach(i->System.out.println(i));
		

	}

}
