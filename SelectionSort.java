public class SelectionSort
{
	public static void main(String[] args)
	{
		SelectionSort ss = new SelectionSort();
		int[] arr = {18, 23, 15, 4};
		ss.sort(arr);
		System.out.println("Sorted Array: ");
		ss.printArr(arr);
	}
	
	public void sort(int arr[])
	{
    //run sorting algorithm
		int n = arr.length;
		for(int i=0; i<n-1; i++)
		{
			//calculate minimum element in the array
			int minID = i;
			for(int j=i+1; j<n; j++)
			{
				if(arr[j] < arr[minID])
				{
					minID = j;
				}
			}
			
			//swap the minimum element with element at index i
			int temp = arr[minID];
			arr[minID] = arr[i];
			arr[i] = temp;
		}
	}
	
	public void printArr(int[] arr)
	{
		//prints every element in the array
		int n = arr.length;
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
