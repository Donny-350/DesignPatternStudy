package com.zilong.creationalpatterns.AbstractFactoryPattern;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }        
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
