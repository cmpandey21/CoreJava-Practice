package PracticeString;

public class WordFirstletteruppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// code here
		String s="my name is mohan";
        String [] s1=s.split(" ");
        String s2="";
        String S4="";
        String s3="pandey";
        S4=s+s3;
        
        System.out.println(S4);
            // code here
            for(int i=0;i<s1.length;i++)
            {
                char c=(char) (s1[i].charAt(0)-32);
           
                s2+=c+s1[i].substring(1);            
            if(i!=s1.length-1)
            {
                s2+=" ";
            }
            
            }
            System.out.println(s2);
            }
	
	
	}
            