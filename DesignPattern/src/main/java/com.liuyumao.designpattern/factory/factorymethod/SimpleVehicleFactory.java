package com.liuyumao.designpattern.factory.factorymethod;

/**
 * 简单工厂的扩展性不好
 */
public class SimpleVehicleFactory {
    public Car createCar(){
        //doSomething
        return new Car();
    }

    public Plane crateBroom(){
        return new Plane();
    }
}
