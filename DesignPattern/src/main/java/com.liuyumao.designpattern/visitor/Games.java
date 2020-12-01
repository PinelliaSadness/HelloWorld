package com.liuyumao.designpattern.visitor;

public class Games extends Computer {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void play(){
        System.out.println("play games ...");
    }
}
