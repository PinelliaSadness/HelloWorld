package com.liuyumao.designpattern.visitor;

public class User extends Visitor {
    @Override
    public void visit(Games games) {
        games.play();
    }

    @Override
    public void visit(Photos photos) {
        System.out.println("没得权限 ...");
    }
}
