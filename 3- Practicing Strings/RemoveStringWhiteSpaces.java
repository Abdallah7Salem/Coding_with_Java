package Day9_Assignment;

import java.util.Scanner;

public class RemoveStringWhiteSpaces {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s;
		s = sc.nextLine();
		
		String pure_string = "";
		
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) != ' ')
			{
				pure_string += s.charAt(i);
			}
		}
		
		System.out.println("String with Spaces: " + s);
		System.out.println("String without Spaces: " + pure_string);
	}

}
