package com.liuyumao.designpattern.factory.factorymethod;

public class CarFactory {
    public Moveable create(){
        System.out.println("doSomething");
        return new Car();
    }
}
