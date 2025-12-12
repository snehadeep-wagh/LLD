package FactoryDesignPattern.Factory;

import FactoryDesignPattern.Shapes.Circle;
import FactoryDesignPattern.Shapes.Rectangle;
import FactoryDesignPattern.Shapes.Shape;
import FactoryDesignPattern.Shapes.Square;

public class ShapeFactory {
    public Shape getShape(String shape) {
        if (shape.equals("Circle")) {
            return new Circle();
        } else if (shape.equals("Square")) {
            return new Square();
        }else if(shape.equals("Rectangle")){
            return new Rectangle();
        }

        return null;
    }
}
