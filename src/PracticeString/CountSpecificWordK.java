package PracticeString;

import java.util.Scanner;

//Count a specific word K which is entered through keyboard in a given string
public class CountSpecificWordK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		
				String s="mohan an mani chandra bani ka an mani chandra suraj rishi mami bani an count rajesh mani";
	        String[] s1=s.split(" ");
	    
              String k=in.next();   	 
	        int count=0;
	        for(int i=0;i<s1.length;i++)
	        {
	        	//System.out.println(s1[i]);
	        	if(s1[i].equals(k))
	        	{
	        		count++;
	        	}
	        }
	        System.out.println(count);

	}

}
