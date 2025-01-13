package Day5_Assignment;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int num = 0;
		System.out.println("Please Enter a Number: ");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		int temp = num;
				
		int reversed_num = 0;
		int remainder = 0;
		
		while(num != 0)
		{
			remainder = num % 10;
			reversed_num = (reversed_num * 10) + remainder;
			num /= 10;
		}
				
		num = temp;
		
		boolean palindrome_stat = true;
		while(num != 0)
		{
			if((num % 10) != (reversed_num % 10))
			{
				System.out.println("Number is not Palindrome");
				palindrome_stat = false;
				break;
			}
			
			num /= 10;
			reversed_num /= 10;
		}
				
		if(palindrome_stat == true)
		{
			System.out.println("Number is Palindrome");
		}
		
		
		
	}

}
