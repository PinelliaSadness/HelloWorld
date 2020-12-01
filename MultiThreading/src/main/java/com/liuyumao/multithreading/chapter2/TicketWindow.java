package com.liuyumao.multithreading.chapter2;

public class TicketWindow extends Thread{

    private static String name;

    private static final int MAX = 50;

    private int index = 1;

    public TicketWindow(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (index <= MAX){
            System.out.println("柜台名称:" + name + "当前的号码是:" + index++ );
        }
    }
}
