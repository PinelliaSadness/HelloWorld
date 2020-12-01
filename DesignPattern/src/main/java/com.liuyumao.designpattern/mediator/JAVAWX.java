package com.liuyumao.designpattern.mediator;

public class JAVAWX implements MediatorWX{

    private ZhangSan zhangSan;

    private LiSi liSi;

    public ZhangSan getZhangSan() {
        return zhangSan;
    }

    public void setZhangSan(ZhangSan zhangSan) {
        this.zhangSan = zhangSan;
    }

    public LiSi getLiSi() {
        return liSi;
    }

    public void setLiSi(LiSi liSi) {
        this.liSi = liSi;
    }

    @Override
    public void exchange(Person person, String message) {
        if (zhangSan.equals(person)) {
            zhangSan.talk(message);
        } else if (liSi.equals(person)){
            liSi.talk(message);
        }
    }
}
