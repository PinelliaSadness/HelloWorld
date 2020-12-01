package com.liuyumao.designpattern.chainofresponsibility.loop;

public interface Filter {
    public void doFilter(Request request, Response response, FilterChain filterChain);
}
