package com.liuyumao.designpattern.factory.factorymethod;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.go();
//        Moveable moveable = new Car();
//        moveable.go();
        Moveable moveable = new CarFactory().create();
        moveable.go();
    }
}
