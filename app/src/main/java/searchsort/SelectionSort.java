package searchsort;

public class SelectionSort {
    /**
     * Sort the array arr using selection sort algorithm.
     */
    public static void sort(int[] arr) 
    {
        int length = arr.length;

        for(int i = 0; i < length - 1; i++)
        {
            int min = i;

            for(int j = i+1; j < length; j++)
            {
                if(arr[j] < arr[min])
                {
                    min = j;
                }
            }
            if(min != i)
            {
                Util.exch(arr, i, min);
            }
        }

    }
}
