package Practice;

public class MaxOccurringChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "My name is Mohan";
		System.out.println(maxOccurringChar(s));

	}

	static final int[] size = new int[256];

	public static char maxOccurringChar(String s) {

		for (int i = 0; i < s.length(); i++) {
			size[s.charAt(i)]++;
			
		}

		int max = -1;
		char result = ' ';
		for (int i = 0; i < s.length(); i++) {
			if (max < size[s.charAt(i)]) {
				max = size[s.charAt(i)];

				result = s.charAt(i);
			}
		}
		return result;
	}

}
