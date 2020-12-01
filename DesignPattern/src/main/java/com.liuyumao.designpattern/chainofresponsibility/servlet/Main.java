package com.liuyumao.designpattern.chainofresponsibility.servlet;

public class Main {
    public static void main(String[] args) {
//        javax.servlet.Filter
//        javax.servlet.FilterChain
        String msg = "<小姐姐>真好看!来自wsecar.com";

        Request request = new Request();
        request.setMessage(msg);

        Response response = new Response();

        FilterChain filterChain = new FilterChain();
        Filter html = new HTMLFilter();
        Filter sensitive = new SensitiveFilter();
        Filter script = new ScriptFilter();

        filterChain.addFilter(html)
                .addFilter(sensitive)
                .addFilter(script);

        filterChain.doFilter(request, response);

        System.out.println(request.getMessage());
        System.out.println(response.getMessage());

    }
}
