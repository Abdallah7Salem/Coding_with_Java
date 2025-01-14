package Day6_Assignment;

public class SumOfArrayElements {

	public static void main(String[] args) {
		
		int sum = 0;
		int arr[] = {1, 2, 3, 4 ,5};
		
		for(int x : arr)
		{
			sum += x;
		}
		
		System.out.println("Sum of Array Elements is: " + sum );
		
	}
	
}
