package quicksort;

public class QuickSort {
    public static void quickSort(int[] arr, int start, int end) {
        if(start < end) {
            int pivot = partition(arr, start, end);
            quickSort(arr, start, pivot-1);
            quickSort(arr, pivot+1, end);
        }
    }

    public static int partition(int[] arr, int p, int q)
    {
        int pivot = q;
        int i = p-1;
        for(int j=p; j<=q; j++) {
            if(arr[j] <=arr[pivot]) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return i;
    }

}
