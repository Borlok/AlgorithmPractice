package com.borlok;

import com.borlok.sorting.BubbleSort;
import com.borlok.sorting.FastSort;
import com.borlok.sorting.InsertSort;
import com.borlok.sorting.SelectSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] arr = new int[1000];
        fillArray(arr);
        System.out.println("Дан массив: " + Arrays.toString(arr));
        System.out.println("===========Сортировка пузырьком==========");
        fillArray(arr);
        long bubble = new BubbleSort().sort(arr);
        System.out.println("===========Сортировка выбором==========");
        fillArray(arr);
        long select = new SelectSort().sort(arr);
        System.out.println("===========Сортировка вставкой==========");
        fillArray(arr);
        long insert = new InsertSort().sort(arr);

        System.out.println("===========Быстрая сортировка==========");
        fillArray(arr);
        long fast = new FastSort(arr).sortFast();
        System.out.println("Сводка скорости " + bubble + " наносек | " + bubble / 1000000000 + " сек");
        System.out.println("Сводка скорости " + select + " наносек | " + select / 1000000000 + " сек");
        System.out.println("Сводка скорости " + insert + " наносек | " + insert / 1000000000 + " сек");
        System.out.println("Сводка скорости " + fast + " наносек | " + fast / 1000000 + " мсек");
    }

    private static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * arr.length+1);
        }
    }
}
