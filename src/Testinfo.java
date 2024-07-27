import java.util.HashMap;

import java.util.HashMap;

import java.util.HashMap;

public class Testinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S="This is My Test String";
		characterCount(S); 
	}
	
	public static void characterCount(String s)
	{
		//test
		char [] s1=s.toCharArray();
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i]==' ')
			{
				continue;
			}
			else
			{
			if(map.containsKey(s1[i]))
			{
				map.put(s1[i], map.get(s1[i])+1);
			}
			
			else
			{
				map.put(s1[i], 1);
			}
			}
		}
		
		System.out.println(map);
	}

}
