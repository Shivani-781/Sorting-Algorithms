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
        // System.out.println("Enter the elements: ");
        HeapSort ob = new HeapSort(n);
        ob.insert(13);
        ob.insert(8);
        ob.insert(6);
        ob.insert(11);
        ob.insert(9);
        ob.insert(40);
        ob.display();
        System.out.println(ob.sizeOfArray());
        ob.peek();
        ob.delete();
    }
}