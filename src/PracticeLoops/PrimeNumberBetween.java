package PracticeLoops;

public class PrimeNumberBetween {

	public static void main(String[] args) {
		
		System.out.println("Enter the number want to check for prime");
		int n;
		int m;
		int temp = 0;
		for(int j=1;j<=100;j++) {
		for (int i = 2; i <= j - 1; i++) {
			if (j % i == 0) {
				temp++;
			}}
			if (temp == 0 && j!=1) {
			
				System.out.println(j+ " is prime");
				}
		
		else {
			temp=0;
		}
		}
		
	}
	}


