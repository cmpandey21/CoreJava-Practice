package PracticeString;

public class Programforasciivalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//input a3b4c2d5
//output aaabbbbccdddddd
		
		String s="a3b4c2d5";
		String s1="";
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				int x=s.charAt(i)-'0';
				
				for(int j=0;j<x;j++)
				{
					s1=s1+s.charAt(i-1);
				}
			}
		}
		
		System.out.println(s1);
	}

}
