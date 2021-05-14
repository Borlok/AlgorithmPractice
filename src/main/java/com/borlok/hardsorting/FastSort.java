package com.borlok.hardsorting;

import java.util.Arrays;

public class FastSort {
    private int [] arr;

    public FastSort(int[] arr) {
        this.arr = arr;
    }

    public long sortFast() {
        long start = System.nanoTime();

        quickSort(0, arr.length - 1);

        long stop = System.nanoTime();
        long result = stop - start;
        System.out.println("Длинна массива: " + arr.length + " Затраченное время(наносек): " + result);
//        System.out.println(Arrays.toString(arr));
        return result;
    }

    private void quickSort(int left, int right) {
        if (right - left <= 0)
            return;
        else
        {
            int pivot = arr[right];
            int partition = partitionIt(left,right,pivot);
            quickSort(left, partition-1);
            quickSort(partition + 1, right);
        }
    }
    private int partitionIt(int left, int right, long pivot)
    {
        int leftPtr = left-1;
        int rightPtr = right;
        while(true)
        {
            while( arr[++leftPtr] < pivot )
                ;
            while(rightPtr > 0 && arr[--rightPtr] > pivot)
                ;
            if(leftPtr >= rightPtr)
                break;
            else
                swap(leftPtr, rightPtr);
        }
        swap(leftPtr, right);
        return leftPtr;
    }

    private void swap(int leftPtr, int rightPtr) {
        int temp = arr[leftPtr];
        arr[leftPtr] = arr[rightPtr];
        arr[rightPtr] = temp;
    }
}
