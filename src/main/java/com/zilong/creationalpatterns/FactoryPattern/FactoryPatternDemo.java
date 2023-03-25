package com.zilong.creationalpatterns.FactoryPattern;

public class FactoryPatternDemo {
    
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //获取Circle的对象，并调用它的draw方法
        Shape circle = shapeFactory.getShape("CIRCLE");

        //调用Circled的draw方法
        circle.draw();

        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
 
        //调用 Rectangle 的 draw 方法
        rectangle.draw();
 
        //获取 Square 的对象，并调用它的 draw 方法
        Shape square = shapeFactory.getShape("SQUARE");
 
        //调用 Square 的 draw 方法
        square.draw();
    }
}
