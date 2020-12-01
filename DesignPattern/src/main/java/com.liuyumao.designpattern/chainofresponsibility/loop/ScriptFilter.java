package com.liuyumao.designpattern.chainofresponsibility.loop;

public class ScriptFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        request.setMessage(request.getMessage().replaceAll("<", "["));
        request.setMessage(request.getMessage().replaceAll(">", "]"));
        System.out.println(this.getClass());

        filterChain.doFilter(request, response, filterChain);

        response.setMessage(response.getMessage() + "<script>");
        System.out.println(this.getClass());
    }
}
