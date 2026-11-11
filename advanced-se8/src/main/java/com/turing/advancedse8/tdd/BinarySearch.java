package com.turing.advancedse8.tdd;

public class BinarySearch {

	public int search(int[] arr, int item) {
		if(arr==null || arr.length == 0)
		{
			return -1;
		}
		else
		{
			int start = 0;
			int end= arr.length-1;
			
			while( (start<= end))
			{
				int middle = (start+end)/2;
				//System.out.println("Middle "+middle);
				if(arr[middle]== item)
				{
					return middle;
				}
				else if(arr[middle]<item)
				{
					start = middle+1;
					
				}
				else
				{
					end = middle-1;
				}
			}
			return -1;
		}
	}

}
