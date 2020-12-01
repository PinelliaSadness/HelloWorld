package com.liuyumao.designpattern.visitor;

public class Administrators extends Visitor{
    @Override
    public void visit(Games games) {
        games.play();
    }

    @Override
    public void visit(Photos photos) {
        photos.watch();
    }
}
