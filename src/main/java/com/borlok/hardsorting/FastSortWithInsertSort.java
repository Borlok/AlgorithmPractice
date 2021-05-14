package com.borlok.hardsorting;

import java.util.Arrays;

public class FastSortWithInsertSort {
    private int [] arr;

    public FastSortWithInsertSort(int[] arr) {
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
        int length = right - left + 1;
        if (length < 10)
            insertSort(left, right);
        else
        {
            int median = medianOf(left, right);
            int partition = partitionIt(left, right, median);
            quickSort(left, partition - 1);
            quickSort(partition + 1, right);
        }
    }

    private void insertSort(int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            int in = i;
            int temp = arr[i];
            while (in > left && arr[in - 1] >= temp) {
                arr[in] =  arr[in - 1];
                in--;
            }
            arr[in] = temp;
        }

    }

    private int medianOf(int left, int right) {
        int center = (left + right) / 2;
        if (arr[left] > arr[center])
            swap(left, center);
        if (arr[left] > arr[right])
            swap(left,right);
        if (arr[center] > arr[right])
            swap(center,right);

        swap(center, right - 1);
        return arr[right - 1];
    }

    private void swap(int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    private int partitionIt(int left, int right, long pivot) {
    int partLeft = left;
    int partRight = right - 1;

    while (true) {
        while (arr[++partLeft] < pivot);
        while (arr[--right] > pivot);
        if (partLeft >= partRight)
            break;
        else
            swap(partLeft,partRight);
    }
        swap(partLeft,right - 1);
    return partLeft;
    }
}
