package Map;

import java.util.HashMap;

public class OccurrencesOfEachVowelCharacter {

	public static void main(String[] args) {
		String s="mohan pandey";
		countOccurencesofvowelcharacters(s);
	}
	
	public static void countOccurencesofvowelcharacters(String s)
	{
	
		HashMap<Character,Integer> map=new HashMap<>();
		char[] arr=s.toCharArray();
		for(char i=0;i<arr.length;i++)
		{
			if(arr[i]=='a'|| arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
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
		}}
		
		System.out.println(s+"->"+map);
	}
	

}
