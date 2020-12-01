package com.liuyumao.designpattern.mediator;

/**
 * 具体的人类
 */
public class LiSi extends Person {
    LiSi(String name, MediatorWX mediatorWX) {
        super(name, mediatorWX);
    }

    void exchange(String message){
        mediatorWX.exchange(this, message);
    }

    void talk(String message){
        System.out.println(name + "说: " + message);
    }

}
