package Day5_Assignment;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		int num = 0;
		System.out.println("Please Enter a Number: ");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		
		int remainder = 0;
		int sum_of_digits = 0;
		
		while(num != 0)
		{
			remainder = num % 10;
			sum_of_digits += remainder;
			num /= 10;
		}
		
		System.out.println("Sum of Digits is: " + sum_of_digits);
		
	}
}
