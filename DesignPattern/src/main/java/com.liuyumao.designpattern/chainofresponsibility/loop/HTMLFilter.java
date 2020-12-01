package com.liuyumao.designpattern.chainofresponsibility.loop;

public class HTMLFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        request.setMessage(request.getMessage().replaceAll("wsecar.com", "https://www.wsecar.com"));
        System.out.println(this.getClass());

        filterChain.doFilter(request, response, filterChain);

        response.setMessage(response.getMessage() + "www.wsecar.com");
        System.out.println(this.getClass());
    }
}
