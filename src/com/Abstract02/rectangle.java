package com.Abstract02;



public class rectangle extends Graphics {

    private int chang;
    private int kuan;

    public rectangle(String brushColour, Boolean fill,int chang,int kuan) {
        super(brushColour, fill);
        this.chang = chang;
        this.kuan = kuan;
    }

    @Override
    public void area() {
        double Area = 0;
        Area = chang*kuan;
        System.out.println("长方形的面积为："+Area);
    }

    @Override
    public void perimeter() {
        double Perimeter = 0;
        Perimeter = 2*(chang+kuan);
        System.out.println("长方形的周长为："+Perimeter);
    }

    @Override
    public String toString() {
        return "长方形的画笔颜色："+super.BrushColour+
                "\n长方形的填充："+super.Fill+
                "\n长方形的长："+ chang+
                "\n长方形的宽："+kuan;
    }
}

