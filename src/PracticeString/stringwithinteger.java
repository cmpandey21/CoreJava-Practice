package PracticeString;

public class stringwithinteger {
	//input aaabbbbccdddddd
	//output  a3b4c2d5
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaabbbbccddd";
		String s1="";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			count++;
			if(i==s.length()-1) {
		
				s1=s1+s.charAt(i)+count;
				break;
			}
			
			if(s.charAt(i)!=s.charAt(i+1))
			{
				s1=s1+s.charAt(i)+count;
		      	count=0;
		   }
		}
		System.out.println(s1);
	}

}
