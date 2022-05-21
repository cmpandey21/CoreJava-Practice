package Practice;

public class ArrayOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,1,4,5,3,5,5,6};
int result[] = null;
int k=0;
for (int i=0;i<arr.length;i++)
{
	for(int j=0;j<arr.length;j++)
	{
		if(arr[i]==arr[j])
		{
			result[i]=result[k++];
		}
	}
	
}

for(int i=0;i<result.length;i++)
{
	System.out.println(result[i]);
}
	}

}
