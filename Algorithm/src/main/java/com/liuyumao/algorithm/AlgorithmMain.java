package com.liuyumao.algorithm;

import com.liuyumao.algorithm.quick.QuickSort;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Random;

public class AlgorithmMain {

    private static final Logger LOGGER = LoggerFactory.getLogger(AlgorithmMain.class);

    private static final int count = 1000000;
    private static final int range = 1000;

    public static void main(String[] args) {
        for (int i=0; i<10; i++){
            new Thread(() -> {
                check();
            }).start();
        }
    }

    private static void check(){
        // 获取两个一样的数组
        int[] arr = getArray(count, range);
        int[] arr1 = new int[count];
        System.arraycopy(arr,0, arr1, 0, arr.length);

        // 系统自己的排序方法
        Arrays.sort(arr);

        // 选择
//        SelectionSort.theSort(arr1);
        // 冒泡
//        BubbleSort.theSort(arr1);
        // 插入
//        InsertionSort.theSort(arr1);
        // 希尔
//        ShellSort.theSort(arr1);
        // 归并
//        arr1 = MergeSort.theSort(arr1);
        //快速
        QuickSort.quickSort(arr1, 0, arr1.length-1);

        boolean isTrue = true;
        for (int i=0; i<count; i++) {
            if (arr[i] != arr1[i]) {
                isTrue = false;
                LOGGER.info("i = {} | arr[i] ={} | arr1[i] = {}", i, arr[i], arr1[i]);
            }
        }

        LOGGER.info("算法是否正确 = {}", isTrue);
    }


    public static int[] getArray(int count, int range) {
        Random random = new Random();

        int[] arr = new int[count];
        for (int i=0; i<count; i++) {
            arr[i] = random.nextInt(range);
        }

        return arr;
    }

    public static void swap(int[] arr, int i, int minPos) {
        int temp = arr[i];
        arr[i] = arr[minPos];
        arr[minPos] = temp;
    }
}
