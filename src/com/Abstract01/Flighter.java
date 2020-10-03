package com.Abstract01;

public class Flighter extends Weapon {
    @Override
    public void attack() {
        System.out.println("高射炮发射炮弹！");
    }

    @Override
    public void move() {
        System.out.println("高射炮不能移动！");
    }
}
