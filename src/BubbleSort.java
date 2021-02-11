
public class BubbleSort {
	public static int[] bubbleSortArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        return arr;
    }
	
	public static void printArray(int arr[]) {
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {8,7,5,4,9,3,2,1};
		arr = bubbleSortArray(arr);
		printArray(arr);

	
	}

}
