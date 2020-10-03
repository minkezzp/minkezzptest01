package com.Abstract02;

public class MyApp {
    public static void main(String[] args) {
        //画一个绿色、有填充、半径为3.0的圆形；
        Graphics circle = new circle("green",true,3);
        //画一个红色、无填充、长和宽分别为10.0与5.0的长方形；
        Graphics rectangle = new rectangle("red",false,10,5);
        //画一个黄色、无填充、边长为4.0的正方形；
        Graphics square = new square("yellow",false,4);
        //圆的信息
        circle.area();
        circle.perimeter();
        System.out.println(circle);
        System.out.println("=========================================");
        //长方形的信息
        rectangle.area();
        rectangle.perimeter();
        System.out.println(rectangle);
        System.out.println("=========================================");
        //正方形的信息
        square.area();
        square.perimeter();
        System.out.println(square);
    }
}
