package PracticeString;


//Count String "an" in a given string
public class Countspecificword {

	public static void main(String[] args) {
		String s="mohan an mani chandra bani  an mani chandra suraj rishi mami bani an count rajesh mani";
        String[] s1=s.split(" ");
      
 
        int count=0;
        for(int i=0;i<s1.length;i++)
        {
        	if("an".equals(s1[i]))
        	{
        		count++;
        	}
        }
        System.out.println(count);
        
	}
	 
}
