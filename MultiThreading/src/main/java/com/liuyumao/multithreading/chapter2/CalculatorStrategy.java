package com.liuyumao.multithreading.chapter2;

@FunctionalInterface
public interface CalculatorStrategy {

    double calculate(double salary, double bonus);
}
