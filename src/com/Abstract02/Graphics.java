package com.Abstract02;

public abstract class Graphics {
    //画笔颜色
    public String BrushColour;
    //图形填充
    public Boolean Fill;

    public Graphics(String brushColour, Boolean fill) {
        BrushColour = brushColour;
        Fill = fill;
    }
    //获取图形面积的方法
    public void area(){}
    //获取图形周长的方法
    public void perimeter(){}


}
