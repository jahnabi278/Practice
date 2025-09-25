package com.terra.app.sd.factory.f;

/**
 * 
 * Define an interface for creating an object, but let subclasses decide which
 * class to instantiate
 *
 */
public interface Shape {
	void draw();
}

class Circle implements Shape {
	@Override
	public void draw() {
		System.out.println("Drawing Circle");
	}
}

class Square implements Shape {
	@Override
	public void draw() {
		System.out.println("Drawing Square");
	}
}

class ShapeFactory {
	public Shape getShape(String shape) {
		if (shape.equalsIgnoreCase("circle")) {
			return new Circle();
		} else if (shape.equalsIgnoreCase("square")) {
			return new Square();
		}
		return null;
	}
}

class Main {
	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		Shape shape1 = factory.getShape("circle");
		shape1.draw();
	}
}