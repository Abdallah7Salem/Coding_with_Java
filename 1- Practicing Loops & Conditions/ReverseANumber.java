package Day5_Assignment;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		
		int num = 0;
		System.out.println("Please Enter a Number to Reverse: ");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		
		int reversed_num = 0;
		int remainder = 0;
		
		while(num != 0)
		{
			remainder = num % 10;
			reversed_num = (reversed_num * 10) + remainder;
			num /= 10;
		}
		
		System.out.println(reversed_num);
		
		
		
	}

}
