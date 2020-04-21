package merge;

public class MergeSort {
    int[] arr1 = new int[5];
    public void merge(int[] arr, int l, int m, int r) {
        int i=l;
        int j=m+1;
        int k=l;
        while(i<=m && j<=r) {
            if(arr[i]<=arr[j]) {
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
            while(i<m) {
                arr1[k] = arr[i];
                i++;
                k++;
            }
        }
        for(k=l; k<=r; k++) {
            arr[k] = arr1[k];
        }
    }
}
