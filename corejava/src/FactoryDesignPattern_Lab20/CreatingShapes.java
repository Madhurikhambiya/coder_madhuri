package FactoryDesignPattern_Lab20;

import lab_20.Shapes;

public class CreatingShapes {
	public static void main(String[] args) {
		Shapes sp;
		int side;
		sp = ShapeFactory.createShape("Circle");
			side = sp .draw();
			System.out.println("Circle" + side+"sides");
		
			
			sp = ShapeFactory.createShape("Triangle");
			side = sp .draw();
			System.out.println("Triangle" + side+"sides");
			
			
			sp = ShapeFactory.createShape("Square");
			side = sp .draw();
			System.out.println("Square" + side+"sides");
		
		
		
	}

}
