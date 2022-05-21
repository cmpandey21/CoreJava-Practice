
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//input string - 
		//String s="a3b4c2d5";
		//output - aaabbbbccddddd

		String s="My name is Chandra Mohan Pandey";
		
		String s2[] = s.split(" ");
		s="";
		
		for(int i=s2.length-1;i>=0;i--) {
			
			if(i!=0)
			s+=s2[i]+" ";
			
			else s+=s2[i];
		}
		
		
//		String s1="";
//		
//		for(int i=s.length()-1; i>0;i--)
//			
//		{
//		    if(s.charAt(i)>='1' && s.charAt(i)<='9') {
//		    	int x=s.charAt(i)-'0';
//		    	for(int j=0;j<x;j++){
//		    	   s1+=s.charAt(i-1);
//		    	}
//		    }
//			
//		}
		
		System.out.println(s);
		
		
	}

}
