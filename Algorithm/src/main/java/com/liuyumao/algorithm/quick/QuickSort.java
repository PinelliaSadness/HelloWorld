package com.liuyumao.algorithm.quick;

import com.liuyumao.algorithm.AlgorithmMain;

import java.util.Arrays;

/**
 * 快速排序
 * 通过一趟配许将要排序的数组分割成独立的良部分其中一部分所有的数据都比另外一部分的所有数据要小,
 * 然后再按照此方法对这两部分数据分别进行快速排序,
 * 整个排序过程可以递归进行,以此达到整个数据变成有序序列
 * 有点迷糊
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 6, 4, 1, 0, 2, 9, 10, 8};
        System.out.println(Arrays.toString(arr));

        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(arr, left, right);
            quickSort(arr, left, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, right);
        }
        return arr;
    }

    private static int partition(int[] arr, int left, int right) {
        // 设定基准值（pivot）
        int pivot = left;
        int index = pivot + 1;
        System.out.println(Arrays.toString(arr));
        System.out.println("left = " + left + " | right = " + right);
        System.out.println("pivot = " + pivot + " | index = " + index);

        for (int i = index; i <= right; i++) {
            if (arr[i] < arr[pivot]) {
                AlgorithmMain.swap(arr, i, index);
                index++;
            }
        }
        AlgorithmMain.swap(arr, pivot, index - 1);
        System.out.println(Arrays.toString(arr));
        return index - 1;
    }

    public static int[] theSort(int arr[],int start,int end) {
        int pivot = arr[start];
        int i = start;
        int j = end;
        while (i<j) {
            while ((i<j)&&(arr[j]>pivot)) {
                j--;
            }
            while ((i<j)&&(arr[i]<pivot)) {
                i++;
            }
            if ((arr[i]==arr[j])&&(i<j)) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        if (i-1>start) arr = theSort(arr,start,i-1);
        if (j+1<end) arr = theSort(arr,j+1,end);
        return (arr);
    }

}
