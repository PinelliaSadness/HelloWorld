package com.liuyumao.designpattern.visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {

    private List<Computer> computers = new ArrayList<>();

    public void action(Visitor visitor){
        computers.forEach(computer -> {
            computer.accept(visitor);
        });
    }

    public void add(Computer computer){
        computers.add(computer);
    }
}
