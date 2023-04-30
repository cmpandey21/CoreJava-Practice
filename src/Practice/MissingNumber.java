package Practice;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {6,4,1,2,3};
	    int n=missingNumber(arr);
	    System.out.println(n + " is missing number");
	}
	
	public static int missingNumber(int []arr)
	{
		int Total = 0,Sum=0,Num=0;
		int [] arr1=new int[arr.length+1];
		for(int i=1;i<=arr.length+1;i++)
		{
			Total+=i;
		}
		for(int i=0;i<arr.length;i++)
		{
			Sum+=arr[i];
		}
		
		Num=Total-Sum;
		return Num;
	}

}
