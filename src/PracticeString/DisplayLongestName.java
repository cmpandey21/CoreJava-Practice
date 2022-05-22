package PracticeString;

public class DisplayLongestName {
	
    public static String longest(String names[], int n) {
    String s="";
    for(int i=0;i<n;i++)
    {
     if(names[i].length()>s.length())
     {
         s=names[i];
     }
    }
    return s;
    
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] s= {"Geek", "Geeks", "Geeksfor","GeeksforGeek", "GeeksforGeeks"};
		String s1=DisplayLongestName.longest(s,5);
		System.out.println(s1);
		s1=s1.toLowerCase();
char[] a= {'a','b','c'};

		System.out.println(s1);
	}

}


