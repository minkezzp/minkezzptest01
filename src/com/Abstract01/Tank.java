package com.Abstract01;

public class Tank extends Weapon {
    @Override
    public void attack() {
        System.out.println("坦克发射炮弹！");
    }

    @Override
    public void move() {
        System.out.println("坦克移动战地！");
    }
}
