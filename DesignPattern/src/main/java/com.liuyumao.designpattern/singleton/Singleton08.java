package com.liuyumao.designpattern.singleton;

/**
 * 不仅可以解决线程同步问题,还可以防止反序列化
 * 枚举类没有构造方法,避免了Class.forName()
 */
public enum Singleton08 {

    INSTANCE;

    public void doSomething(){
        //
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i ++){
            new Thread(() ->{
                System.out.println(Singleton08.INSTANCE);
            }).start();
        }
    }
}
