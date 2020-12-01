package com.liuyumao.multithreading.chapter2;

public class TaxCalculatorMain {

    public static void main(String[] args) {

//        TaxCalculator taxCalculator = new TaxCalculator(10000D, 2000D){
//            @Override
//            protected double calcTax() {
//                return getSalary() * 0.1 + getBonus() * 0.15;
//            }
//        };
//
//        double tax = taxCalculator.calculate();
//        System.out.println(tax);


        TaxCalculator taxCalculator = new TaxCalculator(10000D, 2000D);

//        SimpleCalculatorStrategy simpleCalculatorStrategy = new SimpleCalculatorStrategy();
//        taxCalculator.setCalculatorStrategy(simpleCalculatorStrategy);

//        taxCalculator.setCalculatorStrategy((s, b) -> s * 0.1 + b * 0.15);

        System.out.println(taxCalculator.calculate());


    }
}
