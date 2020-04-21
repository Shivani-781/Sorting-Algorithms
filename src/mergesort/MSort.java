package mergesort;

import merge.*;

public class MSort {
    MergeSort ob = new MergeSort();
    public void msort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            msort(arr, l, m);
            msort(arr, m + 1, r);
            ob.merge(arr, l, m, r);
        }
    }
}