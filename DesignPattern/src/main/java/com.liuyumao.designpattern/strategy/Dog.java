package com.liuyumao.designpattern.strategy;

public class Dog implements Compareble<Dog>{

    private int age;

    public Dog(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Dog dog) {
        if (this.age < dog.age){
            return -1;
        } else if (this.age > dog.age) {
            return 1;
        } else {
            return 0;
        }
    }
}
