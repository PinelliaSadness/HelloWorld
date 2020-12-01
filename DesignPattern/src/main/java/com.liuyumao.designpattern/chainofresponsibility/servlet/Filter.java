package com.liuyumao.designpattern.chainofresponsibility.servlet;

public interface Filter {
    public void doFilter(Request request, Response response, FilterChain filterChain);
}
