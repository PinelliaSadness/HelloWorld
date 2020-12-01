package com.liuyumao.designpattern.chainofresponsibility.complex;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter{
    private List<Filter> filters = new ArrayList<>();

    public List<Filter> getFilters() {
        return filters;
    }

    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    public FilterChain addFilter(Filter filter){
        this.filters.add(filter);
        return this;
    }

    public FilterChain removeFilter(Filter filter){
        this.filters.remove(filter);
        return this;
    }

    @Override
    public boolean doFilter(Message msg) {
        for (Filter filter : filters){
            if(!filter.doFilter(msg)){
                return false;
            }
        }
        return false;
    }
}
