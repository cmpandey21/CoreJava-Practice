package CoreJava;

public class MinMaxNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {24,55,67,86,23};
		
		int min=minNumberArray(arr);
		int max=maxNumberArray(arr);
		
		System.out.println("Min Number is :" + min + "\n"+"Max Number is :"+ max);
	}
	
	public static int minNumberArray(int [] arr)
	{
	int min=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		min=Math.min(min, arr[i]);
	}
	
	return min;
	}

	public static int maxNumberArray(int [] arr)
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			max=Math.max(max, arr[i]);
		}
		
		return max;
		
	}
}
