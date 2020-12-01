package com.liuyumao.algorithm.bubble;

import com.liuyumao.algorithm.AlgorithmMain;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = AlgorithmMain.getArray(10, 10);
        System.out.println(Arrays.toString(arr));

//        sort(arr);
//        System.out.println(Arrays.toString(arr));

        theSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void theSort(int[] arr) {
        //持续对剩下的无需的数进行刚刚的步骤,直到得到有序的数组
        for (int i=arr.length-1; i>=0; i--) {

            //比较相邻的元素,如果第一个比第二个大,就交换他们
            //对每一对相邻元素做同样的工作,从开始第一队到姐喂的最后一堆.
            //这样我们就获取到了一个最大的数
            for (int j=0; j<i; j++){
                if (arr[j] > arr[j+1]){
                    AlgorithmMain.swap(arr, j ,j+1);
                }
            }
        }
    }

    private static void sort(int[] arr) {
        //比较相邻的元素,如果第一个比第二个大,就交换他们
        //对每一对相邻元素做同样的工作,从开始第一队到姐喂的最后一堆.
        //这样我们就获取到了一个最大的数
        for (int j=0; j<arr.length-1; j++){
            if (arr[j] > arr[j+1]){
                AlgorithmMain.swap(arr, j ,j+1);
            }
        }
    }
}
