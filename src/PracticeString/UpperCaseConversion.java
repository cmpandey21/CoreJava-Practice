package PracticeString;
//Given a string str, convert the first letter of each word in the string to uppercase
public class UpperCaseConversion {

	public static String UpperCase(String s)
	{
		String str = "";
	       str+=(char)(s.charAt(0)-32);
	      
	       for(int i=1; i<s.length(); i++){
	           if(s.charAt(i-1)==' ')
	               str+=(char)(s.charAt(i)-32);
	           else 
	               str+=s.charAt(i);
	       }
	       return str;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="i love you";
		String Str=UpperCaseConversion.UpperCase(s);
		System.out.println(Str);
		

	}

}
