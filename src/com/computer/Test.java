package com.computer;

public class Test {
    public static void main(String[] args) {
        InsertDrawable m = new Method();
        Computer computer = new Computer();
        computer.setInsertDrawable(m);
        computer.getInsertDrawable().Mouse();
        computer.getInsertDrawable().Keyboard();
        computer.getInsertDrawable().Display();
        computer.getInsertDrawable().Printer();
        }
}
