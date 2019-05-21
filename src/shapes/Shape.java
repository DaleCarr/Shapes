package shapes;

public abstract class Shape {
	public int noOfSides;
	public abstract double calculateArea();
	
	@Override
	public String toString() {
		return "This is a Shape with " + noOfSides + " sides.";
	}
}
