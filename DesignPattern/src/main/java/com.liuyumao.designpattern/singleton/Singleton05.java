package com.liuyumao.designpattern.singleton;

/**
 * 懒汉式
 * 虽然达到了按需初始化的目的,但是带来了线程不安全的问题
 * 带来多线程访问方面的问题
 * 所以我们加上了synchronized,但是这样效率降低,带来性能问题
 * 然后减小同步代码块,又出现了线程不安全的问题
 */
public class Singleton05 {

    private static Singleton05 INSTANCE;

    private Singleton05(){
    }

    public static Singleton05 getInstance(){
        if ( null == INSTANCE) {
            // 妄图通过减小同步代码块的方式提高效率,但是这种方式是不可行的
            // 和第三种方案的问题一样
            synchronized (Singleton05.class) {
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new Singleton05();
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i ++){
            new Thread(() ->{
                System.out.println(Singleton05.getInstance());
            }).start();
        }
    }
}
