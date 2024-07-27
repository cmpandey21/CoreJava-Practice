package Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="mohanaaa ppfgh";
		System.out.println(removeduplicate(s));
	}

	public static String removeduplicate(String s)
	{
		String result="";
		char [] arr=s.toCharArray();
		ArrayList<Character> list=new ArrayList<Character>();
		for(char i=0;i<arr.length;i++)
		{
		list.add(arr[i]);
		}
		LinkedHashSet<Character> set=new LinkedHashSet<Character>(list);
		ArrayList<Character> withoutduplicate=new ArrayList<>(set);
		for(int i=0;i<withoutduplicate.size();i++)
		{
			result=result+withoutduplicate.get(i);
		}
		return result;
	}
	
}
