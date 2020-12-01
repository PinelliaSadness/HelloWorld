package com.liuyumao.designpattern.strategy;

public class Sorter<T> {
    public void sort(T[] arr, Comparator<T> comparator) {
        for (int i = 0; i < arr.length - 1; i ++){
            int tmp = i;
            for (int j = i + 1; j < arr.length; j ++) {
                tmp = comparator.compare(arr[i], arr[j]) == -1 ? j : i;
                // 如果前面的比后面的,那么swap(arr, i, j) 交换位置,否则什么也不发生
                swap(arr, i, tmp);
            }
        }
    }

    private void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
