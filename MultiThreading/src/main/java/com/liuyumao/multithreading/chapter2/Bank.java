package com.liuyumao.multithreading.chapter2;

public class Bank {

    public static void main(String[] args) {
        TicketWindow ticktWindow1 = new TicketWindow("一号柜台");
        ticktWindow1.start();

        TicketWindow ticktWindow2 = new TicketWindow("二号柜台");
        ticktWindow2.start();

        TicketWindow ticktWindow3 = new TicketWindow("三号柜台");
        ticktWindow3.start();
    }

}
