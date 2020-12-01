package com.liuyumao.designpattern.visitor;

public class Main {
    public static void main(String[] args) {
        // 创建一个结构对象
        ObjectStructure objectStructure = new ObjectStructure();

        // 个特结构对下个增加节点
        objectStructure.add(new Games());
        objectStructure.add(new Photos());

        // 创建一个访问者
        Visitor administrators = new Administrators();
        objectStructure.action(administrators);

        // 创建一个访问者
        Visitor user = new User();
        objectStructure.action(user);
    }
}
