package PracticeString;

public class Removeallalphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="a3b4c2d5";
		
		//String result=s.replaceAll("\\d","");
		String result=s.replaceAll("[a-zA-Z]","");
		System.out.println(result);
	}

}
