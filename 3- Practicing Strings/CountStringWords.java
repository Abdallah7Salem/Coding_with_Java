package Day9_Assignment;

import java.util.Scanner;

public class CountStringWords {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s;
		s = sc.nextLine();
		
		int count = 0;
		
		if(s.charAt(0) != ' ')
		{
			count++;
		}
		
		for(int i = 0; i < s.length() - 1; i++)
		{
			if(s.charAt(i) == ' ' && s.charAt(i+1) != ' ')
			{
				count++;
			}
		}
		
		System.out.println("Number of Words is: " + count);

	}

}
