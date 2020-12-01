package com.liuyumao.designpattern.chainofresponsibility.complex;

public class ScriptFilter implements Filter {
    @Override
    public boolean doFilter(Message msg) {
        msg.setMessage(msg.getMessage().replaceAll("<", "["));
        msg.setMessage(msg.getMessage().replaceAll(">", "]"));
        return false;
    }
}
