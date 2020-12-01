package com.liuyumao.algorithm.insertion;

import com.liuyumao.algorithm.AlgorithmMain;

import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = AlgorithmMain.getArray(10, 10);
        System.out.println(Arrays.toString(arr));

//        sort(arr);
//        System.out.println(Arrays.toString(arr));

        theSort(arr);
        System.out.println(Arrays.toString(arr));


    }

    public static void theSort(int[] arr) {
        //将N个元素分数组分为有序和无序两个部分,一个无需的数组第一个数可以看做一个有序的数组,
        //除第一个数,其他的数可以看作一个无序的数组
        //每次将无序数组的第一个元素与有序数组的元素从后往前逐个比较
        //找出插入位置,将该元素插入到有序数组的合适位置中

        for (int i=1; i<arr.length; i++) {
            for (int j=i; j>0; j--) {
                if (arr[j] < arr[j-1]) {
                    AlgorithmMain.swap(arr, j-1, j);
                }
            }
        }
    }

    private static void sort(int[] arr) {
        //将N个元素分数组分为有序和无序两个部分,一个无需的数组第一个数可以看做一个有序的数组,
        //除第一个数,其他的数可以看作一个无序的数组
        //每次将无序数组的第一个元素与有序数组的元素从后往前逐个比较
        //找出插入位置,将该元素插入到有序数组的合适位置中

        //从第二个元素开始
        for (int j=1; j>0; j--) {
            if (arr[j] < arr[j-1]) {
                AlgorithmMain.swap(arr, j-1, j);
            }
        }
    }
}
