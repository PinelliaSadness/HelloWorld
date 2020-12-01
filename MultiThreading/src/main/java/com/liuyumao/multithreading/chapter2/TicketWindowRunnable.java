package com.liuyumao.multithreading.chapter2;

public class TicketWindowRunnable implements Runnable{

    private static int index = 1;

    private static int MAX = 50;

    @Override
    public void run() {
        while (index <= MAX) {
            System.out.println(Thread.currentThread() + "当前的号码是:" + index++ );
//            try {
//                Thread.sleep(10L);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
