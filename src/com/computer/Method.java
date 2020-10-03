package com.computer;

public class Method implements InsertDrawable {

    @Override
    public void Mouse() {
        System.out.println("鼠标功能正常使用！");
    }

    @Override
    public void Keyboard() {
        System.out.println("键盘功能正常使用！");
    }

    @Override
    public void Display() {
        System.out.println("显示器功能正常使用！");
    }

    @Override
    public void Printer() {
        System.out.println("打印机功能正常使用！");
    }
}
