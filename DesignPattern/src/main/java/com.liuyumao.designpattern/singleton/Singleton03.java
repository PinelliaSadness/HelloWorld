package com.liuyumao.designpattern.singleton;

/**
 * 懒汉式
 * 虽然达到了按需初始化的目的,但是带来了线程不安全的问题
 * 带来多线程访问方面的问题
 */
public class Singleton03 {

    private static Singleton03 INSTANCE;

    private Singleton03(){
    }

    public static Singleton03 getInstance(){
        if ( null == INSTANCE) {
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Singleton03();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i ++){
            new Thread(() ->{
                System.out.println(Singleton03.getInstance());
            }).start();
        }
    }
}
