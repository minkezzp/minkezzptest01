package com.Abstract01;

public class Mymain {
    public static void main(String[] args) {
        //用多态创建坦克对象
        Weapon tank = new Tank();
        Weapon flighter = new Flighter();
        //调用坦克重写继承抽象类的方法
        tank.attack();
        tank.move();
        //调用高射炮重写继承抽象类的方法！
        flighter.move();
    }
}
