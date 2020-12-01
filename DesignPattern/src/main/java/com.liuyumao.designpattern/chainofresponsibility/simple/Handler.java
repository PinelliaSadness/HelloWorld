package com.liuyumao.designpattern.chainofresponsibility.simple;

/**
 * 抽象责任链
 */
public abstract class Handler {
    private Handler nextHandler;

    private int number;

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public final void doHandler(int number){
        if (this.number == number) {
            System.out.println("处理器" + this.getClass() + "处理");
        } else {
            if (null != this.getNextHandler()){
                this.nextHandler.doHandler(number);
            } else {
                System.out.println("没有合适的处理器");
            }
        }
    }
}
