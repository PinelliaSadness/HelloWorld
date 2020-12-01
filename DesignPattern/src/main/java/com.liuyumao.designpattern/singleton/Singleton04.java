package com.liuyumao.designpattern.singleton;

/**
 * 懒汉式
 * 虽然达到了按需初始化的目的,但是带来了线程不安全的问题
 * 带来多线程访问方面的问题
 * 所以我们加上了synchronized,但是这样效率降低,带来性能问题
 */
public class Singleton04 {

    private static Singleton04 INSTANCE;

    private Singleton04(){
    }

    public static synchronized Singleton04 getInstance(){
        if ( null == INSTANCE) {
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Singleton04();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i ++){
            new Thread(() ->{
                System.out.println(Singleton04.getInstance());
            }).start();
        }
    }
}
