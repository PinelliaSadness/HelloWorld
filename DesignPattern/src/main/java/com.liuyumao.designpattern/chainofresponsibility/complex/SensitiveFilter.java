package com.liuyumao.designpattern.chainofresponsibility.complex;

public class SensitiveFilter implements Filter {
    @Override
    public boolean doFilter(Message msg) {
        msg.setMessage(msg.getMessage().replaceAll("小姐姐", "刘玉茂"));
        msg.setMessage(msg.getMessage().replaceAll("好看", "帅"));
        return true;
    }
}
