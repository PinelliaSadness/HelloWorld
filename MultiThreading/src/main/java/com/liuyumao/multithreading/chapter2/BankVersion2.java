package com.liuyumao.multithreading.chapter2;

public class BankVersion2 {

    public static void main(String[] args) {
        final TicketWindowRunnable ticketWindowRunnable = new TicketWindowRunnable();

        Thread windowThread1 = new Thread(ticketWindowRunnable, "一号窗口");
        Thread windowThread2 = new Thread(ticketWindowRunnable, "二号窗口");
        Thread windowThread3 = new Thread(ticketWindowRunnable, "三号窗口");

        windowThread1.start();
        windowThread2.start();
        windowThread3.start();
    }
}
