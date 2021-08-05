public class BubbleRecursionSort
{
	public static void main(String[] args)
	{
		BubbleRecursionSort brs = new BubbleRecursionSort();
		int[] arr = {23, 17, 2, 14};
		brs.sort(arr.length, arr);
		System.out.println("Sorted Array: ");
		brs.printArr(arr);
	}
	
	public void sort(int n, int[] arr)
	{
		//base case
        if (n == 1)
        {
        	return;
       	}
      
        // one round of bubble sorting
        for (int i=0; i<n-1; i++)
        {
        	if (arr[i] > arr[i+1])
            {
                //swap elements arr[i] and arr[i+1]
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
		}
      
        // Largest element is fixed,
        // recur for remaining array
        sort(n-1, arr);
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
