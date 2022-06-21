package PracticeLoops;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number want to check for prime");
		int n;
		Scanner in=new Scanner(System.in);
	    n=in.nextInt();
		int temp=0;
		for(int i=2; i<=n-1;i++)
		{
			if(n%i==0)
			{
				temp++;
			}
		}
		if(temp==0)
		{
			System.out.println("Number is prime");
		}

	}

}
