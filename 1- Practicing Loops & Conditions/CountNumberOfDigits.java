package Day5_Assignment;

import java.util.Scanner;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		
		int num = 0;
		System.out.println("Please Enter a Number: ");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		
		short count = 0;
		
		while(num != 0)
		{
			count++;
			num /= 10;
		}
		
		System.out.println("Number of Digits is: " + count);
		
	}

}
