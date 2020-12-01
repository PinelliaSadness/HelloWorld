package com.liuyumao.designpattern.mediator;

public class Main {
    public static void main(String[] args) {
        JAVAWX wx = new JAVAWX();
        ZhangSan zhangSan = new ZhangSan("张三", wx);
        LiSi liSi = new LiSi("李四", wx);
        wx.setZhangSan(zhangSan);
        wx.setLiSi(liSi);
        zhangSan.talk("你好,我是张三!");
        liSi.talk("你好,我是李四!");
    }
}
