package Practice;

public class Reversewordsorder {

	
	public static String words(String s){
		{
		String s1[]=s.split(" ");
		s="";
		System.out.print(s);
		for(int i=s1.length-1;i>=0;i--)
		{
			if(i!=0)
			{
				s=s+s1[i]+" ";
			}
			else
			{
				s=s+s1[i];
			}
		}
		return s;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "My name is Mohan";
		//Reversewordsorder r=new Reversewordsorder();
		System.out.println(Reversewordsorder.words(s));
		s=Reversewordsorder.words(s);
	
		System.out.println(s);
	}

}
