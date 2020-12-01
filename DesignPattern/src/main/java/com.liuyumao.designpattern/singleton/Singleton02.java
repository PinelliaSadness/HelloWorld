package com.liuyumao.designpattern.singleton;

/**
 * 和第一种方法是一个意思
 */
public class Singleton02 {

    private static final Singleton02 INSTANCE;

    static {
        INSTANCE = new Singleton02();
    }

    private Singleton02(){
    }

    public static Singleton02 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i ++){
            new Thread(() ->{
                System.out.println(Singleton02.getInstance());
            }).start();
        }
    }
}
