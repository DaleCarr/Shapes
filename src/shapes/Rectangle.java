package shapes;

public class Rectangle extends Shape implements Perimeterable{
public int height;
public int width;

public Rectangle(int height, int width) {
	this.height = height;
	this.width = width;
	this.noOfSides = 4;

}

@Override
public String toString() {
	return "This is a Rectangle with " + noOfSides + " sides.";
}

@Override
public double calculateArea() {
	
	return width *height;
}

@Override
public double calculatePerimeter() {
	return (width*2) + (height*2);
}
}
