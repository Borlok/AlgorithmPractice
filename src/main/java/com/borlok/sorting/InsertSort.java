package com.borlok.sorting;

import java.util.Arrays;

public class InsertSort {

    public long sort (int [] arr) {
        int compose = 0;
        long start = System.nanoTime();
        for (int i = 1; i < arr.length-1; i++) {
            int temp = arr[i];
            int in = i;
            ++compose;
            while (in > 0 && arr[in - 1] >= temp) {
                arr[in] = arr[in - 1];
                --in;
            }
            arr[in] = temp;
        }


        long stop = System.nanoTime();
        long result = stop - start;
        System.out.println("Сравнений для " + arr.length + " элементов: " + compose + " Затраченное время(наносек): " + result);
//        System.out.println(Arrays.toString(arr));
        return result;
    }
}
