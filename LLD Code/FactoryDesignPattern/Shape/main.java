package FactoryDesignPattern;

import FactoryDesignPattern.Factory.ShapeFactory;

public class main {
    public static void main(String args[]){
        ShapeFactory shapeFactory = new ShapeFactory();

        shapeFactory.getShape("Rectangle").draw();
    }
}
