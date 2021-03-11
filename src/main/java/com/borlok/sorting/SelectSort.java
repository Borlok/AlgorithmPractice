package com.borlok.sorting;

import java.util.Arrays;

public class SelectSort {

    public void sort (int [] arr) {
        int compose = 0;
        long start = System.nanoTime();
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                ++compose;
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }


        long stop = System.nanoTime();
        long result = stop - start;
        System.out.println("Сравнений для " + arr.length + " элементов: " + compose + " Затраченное время(наносек): " + result);
        System.out.println(Arrays.toString(arr));
    }

}
