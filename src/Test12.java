/*
i/p: 98765432
o/p:23456789  */
public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="98765432";
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
			
		}
		
		System.out.println(s1);
	}

}
