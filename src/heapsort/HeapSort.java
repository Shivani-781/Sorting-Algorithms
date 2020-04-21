package heapsort;

public class HeapSort {
    int[] arr;
    int sizeOfTree;

    public HeapSort(int size) {
        arr = new int[size+1];
        sizeOfTree = 0;
    }

    public void insert(int value) {
        arr[sizeOfTree+1] = value;
        sizeOfTree++;
        heapify(sizeOfTree);
    }

    public void heapify(int i)
    {
        int largest = i/2;
        if (i<=1) {
            return;
        }

        if(arr[i]<arr[largest])
        {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
        }
        heapify(largest);
    }

    public boolean isHeapEmpty() {
        if(sizeOfTree<=0) {
            return true;
        }
        else {
            return false;
        }
    }

    public void delete() {
        arr =null;
        System.out.println("Heap deleted!");
    }

    public int getSizeOfTree() {
        return sizeOfTree;
    }

    public int sizeOfArray() {
        return arr.length;
    }

    public void peek() {
        if(isHeapEmpty()) {
            System.out.println("Empty!");
        }
        else {
            System.out.println(arr[1]);
        }
    }

    public void display() {
        for(int i=1; i<arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
}
