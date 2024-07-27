package Stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create a list and filter all even numbers from list
		List<Integer> list1=List.of(2,4,5,6,76,75,76);
		
		List<Integer> list2=new ArrayList<>();
		list2.add(12);
		list2.add(141);
		list2.add(14);
		list2.add(15);
		list2.add(16);
		
		List<Integer> list3=Arrays.asList(23,43,54,6,7);
		
		//Without Stream
		List<Integer> listEven=new ArrayList<>();
		for(Integer i:list1)
		{
			if(i%2==0)
			{
				listEven.add(i);
			}
		}
		System.out.println(list1);
		System.out.println(listEven);
		
		//Using Stream
		//Stream<Integer> stream=list1.stream();
		//List<Integer> newList=stream.filter(i->i%2==0).collect(Collectors.toList());
		
		List<Integer> newList=list1.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(newList);
	}

}
