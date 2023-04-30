package Practice;

import java.util.ArrayList;

public class ArrayListLamdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(5);
		
		arr.forEach((e)->{
			System.out.print(e);
		});
	}

}
