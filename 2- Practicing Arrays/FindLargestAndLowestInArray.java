package Day7_Assignment;

public class FindLargestAndLowestInArray {
	public static void main(String[] args) {
		
		int arr[] = {1, 5, 3, 4, 100, 343, 3103};
		
		int arr_min = arr[0];
		for(int i = 1; i < arr.length; i++)
		{
			if(arr_min > arr[i])
			{
				arr_min = arr[i];
			}
		}
		
		int arr_max = arr[0];
		for(int i = 1; i < arr.length; i++)
		{
			if(arr_max < arr[i])
			{
				arr_max = arr[i];
			}
		}
		
		
		System.out.println("Largest Number in Array is: " + arr_max);
		System.out.println("Lowest Number in Array is: " + arr_min);
		
		
		
		
		
	}
}
