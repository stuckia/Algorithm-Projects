public class BubbleSort
{
	public static void main(String[] args)
	{
		BubbleSort bbs = new BubbleSort();
		int[] arr = {23, 17, 2, 14};
		bbs.sort(arr);
		System.out.println("Sorted Array: ");
		bbs.printArr(arr);
	}
	
	public void sort(int[] arr)
	{
		//run sorting algorithm
		int n = arr.length;
		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<n-1-i; j++)
			{
				//swap the lower element with the higher element
				if(arr[j+1]<arr[j])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
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
