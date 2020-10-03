package com.Abstract02;



public class square extends Graphics {

    private int bianchang;

    public square(String brushColour, Boolean fill,int bianchang) {
        super(brushColour, fill);
        this.bianchang = bianchang;
    }

    @Override
    public void area() {
        double Area = 0;
        Area = bianchang*bianchang;
        System.out.println("正方形的面积为："+Area);
    }

    @Override
    public void perimeter() {
        double Perimeter = 0;
        Perimeter = 4*bianchang;
        System.out.println("正方形的周长为："+Perimeter);
    }

    @Override
    public String toString() {
        return "正方形的画笔颜色："+super.BrushColour+
                "\n正方形的填充："+super.Fill+
                "\n正方形的边长："+ bianchang;

    }
}

