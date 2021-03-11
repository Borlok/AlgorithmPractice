package com.borlok;

import com.borlok.sorting.BubbleSort;
import com.borlok.sorting.InsertSort;
import com.borlok.sorting.SelectSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] arr = new int[100];
        fillArray(arr);
        System.out.println("Дан массив: " + Arrays.toString(arr));
        System.out.println("===========Сортировка пузырьком==========");
        new BubbleSort().sort(arr);
        System.out.println("===========Сортировка выбором==========");
        new SelectSort().sort(arr);
        System.out.println("===========Сортировка вставкой==========");
        new InsertSort().sort(arr);

    }

    private static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100+1);
        }
    }
}
