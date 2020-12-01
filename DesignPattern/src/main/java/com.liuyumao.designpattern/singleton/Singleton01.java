package com.liuyumao.designpattern.singleton;

/**
 * 饿汉式
 * 类加载到内存后,就实例化一个对象,JVM保证线程安全
 * 简单粗暴实用,推荐使用.
 * 唯一缺点:不管使用与否,类加载就完成实例化
 */
public class Singleton01 {

    private static final Singleton01 INSTANCE = new Singleton01();

    private Singleton01(){
    }

    public static Singleton01 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i ++){
            new Thread(() ->{
                System.out.println(Singleton01.getInstance());
            }).start();
        }
    }
}
