package main;

import java.util.Scanner;

import merge.MergeSort;
import printarray.PrintArray;
import mergesort.MSort;
import heapsort.HeapSort;

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
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                HeapSort ob = new HeapSort(n);
                for(int i=0; i<n; i++) {
                    ob.insert(arr[i]);
                }
                ob.display();
                System.out.println(ob.sizeOfArray());
                ob.peek();
                ob.delete();
                break;
            default:
                System.out.println("Invalid Choice! Better luck next time. ");
        }

    }
}
