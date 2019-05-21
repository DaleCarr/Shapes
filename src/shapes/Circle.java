package shapes;

public class Circle extends Shape implements Perimeterable{
	public int radius;
	public Circle(int radius) {
		this.radius = radius;
		this.noOfSides = 1;
	}
	
	
	
	@Override
	public double calculateArea() {
		return Math.PI*(radius*radius);
	}

	@Override
	public double calculatePerimeter() {
	
		return (2*Math.PI) * radius;
	}

}
