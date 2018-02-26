package com.wpx.demo25;

import java.util.Hashtable;

public class ShapeCache {

	private static Hashtable<String,Shape> shapeMap = new Hashtable<String,Shape>();

	public static Shape getShape(String shapeId) {
		Shape cacheShape = shapeMap.get(shapeId);
		return (Shape)cacheShape.clone();
	}
	public static void loadCache() {
		Circle circle = new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);
		
		Square square = new Square();
		square.setId("2");
		shapeMap.put(square.getId(), square);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		shapeMap.put(rectangle.getId(), rectangle);
	}
}
