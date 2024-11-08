package Overriding;

public class Demo2 {
	public static void main(String[] args) {
		Square  s = new Square();
		System.out.println("area of square ="+ s.CalculaterArea(12));
		Circle c = new Circle();
		System.out.println("area od circle ="+ c.CalculatorArea(1.0));
		Shape shape = new Shape();
		System.out.println(shape.CalculaterArea(0.0));
		
	}

}
