package CoreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenNumberAscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int [] arr= {24,55,67,86,23,2};
		
		Integer[] even=evenNumberAscendingOrder(arr);
		for(int i=0;i<even.length;i++)
		{
			System.out.print(even[i]+" ");
		}
		
	}
public static Integer[] evenNumberAscendingOrder(int arr[])
{
	List<Integer> even=new ArrayList<>();
	
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%2==0)
		{
		  even.add(arr[i]);
			
		}
	}
	
	Integer[] arr1=even.toArray(new Integer[0]);
;
	Arrays.sort(arr1);
	
	return arr1;
}
}
