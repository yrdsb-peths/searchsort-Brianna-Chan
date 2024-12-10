package searchsort;

public class MergeSort extends Sort {
    /**
     * Sort the array arr using merge sort algorithm.
     */
    @Override
    public void sort(int[] arr) {
        int[] aux = new int[arr.length];
        mergeSort(arr, aux, 0, arr.length - 1);
    }
    private void mergeSort(int[] arr, int[] aux, int low, int high)
    {
        if(low >= high)
        {
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(arr, aux, low, mid);
        mergeSort(arr, aux, mid + 1, high);
        merge(arr, aux, low, mid, high);
    }

    private void merge(int[] arr, int[] aux, int low, int mid, int high)
    {
        for(int k = low; k <= high; k++)
        {
            aux[k] = arr[k];
        }

        int i = low;
        int j = mid + 1;

        for(int k = low; k <= high; k++)
        {
            if (i > mid) { // If left subarray is exhausted
                arr[k] = aux[j];
                j++;
            } else if (j > high) { // If right subarray is exhausted
                arr[k] = aux[i];
                i++;
            } else if (aux[j] < aux[i]) { // Compare values and pick the smaller one
                arr[k] = aux[j];
                j++;
            } else {
                arr[k] = aux[i];
                i++;
            }
        }

        for(int f = 0; f < arr.length; f++)
        {
            System.out.print(arr[i]);
        }
        System.out.println("");

        assert Util.isSorted(arr);
    }

    /* 
    private void mergeSort(int[] arr, int low, int high)
    {
        if(low >= high)
        {
            return;
        }

        int mid = (low + high) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);

        int[] left = new int[mid - low + 1];
        for(int i = 0; i <= mid - low; i++)
        {
            left[i] = arr[low + i];
        }

        int[] right = new int[high - mid];
        for(int i = mid + 1; i <= high; i++)
        {
            right[i - (mid + 1)] = arr[i];
        }

        merge(arr, left, right);
    } */
    /*
     * Merge the two sorted arrays left and right into the array arr.
     */

    /* 
    private void merge(int[] arr, int[] left, int[] right) 
    {
        assert Util.isSorted(left);
        assert Util.isSorted(right);

        int leftMin = 0;
        int rightMin = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(rightMin == right.length - 1 || left[leftMin] <= right[rightMin])
            {
                arr[i] = left[leftMin];
                leftMin++;
            }
            else
            {
                arr[i] = right[rightMin];
                rightMin++;
            }
        }
    }*/
}
