package com.Abstract01;

public class WarShip extends Weapon {
    @Override
    public void attack() {
        System.out.println("军舰发射炮弹！");
    }

    @Override
    public void move() {
        System.out.println("军舰移动了20海里！");
    }
}
