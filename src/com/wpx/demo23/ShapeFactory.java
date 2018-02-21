package com.wpx.demo23;

public class ShapeFactory {
	
	public  Shape getShape(String shapeType) {
		if(shapeType == null) {
			return null;
		}
		if(shapeType.equalsIgnoreCase("circle")) {
			return new Circle();
		}else if(shapeType.equalsIgnoreCase("square")) {
			return new Square();
		}else if(shapeType.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}
		return null;
	}
	
}
