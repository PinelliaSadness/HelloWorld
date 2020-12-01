package com.liuyumao.designpattern.visitor;

/**
 * 假设有一台电脑,有两个账户(访问者),其中一个是管理员账户,有所有权限,能玩游戏能看图片
 * 一个是用户账户,只能玩游戏,不能看图片
 * 访问者模式
 */
public abstract class Visitor {

    public abstract void visit(Games games);

    public abstract void visit(Photos photos);
}
