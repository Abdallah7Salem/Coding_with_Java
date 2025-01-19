package Day9_Assignment;

import java.util.Scanner;

public class String_PalindromeOrNot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s;
		s = sc.next();
		
		boolean palindrome_stat = true;
		for(int i = 0; i <= ((s.length() - 1) / 2); i++)
		{
			if(s.charAt(i) == s.charAt(s.length() - 1 - i))
			{
				continue;
			}
			else
			{
				palindrome_stat = false;
				break;
			}
		}
		
		if(palindrome_stat == true)
		{
			System.out.println("String is Palindrome");
		}
		else if (palindrome_stat == false)
		{
			System.out.println("String is not palindrome");
		}

	}

}
