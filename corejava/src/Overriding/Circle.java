package Overriding;

public class Circle extends Shape{
   @Override
	public double CalculatorArea(double radius) {
		return 3.14*radius*radius;
	}
	

}
