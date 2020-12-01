package com.liuyumao.designpattern.factory.factorymethod;

public class PlaneFactory{

    public Moveable create() {
        return new Plane();
    }
}
