package Map;

import java.util.HashMap;

public class OccurrencesOfEachCharacter {

	public static void main(String[] args) {
		String s="My name is Mohan";
	 System.out.println(s+"->"+countOccurencesofcharacters(s));
		
		
	}
	
	public static HashMap countOccurencesofcharacters(String s)
	{
	
		HashMap<Character,Integer> map=new HashMap<>();
		char[] arr=s.toCharArray();
		for(char i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i],map.get(arr[i])+1);
				
			}
			
			else if(arr[i]==' ')
			{
				
				continue;
			}
			else
			{
				map.put(arr[i], 1);
			}
		}
		
		//System.out.println(s+"->"+map);
		return map;
	}
	

}
