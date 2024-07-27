package CoreJava;

/*
input abcdefg
output efgdabc
 */
public class StringReverseExcludingMiddleElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="abcdefg";
		String s1="";
		int mid=s.length()/2;
		for(int i=mid+1;i<s.length();i++)
		{
			s1=s1+s.charAt(i);
		}
		

		s1=s1+s.charAt(mid);
		for(int i=0;i<mid;i++)
		{
		
			s1=s1+s.charAt(i);
	}
		
		
		
		System.out.println(s1);
		
	
	}

}
