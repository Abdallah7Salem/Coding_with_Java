package Day9_Assignment;

import java.util.Scanner;

public class CharacterOccurrenceInAString {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Please Enter the String: ");
		s = sc.nextLine();
		
		
		int total_with_character = s.length();
		int total_without_character = (s.replace("a", "").length());
		
		int count = total_with_character - total_without_character;
		
		System.out.println(count);
	}

}
