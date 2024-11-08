package FactoryDesignPattern_Lab20;

import lab_20.Circle;
import lab_20.Shapes;
import lab_20.Square;
import lab_20.Triangle;

public class ShapeFactory {
	public static Shapes createShape(String str) {
		if(str.trim().equalsIgnoreCase("Circle")) {
			return new Circle();
		}
		else if(str.trim().equalsIgnoreCase("Triangle")) {
			return new Triangle();
		}
		else if(str.trim().equalsIgnoreCase("Square")) {
			return new Square();
		}
		else {
			return null;
		}
		
	}

}
