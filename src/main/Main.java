package main;

import java.util.Scanner;

import bubblesort.BubbleSort;
import insertionsort.InsertionSort;
import merge.MergeSort;
import printarray.PrintArray;
import mergesort.MSort;
import heapsort.HeapSort;
import quicksort.QuickSort;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        PrintArray p = new PrintArray();

        System.out.println("Enter the number of algorithm you want to sort the elements with: ");
        System.out.println("1. Bubble Sort ");
        System.out.println("2. Insertion Sort ");
        System.out.println("3. Merge Sort ");
        System.out.println("4. Selection Sort ");
        System.out.println("5. Quick Sort ");
        System.out.println("6. Heap Sort ");

        int ch = sc.nextInt();
        switch(ch) {
            case 1:
                BubbleSort ob1 = new BubbleSort();
                ob1.bsort(arr);
                p.printArr(arr);
                break;

            case 2:
                InsertionSort ob2 = new InsertionSort();
                ob2.sort(arr);
                p.printArr(arr);
                break;

            case 3:
                break;

            case 4:
                break;

            case 5:
                QuickSort ob5 = new QuickSort();
                ob5.quickSort(arr, 0, arr.length-1);
                p.printArr(arr);
                break;

            case 6:
                HeapSort ob6 = new HeapSort(n);
                for(int i=0; i<n; i++) {
                    ob6.insert(arr[i]);
                }
                ob6.display();
                System.out.println(ob6.sizeOfArray());
                ob6.peek();
                ob6.delete();
                break;

            default:
                System.out.println("Invalid Choice! Better luck next time. ");
        }

    }
}
