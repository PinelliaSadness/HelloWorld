package com.liuyumao.designpattern.factory.abstractfactory;

public class Main {
    public static void main(String[] args) {
        // 形容词用接口,名词用抽象类
        // 这是一个产品族的概念
        // 不仅有魔法世界的,现代社会的,还有火星世界
        AbstractFactory abstractFactory = new ModernFactory();
        Vehicle vehicle = abstractFactory.createVehicle();
        Weapon weapon = abstractFactory.createWeapon();
        Food food = abstractFactory.createFood();


//        Car car = new Car();
//        car.go();
//        Gun gun = new Gun();
//        gun.fire();
//        Bread bread = new Bread();
//        bread.printName();
    }
}
