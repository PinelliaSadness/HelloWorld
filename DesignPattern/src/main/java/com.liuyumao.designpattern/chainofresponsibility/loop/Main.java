package com.liuyumao.designpattern.chainofresponsibility.loop;

public class Main {
    public static void main(String[] args) {
//        javax.servlet.Filter
//        javax.servlet.FilterChain
        String msg = "<小姐姐>真好看!来自wsecar.com";

        Request request = new Request();
        request.setMessage(msg);
        Response response = new Response();

        FilterChain filterChain = new FilterChain();

        FilterChain filterChain0 = new FilterChain();
        Filter html = new HTMLFilter();
        filterChain0.addFilter(html);

        FilterChain filterChain1 = new FilterChain();
        Filter sensitive = new SensitiveFilter();
        filterChain1.addFilter(sensitive);

        FilterChain filterChain2 = new FilterChain();
        Filter script = new ScriptFilter();
        filterChain2.addFilter(script);

        filterChain1.addFilter(filterChain2);

        filterChain0.addFilter(filterChain1);

        filterChain.addFilter(filterChain0);

        filterChain.doFilter(request, response, filterChain);

        System.out.println(request.getMessage());
        System.out.println(response.getMessage());

    }
}
