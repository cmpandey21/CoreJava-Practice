package Practice;

import java.util.Scanner;

public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        String b=in.nextLine();
        a=a+b;
        b=a.substring(0, a.length()-b.length());
        a=a.substring(b.length());
        System.out.println(a+" "+b);
	}

}
