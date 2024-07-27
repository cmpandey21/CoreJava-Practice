package GenericType;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Generic provide type safety
		//below example
		
		List<String> list=new ArrayList<>();
		list.add("Generic Type example, Type Safe");
		
		List anotherlist=new ArrayList<>();
		anotherlist.add("Non Generic and Non Type Safe");
		
		System.out.println(list);
		System.out.println(anotherlist);
	}

}
