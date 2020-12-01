package com.liuyumao.designpattern.chainofresponsibility.simple;

/**
 * 责任链模式
 * 这种模式感觉挺适合我们项目,里面if/else太多了
 * javax.complex.filter 的责任链模式比这个复杂,需要去看一下
 */
public class Main {
    public static void main(String[] args) {
        Handler handlerA = new HandlerA();
        Handler handlerB = new HandlerB();
        Handler handlerC = new HandlerC();

        handlerA.setNumber(10);
        handlerB.setNumber(20);
        handlerC.setNumber(30);

        handlerA.setNextHandler(handlerB);
        handlerB.setNextHandler(handlerC);

        handlerA.doHandler(10);
        handlerA.doHandler(20);
        handlerA.doHandler(50);
    }
}
