package com.liuyumao.designpattern.strategy;

import java.util.Arrays;

/**
 * 对扩展开放,对修改关闭
 */
public class Main {
    public static void main(String[] args) {
//        int[] a = {9, 5, 4, 4, 7, 2, 1, 8, 6};
//        Dog[] a = {new Dog(1), new Dog( 5), new Dog( 4)};
        Cat[] a = {new Cat(1, 1), new Cat(5, 5), new Cat( 4, 4)};
        Sorter<Cat> sorter = new Sorter<>();
        sorter.sort(a, new CatWeightComparator());
        System.out.println(Arrays.toString(a));
    }
}
