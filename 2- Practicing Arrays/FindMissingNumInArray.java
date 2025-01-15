package Day7_Assignment;

public class FindMissingNumInArray {
	
	public static void main(String[] args) {

		int arr[] = {1, 5, 3, 4};

		int arr_sum1 = 0;
		for(int i = 0; i < arr.length; i++)
		{
			arr_sum1 += arr[i];
		}
		
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
		
		int arr_sum2 = 0;
		for(int i = arr_min; i <= arr_max; i++)
		{
			arr_sum2 += i;
		}
		
		int missing_num = 0;
		missing_num = arr_sum2 - arr_sum1;
		
		System.out.println("Missing Number is: " + missing_num);
		
	}
}
