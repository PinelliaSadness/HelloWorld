package com.liuyumao.multithreading.chapter1;

public class TryConcurrency {

    public static void main(String[] args) {

        Thread thread = new Thread("READ_THREAD") {
            @Override
            public void run () {
                println(Thread.currentThread().getName());
                readFromDataBase();
            }
        };

        thread.start();

//        thread.run();

//        new Thread("WRITE_THREAD") {
//            @Override
//            public void run () {
//                writeDataTofile();
//            }
//        }.start();

//        readFromDataBase();
//        writeDataTofile();
    }

    private static void readFromDataBase() {
        // 读取数据库
        try {
            println("Begin read data from db.");
            Thread.sleep(1000 * 10L);
            println("Read data done start handle it.");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        println("The data handle finish and successfully.");
    }

    private static void writeDataTofile() {
        // xierushuju
        try {
            println("Begin write data to file.");
            Thread.sleep(2000 * 10L);
            println("Write data done start handle it.");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        println("The data handle finish and successfully.");
    }


    private static void println (String meaasge) {
        System.out.println(meaasge);
    }
}
