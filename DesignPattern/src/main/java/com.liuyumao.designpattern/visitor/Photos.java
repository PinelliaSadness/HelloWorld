package com.liuyumao.designpattern.visitor;

public class Photos extends Computer{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void watch(){
        System.out.println("watch photos ...");
    }
}
