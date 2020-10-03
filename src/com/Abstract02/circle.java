package com.Abstract02;

public class circle extends Graphics {

    private int banjin;

    public circle(String brushColour, Boolean fill,int banjin) {
        super(brushColour, fill);
        this.banjin =banjin;
    }

    @Override
    public void area() {
        double Area = 0;
        Area = Math.PI*banjin*banjin;
        System.out.println("圆的面积为："+Area);
    }

    @Override
    public void perimeter() {
        double Perimeter = 0;
        Perimeter = Math.PI*banjin*2;
        System.out.println("圆的周长为："+Perimeter);
    }

    @Override
    public String toString() {
        return "圆的画笔颜色："+super.BrushColour+
                "\n圆的填充："+super.Fill+
                "\n圆的半径："+ banjin;
    }
}
