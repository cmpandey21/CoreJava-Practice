package PracticeString;

public class CheckForBinary {

	boolean isBinary(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != '0' && str.charAt(i) != '1') {
				return false;
			} 
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckForBinary ob = new CheckForBinary();
		// boolean s=ob.isBinary("1010");
		System.out.println(ob.isBinary("1010"));
	}

}
