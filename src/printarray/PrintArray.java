package printarray;

public class PrintArray {
    public void printArr(int arr[]) {
        int n = arr.length;
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}