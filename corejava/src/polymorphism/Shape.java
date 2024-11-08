package polymorphism;

public class Shape {
	public int  CalculatorArea(int length , int breath) {
		return length*breath;
	}
	public double CalculatoreArea(double redius) {
		return 3.12*redius* redius;
	}
	public double CalculatorArea(double base, double height) {
		return 0.5 *base*height;
		
	}
	public static void main(String[] args) {
		Shape r = new Shape();
		System.out.println("Area of rectangular ="+r.CalculatorArea(12,23));
		System.out.println("Area of circle ="+r.CalculatoreArea(2.0));
		System.out.println("Area of rectangular ="+r.CalculatorArea(1.0,2.0));
	}

}
