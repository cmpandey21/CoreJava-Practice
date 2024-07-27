//"Hi Guys I'm working for Alcon India"
public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   /*String s="Hi Guys I'm working for Alcon India";
	   String s1[]=s.split(" ");
	   int [] count=new int[7];
	   int k=0;
	   for(int i=0;i<s1.length;i++)
	   {
		  // count[k++]=s1[i].length();
		 System.out.println(s1[i].length());
		   
	   }*/
		
		//abcd
		//badc
		String s="abcdefg";
		String s1="";
		//badcfeg
		if(s.length()%2==0) {
		for(int i=0;i<s.length();i=i+2)
		{       
			char temp;
		        temp=s.charAt(i);
		        s1=s1+s.charAt(i+1);
		        s1=s1+temp;
		        
		}
		}
		else
		{
			for(int i=0;i<s.length()-1;i=i+2)
			{
				char temp;
		        temp=s.charAt(i);
		        s1=s1+s.charAt(i+1);
		        s1=s1+temp;
				
			}
			s1=s1+s.charAt(s.length()-1);
		}
		
		System.out.println(s1);
		
		
		
	}

}
