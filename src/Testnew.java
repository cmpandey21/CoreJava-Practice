import java.util.HashMap;

//WAP to take parameter as string and return count of each vowel from the string.
//5 
//
public class Testnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		vowelCount("test");
	}
	
	public static void vowelCount(String s)
	{
		HashMap<Character, Integer> map=new HashMap<>();
		char [] strarr=s.toCharArray();
		for(char i=0;i<strarr.length;i++)
		{
			if(map.containsKey(strarr[i]))
			{
				map.put(strarr[i], map.get(strarr[i])+1);
			}
			else
			{
				map.put(strarr[i],1);
			}
		}
		System.out.println(s+":"+map);
	}

}
