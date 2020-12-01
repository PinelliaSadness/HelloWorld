package com.liuyumao.multithreading.chapter1;

public class TemplateMethod {

    public final void print (String message){
        System.out.println("##############");
        wrapPrint(message);
        System.out.println("##############");
    }

    protected void wrapPrint(String message) {

    }

    public static void main(String[] args) {
        TemplateMethod templateMethod1 = new TemplateMethod() {
            @Override
            protected void wrapPrint(String message) {
                System.out.println("*" + message + "*");
            }
        };

        templateMethod1.print("Hello Thread");

        TemplateMethod templateMethod2 = new TemplateMethod() {
            @Override
            protected void wrapPrint(String message) {
                System.out.println("|" + message + "|");
            }
        };

        templateMethod2.print("Hello Thread");
    }
}
