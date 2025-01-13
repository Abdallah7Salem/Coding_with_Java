package Day5_Assignment;

import java.util.Scanner;

public class NumberOfEvenAndOdd {
	
	public static void main(String[] args) {
		
		int num = 0;
		System.out.println("Please Enter a Number: ");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		
		byte even_count = 0;
		byte odd_count = 0;
		int remainder = 0;
		
		while(num != 0)
		{
			remainder = num % 10;
			if(remainder % 2 == 0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
			
			num /= 10;
		}
		
		System.out.println("Number of Even Digits is: " + even_count);
		System.out.println("Number of Odd Digits is: " + odd_count);

		
	}
}
