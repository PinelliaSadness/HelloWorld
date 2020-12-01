package com.liuyumao.algorithm.sheell;

import com.liuyumao.algorithm.AlgorithmMain;

import java.util.Arrays;

/**
 * 希尔排序
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = AlgorithmMain.getArray(10, 10);
        System.out.println(Arrays.toString(arr));

//        sort(arr);
//        System.out.println(Arrays.toString(arr));

        theSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void theSort(int[] arr) {
        //希尔排序其实是改进的插入排序
        //通过间隔h来将数组分为若干组,然后没组之间进行排序
        //缩小间隔直到间隔为0
        int h = (arr.length - 1) / 3;
        while (true) {

            h = (h - 1) / 3 == 0 ? 1: (h - 1) / 3 ;

            for (int k=0; k<h; k++) {// 所有分组
                for (int i=k+h; i<arr.length; i+=h) {
                    for (int j=i; j>=h; j-=h) {
                        if (arr[j] < arr[j-h]) {
                            AlgorithmMain.swap(arr, j-h, j);
                        }
                    }
                }
            }

            if (h==1) {
                break;
            }
        }
    }

    private static void sort(int[] arr) {
        //希尔排序其实是改进的插入排序
        //通过间隔h来将数组分为若干组,然后没组之间进行排序
        //缩小间隔直到间隔为0

        int h = (arr.length - 1 ) / 3;

        System.out.println(h);
        for (int k=0; k<h; k++) {// 所有分组
            for (int i=k+h; i<arr.length; i+=h) {
                for (int j=i; j>=h; j-=h) {
                    if (arr[j] < arr[j-h]) {
                        AlgorithmMain.swap(arr, j-h, j);
                    }
                }
            }
        }
    }
}
