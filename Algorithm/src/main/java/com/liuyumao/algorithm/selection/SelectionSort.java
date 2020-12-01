package com.liuyumao.algorithm.selection;

import com.liuyumao.algorithm.AlgorithmMain;

import java.util.Arrays;

/**
 * 选择排序
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = AlgorithmMain.getArray(100, 10);
        System.out.println(Arrays.toString(arr));

        sort(arr);
        System.out.println(Arrays.toString(arr));

        theSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void theSort(int[] arr) {
        //我们需要从第0个数开始一直到倒数第二个数完成排序

        for (int i=0; i<arr.length-1; i++) {
            //我们先从数组里面找到最小的那个数字
            //假设最小数字的下标默认为0
            int minPos = i;

            for (int j=i+1; j<arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
                //经过一次循环之后获取到了本次循环中最小的数的下标;
            }
            // 交换位置
            swap(arr, i, minPos);
//            System.out.println("第" + i + "次交换之后" + Arrays.toString(arr));
        }

    }

    private static void sort(int[] arr) {
        //我们先从数组里面找到最小的那个数字
        //假设最小数字的下标默认为0
        int minPos = 0;

        for (int i=1; i<arr.length; i++) {
            if (arr[minPos] > arr[i]) {
                minPos = i;
            }
            //经过一次循环之后获取到了本次循环中最小的数的下标;
        }
        // 交换位置
        swap(arr, 0, minPos);

    }

    private static void swap(int[] arr, int i, int minPos) {
        int temp = arr[i];
        arr[i] = arr[minPos];
        arr[minPos] = temp;
    }
}
