package com.liuyumao.designpattern.chainofresponsibility.loop;

public class SensitiveFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        request.setMessage(request.getMessage().replaceAll("小姐姐", "刘玉茂"));
        request.setMessage(request.getMessage().replaceAll("好看", "帅"));
        System.out.println(this.getClass());

        filterChain.doFilter(request, response, filterChain);

        response.setMessage(response.getMessage() + "996.ICU");
        System.out.println(this.getClass());
    }
}
