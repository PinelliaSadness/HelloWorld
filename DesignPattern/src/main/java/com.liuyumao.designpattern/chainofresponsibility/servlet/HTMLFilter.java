package com.liuyumao.designpattern.chainofresponsibility.servlet;

public class HTMLFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        request.setMessage(request.getMessage().replaceAll("wsecar.com", "https://www.wsecar.com"));
        System.out.println(this.getClass());

        filterChain.doFilter(request, response);

        response.setMessage(response.getMessage() + "www.wsecar.com");
        System.out.println(this.getClass());
    }
}
