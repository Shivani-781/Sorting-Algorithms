package merge;

import heapsort.HeapSort;
import printarray.PrintArray;

public class MergeSort {
    int[] arr1;
    public MergeSort(int size)
    {
        arr1 = new int[size];
    }

    public void msort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            msort(arr, l, m);
            msort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public void merge(int[] arr, int l, int m, int r) {
        int i = l;
        int j = m + 1;
        int k = l;

        while(i <= m && j <= r) {
            if(arr[i] <= arr[j]) {
                arr1[k] = arr[i];
                i++;
            }
            else {
                arr1[k] = arr[j];
                j++;
            }
            k++;
        }
        if(i>m) {
            while(j<=r) {
                arr1[k] = arr[j];
                j++;
                k++;
            }
        }
        else {
            while(i<=m) {
                arr1[k] = arr[i];
                i++;
                k++;
            }
        }
        for(k = l; k <= r; k++) {
            arr[k] = arr1[k];
        }
    }
}
