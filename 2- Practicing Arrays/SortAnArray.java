package Day7_Assignment;

import java.util.Arrays;

public class SortAnArray {

	public static void main(String[] args) {
		
		int arr[] = {3, 6, 4, 8, 2, 1};
	
		for(int counter = 0; counter < arr.length; counter++)
		{
			for(int i = 0; i < arr.length - 1; i++)
			{
				if(arr[i] > arr[i+1])
				{
					arr[i] += arr[i+1];
					arr[i+1] = arr[i] - arr[i+1];
					arr[i] -= arr[i+1];
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
