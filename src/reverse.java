
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Abcdas";
		String s2="";
		for(int i =s1.length()-1;i>=0;i--)
		{
			//System.out.print(s1.charAt(i));
			
			s2= s2+ s1.charAt(i);
		}
	}

}
