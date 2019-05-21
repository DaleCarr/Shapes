package main;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;

public class Main {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(15,10);
System.out.println(r);
		System.out.println("Rectangle: " + r.noOfSides);
		System.out.println("Area: "+ r.calculateArea());
		System.out.println("Perimeter:" + r.calculatePerimeter());
		
		
		
		Circle c = new Circle(7); 
		System.out.println(c);
		System.out.println("Circle: " + c.noOfSides);
		System.out.println("Area: "+ c.calculateArea());
		System.out.println("Perimeter:" + c.calculatePerimeter());
	}

}
