package com.liuyumao.designpattern.mediator;

/**
 * 抽象的人类
 */
public abstract class Person {

    String name;

    MediatorWX mediatorWX;

    Person(String name, MediatorWX mediatorWX){
        this.name = name;
        this.mediatorWX = mediatorWX;
    }
}
