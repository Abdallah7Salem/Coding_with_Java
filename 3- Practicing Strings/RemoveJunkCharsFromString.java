package Day9_Assignment;

import java.util.Scanner;

public class RemoveJunkCharsFromString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s;
		s = sc.next();
		
		String pure_string = "";
		
		for(int i = 0; i < s.length(); i++)
		{
			if((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
				|| s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			{
				pure_string += s.charAt(i);
			}
		}
		
		System.out.println(s + '\n' + pure_string);
	}

}
