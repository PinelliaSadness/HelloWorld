package com.liuyumao.designpattern.chainofresponsibility.complex;

public class Main {
    public static void main(String[] args) {
        Message message = new Message();
        String msg = "<小姐姐>真好看!来自wsecar.com";
        message.setMessage(msg);

        FilterChain filterChain = new FilterChain();
        Filter html = new HTMLFilter();
        Filter sensitive = new SensitiveFilter();
        Filter script = new ScriptFilter();

        filterChain.addFilter(html)
                .addFilter(script)
                .addFilter(sensitive);

        filterChain.doFilter(message);

        System.out.println(message.getMessage());

    }
}
