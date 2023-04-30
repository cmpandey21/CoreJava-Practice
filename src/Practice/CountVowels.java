package Practice;

public class CountVowels {
	
public static void main(String[] args)
{
	String s="Abcdasio";
	int count=0;
	String s1=s.toLowerCase();
	for(int i=0;i<s1.length();i++)		
	{
		if(s1.charAt(i)=='a' ||s1.charAt(i)=='e' ||s1.charAt(i)=='i' ||s1.charAt(i)=='o' ||s1.charAt(i)=='u')
		{
		count++;	
		}
	
	}
	System.out.println(count);
	
}


}