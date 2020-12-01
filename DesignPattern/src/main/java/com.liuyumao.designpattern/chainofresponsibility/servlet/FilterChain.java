package com.liuyumao.designpattern.chainofresponsibility.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FilterChain{
    private List<Filter> filters = new ArrayList<>();

    private Iterator<Filter> iterators;

    public List<Filter> getFilters() {
        return filters;
    }

    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    public Iterator<Filter> getIterators() {
        return iterators;
    }

    public void setIterators(Iterator<Filter> iterators) {
        this.iterators = iterators;
    }

    public FilterChain addFilter(Filter filter){
        this.filters.add(filter);
        return this;
    }

    public FilterChain removeFilter(Filter filter){
        this.filters.remove(filter);
        return this;
    }

    public void doFilter(Request request, Response response) {
        if (null == iterators){
            iterators = filters.iterator();
        }

        if (iterators.hasNext()){
            Filter filter = iterators.next();
            filter.doFilter(request, response, this);
        }

    }
}
