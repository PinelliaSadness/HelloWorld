package com.liuyumao.algorithm.merge;

import com.liuyumao.algorithm.AlgorithmMain;

import java.util.Arrays;

/**
 * 归并排序
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = AlgorithmMain.getArray(10, 10);
        System.out.println(Arrays.toString(arr));

        arr = theSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] theSort(int[] arr){
        if(arr.length < 2){
            return arr;
        }

        int temp = arr.length / 2;
        int[] leftArr = new int[temp];
        int[] rightArr = new int[arr.length -temp];
        System.arraycopy(arr, 0, leftArr, 0 , leftArr.length);
        System.arraycopy(arr, temp, rightArr, 0 , rightArr.length);

//        System.out.println(Arrays.toString(leftArr));
//        System.out.println(Arrays.toString(rightArr));
        return merge(theSort(leftArr), theSort(rightArr));
    }

    private static int[] merge(int[] leftArr, int[] rightArr){
        int[] result = new int[leftArr.length + rightArr.length];
        int leftP = 0;
        int rightP = 0;
//        System.out.println(Arrays.toString(leftArr));
//        System.out.println(Arrays.toString(rightArr));

        int i=0;
        while (leftP<leftArr.length && rightP<rightArr.length) {
            if (leftArr[leftP] <= rightArr[rightP]) {
                result[i++] = leftArr[leftP++];
            } else{
                result[i++] = rightArr[rightP++];
            }
        }

        while (leftP<leftArr.length) {
            result[i++] = leftArr[leftP++];
        }

        while (rightP<rightArr.length) {
            result[i++] = rightArr[rightP++];
        }

        return result;
    }

}
