package com.liuyumao.designpattern.chainofresponsibility.complex;

public class HTMLFilter implements Filter {
    @Override
    public boolean doFilter(Message msg) {
        msg.setMessage(msg.getMessage().replaceAll("wsecar.com", "https://www.wsecar.com"));
        return true;
    }
}
