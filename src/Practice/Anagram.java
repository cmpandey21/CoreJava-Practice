package Practice;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean flag=isAnagramSort("test","tteb");

System.out.println(flag);
	}
	
	static boolean isAnagramSort(String s1, String s2)
	{
	if(s1.length()!=s2.length())
	{
		return false;
	}
	char[] a1=s1.toCharArray();
	char[] a2=s2.toCharArray();
	Arrays.sort(a1);
	Arrays.sort(a2);
	return Arrays.equals(a1, a2);
	
	}
	

}


