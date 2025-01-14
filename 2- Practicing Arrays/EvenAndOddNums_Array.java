package Day6_Assignment;

public class EvenAndOddNums_Array {

	public static void main(String[] args) {
		
		short even_counter = 0;
		short odd_counter = 0;
		
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
		
		for(int x : arr)
		{
			if(x % 2 == 0)
			{
				even_counter++;
			}
			else
			{
				odd_counter++;
			}
		}
		
		System.out.println("Even Numbers in the array: " + even_counter);
		System.out.println("Odd Numbers in the array:" + odd_counter);
		
	}

}
